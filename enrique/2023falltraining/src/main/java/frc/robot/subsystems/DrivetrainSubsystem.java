// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.motorcontrol.Victor;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class DrivetrainSubsystem extends SubsystemBase {

  private VictorSPX leftFrontMotor;
  private VictorSPX leftBackMotor;
  private VictorSPX rightFrontMotor;
  private VictorSPX rightBackMotor;

  /** Creates a new DrivetrainSubsystem. */
  public DrivetrainSubsystem() {

    leftFrontMotor = new VictorSPX(1);
    leftBackMotor = new VictorSPX(2);
    rightFrontMotor = new VictorSPX(3);
    rightBackMotor = new VictorSPX(4);

  }

  public void setPower(double leftPower, double rightPower) {

    leftFrontMotor.set(VictorSPXControlMode.PercentOutput, leftPower);
    leftBackMotor.set(VictorSPXControlMode.PercentOutput, leftPower);
    rightFrontMotor.set(VictorSPXControlMode.PercentOutput, rightPower);
    rightBackMotor.set(VictorSPXControlMode.PercentOutput, rightPower);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
