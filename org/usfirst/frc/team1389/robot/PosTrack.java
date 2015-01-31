package org.usfirst.frc.team1389.robot;

import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.kauailabs.nav6.frc.BufferingSerialPort;
import com.kauailabs.nav6.frc.IMU;
import com.kauailabs.nav6.frc.IMUAdvanced;


public class PosTrack extends Component{

	
	BufferingSerialPort serial_port = Robot.state.serial_port;
    IMUAdvanced imu = Robot.state.imu;

	Timer time = Robot.state.time;
	double dt = 0;
	double t1 = 0;
	double aX, aY, velX, velY, posX, posY;
	double distance;
	public PosTrack(){
		time = Robot.state.time;
		velX=0;
		velY=0;
		posX=0;
		posY=0;
		distance=0;
	}
	
	@Override
	public void teleopTick() {
		dt = (float) (time.get() - t1);
		t1 = (float) time.get();
		
		aX = (float) (imu.getWorldLinearAccelX() * 9.8 * Math.cos(Math.toRadians(imu.getCompassHeading()) + imu.getWorldLinearAccelY() * 9.8 * Math.cos(Math.toRadians(imu.getCompassHeading()))));
		aY = (float) (imu.getWorldLinearAccelX() * 9.8 * Math.sin(Math.toRadians(imu.getCompassHeading()) + imu.getWorldLinearAccelY() * 9.8 * Math.sin(Math.toRadians(imu.getCompassHeading()))));
		
		velX += aX * dt;
		velY += aY * dt;
		
		
		//Double integrate accelerometer readings (dx = Vdt + 1/2at^2)
		posX += (velX * dt) + (.5 * aX * Math.pow(dt, 2));
		posY += (velY * dt) + (.5 * aY * Math.pow(dt, 2));
		
		distance=Math.sqrt((posX*posX)+(posY*posY));
		
		SmartDashboard.putNumber("distance", distance);
		SmartDashboard.putNumber("velX", velX);
		SmartDashboard.putNumber("velY", velY);
		SmartDashboard.putNumber("X Displacment", posX);
		SmartDashboard.putNumber("Y Displacment", posY);
		SmartDashboard.putNumber("accelX", aX);
		SmartDashboard.putNumber("accelY", aY);
		SmartDashboard.putNumber("dt", dt);
		SmartDashboard.putNumber("t1", t1);
	}

	
	@Override
	public void autonTick() {
		teleopTick();
	}


}
