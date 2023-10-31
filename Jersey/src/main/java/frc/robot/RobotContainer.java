// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Commands.DriveState;
import frc.robot.Subsystems.Drivetrain;

public class RobotContainer {

  public CommandXboxController driver = new CommandXboxController(0);
  public static Drivetrain driveSubsystem = new Drivetrain();
  public RobotContainer() {
    configureBindings();
    driveSubsystem.setDefaultCommand(new DriveState(0,0));
  }

  private void configureBindings() {
      driver.povUp().whileTrue(new DriveState(0.5, 0.5 ));
      driver.povDown().whileTrue(new DriveState(-0.5, -0.5));
      driver.povLeft().whileTrue(new DriveState(-0.5, 0.5));
      driver.povRight().whileTrue(new DriveState(0.5,-0.5));

  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
