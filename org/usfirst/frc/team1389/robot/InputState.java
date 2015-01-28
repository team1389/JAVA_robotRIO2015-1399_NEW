package org.usfirst.frc.team1389.robot;

import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;

public class InputState implements Cloneable{
	private XBoxController drive;
	private XBoxController manip;
	
	private Encoder encoder1;
	private Encoder encoder2;
	
	private AnalogAccelerometer accelerometer;
	private Gyro gyro;
	
	private DigitalInput limit1;
	private DigitalInput limit2;
	
	
	private DigitalInput[] infared;
	
	public InputState(){
		accelerometer= new AnalogAccelerometer(Constants.ACCCEL);
		gyro = new Gyro(Constants.GYRO);
		
		drive = new XBoxController(Constants.DRIVE_JOY);
		manip = new XBoxController(Constants.MANIP_JOY);
		
		encoder1 = new Encoder(Constants.ENCODER_1A,Constants.ENCODER_1B);
		encoder2 = new Encoder(Constants.ENCODER_2A,Constants.ENCODER_2B);
		
		limit1 = new DigitalInput(Constants.LIMIT_ONE);
		limit2 = new DigitalInput(Constants.LIMIT_TWO);
		
		infared = new DigitalInput[5];
		
		infared[0]= new DigitalInput(Constants.INFRARED_ONE);
		infared[1]= new DigitalInput(Constants.INFRARED_TWO);
		infared[2]= new DigitalInput(Constants.INFRARED_THREE);
		infared[3]= new DigitalInput(Constants.INFRARED_FOUR);
		infared[4]= new DigitalInput(Constants.INFRARED_FIVE);
	}
	
	public void tick() {
		drive.tick();
		//TODO
	}
	 protected InputState clone() throws CloneNotSupportedException {
	        InputState newState = (InputState) super.clone();
	        newState.drive = drive.clone();
	        newState.manip = manip.clone();
	        return newState;
	 }
	 

	public AnalogAccelerometer getAccelerometer() {
		return accelerometer;
	}

	public DigitalInput[] getInfared() {
		return infared;
	}

	public DigitalInput getLimit1() {
		return limit1;
	}

	public DigitalInput getLimit2() {
		return limit2;
	}

	public XBoxController getDrive() {
		return drive;
	}

	public XBoxController getManip() {
		return manip;
	}

	public Encoder getEncoder1() {
		return encoder1;
	}

	public Encoder getEncoder2() {
		return encoder2;
	}


}
