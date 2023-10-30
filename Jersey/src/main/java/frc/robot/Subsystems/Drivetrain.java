// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

  TalonSRX frontLeftMotor = new TalonSRX(2);
  TalonSRX frontRightMotor = new TalonSRX(12);
  TalonSRX backLeftMotor = new TalonSRX(1);
  TalonSRX backRightMotor = new TalonSRX(11);

  public Drivetrain() {}

  public void setPower(double leftPower, double rightPower){
    frontLeftMotor.set(TalonSRXControlMode.PercentOutput, leftPower);
    frontRightMotor.set(TalonSRXControlMode.PercentOutput,rightPower);
    backLeftMotor.set(TalonSRXControlMode.PercentOutput,leftPower );
    backRightMotor.set(TalonSRXControlMode.PercentOutput, rightPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
