// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  private VictorSPX leftFrontMotor;
  private VictorSPX leftBackMotor;
  private VictorSPX rightFrontMotor;
  private VictorSPX rightBackMotor;



  public Drivetrain() {
    leftFrontMotor = new VictorSPX(2);
    leftBackMotor = new VictorSPX(1);
    rightFrontMotor = new VictorSPX(12);
    rightBackMotor = new VictorSPX(11);


  }

public void setpower(double leftpower, double rightpower){

  leftFrontMotor.set(VictorSPXControlMode.PercentOutput, leftpower);
  leftBackMotor.set(VictorSPXControlMode.PercentOutput, leftpower);
  rightFrontMotor.set(VictorSPXControlMode.PercentOutput, rightpower);
  rightBackMotor.set(VictorSPXControlMode.PercentOutput, rightpower);
}



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
