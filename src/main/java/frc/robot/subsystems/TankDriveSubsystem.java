// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkBase;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.common.Odometry;

public class TankDriveSubsystem extends SubsystemBase {

  private CANSparkMax backRight;
  private CANSparkMax backLeft;
  private CANSparkMax frontLeft;
  private CANSparkMax frontRight;

  /** Creates a new ExampleSubsystem. */
  public TankDriveSubsystem(CANSparkMax backLeft, CANSparkMax backRight, CANSparkMax frontLeft,
      CANSparkMax frontRight) {
    this.backRight = backRight;
    this.backLeft = backLeft;
    this.frontLeft = frontLeft;
    this.frontRight = frontRight;
  }

  public void spin(double speed1, double speed2) {
    if (speed1 < -0.7) {
      speed1 = -0.7;
    } if (speed1 > 0.7) {
      speed1 = 0.7;
    } if (speed2 > 0.7) {
      speed2 = 0.7;
    } if (speed2 < -0.7) {
      speed2 = -0.7;
    }
    backRight.set(speed2);
    backLeft.set(speed1);
    frontLeft.set(speed1);
    frontRight.set(speed2);
    System.out.println("Speed1: " + speed1);
    System.out.println("Speed2: " + speed2);
  }

  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a
   * digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
