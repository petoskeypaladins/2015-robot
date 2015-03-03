
package org.usfirst.frc.team3618.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3618.robot.Robot;

/**
 *
 */
public class TestDriveCommand extends Command {

    public TestDriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.chassisSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	    
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.oi.toggleZAxis.get() == true) {
    		Robot.chassisSubsystem.DriveMe(Robot.oi.stick, 0.75);
    	} else {
    		Robot.chassisSubsystem.DriveMe(Robot.oi.stick);
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassisSubsystem.StopMe();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.chassisSubsystem.StopMe(); 	
    }
}
