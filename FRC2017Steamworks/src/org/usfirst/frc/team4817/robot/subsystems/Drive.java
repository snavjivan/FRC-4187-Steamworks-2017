package org.usfirst.frc.team4817.robot.subsystems;

import org.usfirst.frc.team4817.robot.RobotMap;

//import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive; 
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.Spark;
/**
 *
 */
public class Drive extends Subsystem {
	RobotDrive driving; 
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public Drive(){
		super("Drive"); 
		driving= new RobotDrive(RobotMap.driveLeftMotor, RobotMap.driveRightMotor);
		
	}
	public void tankDrive(double left, double right){
		driving.tankDrive(left,right);
	}
	
	public void driveStraight(double speed){
		driving.tankDrive(speed,speed);
		
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
  //      setDefaultCommand(new Joystick());
    }
}

