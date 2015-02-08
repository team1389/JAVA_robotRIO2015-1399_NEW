
package org.usfirst.frc.team1389.robot;


/** KNOWN CONTROLS
 * ---------------------------------------DRIVE STICK -----------------------------------------------------
 * Left Analog X: Turn drive train
 * Left Analog Y: Speed of drive train
 * 
 * 
 * 
 * 
 * ---------------------------------------MANIP STICK -----------------------------------------------------
 * Left Analog Y: Move elevator up and down (within bounds of IR sensor 1 of 5 and IR sensor 5 of 5)
 * A Button: Move elevator to IR sensor 2 of 5
 * X Button: Move elevator to IR sensor 3 of 5
 * B Button: Move elevator to IR sensor 4 of 5 
 * 
 * 
 * @author Paul LoBuglio
 */

public class Constants {
	//Joystick input values
	static final int ButtonX 			  = 3; // XBox Controller X Button number for getRawButton= or getRawAxis=
	static final int ButtonA			  = 1; // XBox Controller A Button number
	static final int ButtonB			  = 2; // XBox Controller B Button number
	static final int ButtonY			  = 4; // XBox Controller Y Button number
	static final int BumperL			  = 5; // XBox Controller  Left Bumper number
	static final int BumperR			  = 6; // XBox Controller Right Bumper number
	
	static final int LeftY				  = 1; // XBox Controller  Left Y Axis number
	static final int LeftX				  = 0; // XBox Controller  Left X Axis number
	static final int LeftTrigger		  = 3; // XBox Controller  Left Trigger Axis number
	static final int RightTrigger	      = 4; // XBox Controller  Right Trigger Axis number
	static final int RightY			 	  = 5; // XBox Controller Right Y Axis number
	static final int RightX				  = 4; // XBox Controller Right X Axis number

	//Motor PWM ports
	static final int RIGHT_PWM_DRIVE          = 0;
	static final int LEFT_PWM_DRIVE           = 1;
	static final int ELEVATOR_ONE_PWM         = 2;
	static final int ELEVATOR_TWO_PWM         = 3;
	static final int CENTER_PWM 			  = 4;
	
	//Joystick USB ports
	static final int DRIVE_JOY            = 0;
	static final int MANIP_JOY            = 1;
	
	//IR Sensor Digital Ports
	static final int INFRARED_ONE         = 0;
	static final int INFRARED_TWO         = 1;
	static final int INFRARED_THREE       = 2;
	static final int INFRARED_FOUR        = 3;
	static final int INFRARED_FIVE        = 4;
	//static final int CONTACT_SENSE        = 2;
	
	//Encoder Digital Ports
	static final int ENCODER_1A           = 7;
	static final int ENCODER_1B           = 6;
	static final int ENCODER_2A           = 8;
	static final int ENCODER_2B           = 9;

	//Values
	static final float LIMITER            = (float) 1.42; //Approximately sqrt(2)
	static final float INCHES_PER_ROT     = (float) 12.5663706144;
	static final float ELEVATOR_SPEED_MOD = 1;
	static final int ELEVATOR_MAX_HEIGHT = 4;
	static final double MAX_ACCELERATION   = 0.002;
	static final double PERCENT_POWER_CHANGE = 0.025;


}