/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class HatchCone extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  private final DoubleSolenoid doubleSolenoid = RobotMap.hatchConeSolenoid;
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void openHatch() {
    doubleSolenoid.set(Value.kForward);
  }

  public void closeHatch() {
    doubleSolenoid.set(Value.kReverse);
  }
}



//LIMELIGHT
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.NetworkTableEntry;
import edu.wpi.first.wpilibj.NetworkTableInstance;

public class Limelight{
    Private static NetworkTableInstance table =
    
public static enum LightMode
       eOn, eoff, eBlink
      
public static enum CameraMode
      eVision, eDriver
      
public static boolean isTarget(){
     return getValue("tv").getDouble(0)=1
       
public static double getTx
       return getValue("tx").getDouble(0.00)
       
public static double get Ty (){
       return getValue("ty").getDouble(0.00)
      
public static double get Ta
       return getValue("ta").getDouble(0.00)
         
public static double get Ts
        return getValue("ts"),getDouble(0.00)
         
public static double get Tl
        return getValue("tl"),getDouble(0.00)
         
public static double get setLedMode(LightMode mode) {
         getValue
      
