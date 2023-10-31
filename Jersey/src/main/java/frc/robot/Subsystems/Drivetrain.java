// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import org.opencv.video.TrackerGOTURN;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {

  VictorSPX frontLeftMotor = new VictorSPX(2);
  VictorSPX frontRightMotor = new VictorSPX(12);
  VictorSPX backLeftMotor = new VictorSPX(1);
  VictorSPX backRightMotor = new VictorSPX(11);

  public Drivetrain() {

    frontRightMotor.setInverted(true);
    backRightMotor.setInverted(true);
  }

  public void setPower(double leftPower, double rightPower){
    frontLeftMotor.set(VictorSPXControlMode.PercentOutput, leftPower);
    frontRightMotor.set(VictorSPXControlMode.PercentOutput,rightPower);
    backLeftMotor.set(VictorSPXControlMode.PercentOutput,leftPower );
    backRightMotor.set(VictorSPXControlMode.PercentOutput, rightPower);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
