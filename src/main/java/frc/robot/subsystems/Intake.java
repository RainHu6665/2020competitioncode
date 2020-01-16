/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.IntakeOn;
import frc.robot.commands.IntakeOff;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final SpeedController intakeMotor = RobotMap.intakeMotor;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new IntakeOff());
  }


  public void IntakeOn(){
    intakeMotor.set(0.3);
    System.err.println("Intake On");
  }

// wristMotorDown not currently in use.
// public void wristMotorDown(){
//     wristMotor.set(0.3);
//     System.err.println("Motor Down");
  }

  public void IntakeOff(){
    intakeMotor.set(0.0);
    System.err.println("Intake Off");
  }

}
