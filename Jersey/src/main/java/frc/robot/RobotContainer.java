// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Commands.DriveState;
import frc.robot.Subsystems.Drivetrain;

public class RobotContainer {


  public static Drivetrain driveSubsystem = new Drivetrain();
  public RobotContainer() {
    configureBindings();
    driveSubsystem.setDefaultCommand(new DriveState());
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
