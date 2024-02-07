// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.common.Odometry;


public class TankDriveSubsystem extends SubsystemBase {

  private ShooterWheelSubsystem backRight;
  private ShooterWheelSubsystem backLeft;
  private ShooterWheelSubsystem frontLeft;
  private ShooterWheelSubsystem frontRight;     
  /** Creates a new ExampleSubsystem. */
  public TankDriveSubsystem(ShooterWheelSubsystem backRight, ShooterWheelSubsystem backLeft, ShooterWheelSubsystem frontRight, ShooterWheelSubsystem frontLeft) {

              this.backRight = backRight;
              this.backLeft = backLeft;
              this.frontLeft = frontLeft;
              this.frontRight = frontRight;
            }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public void spin(double speed1, double speed2 ) {
    backRight.set(speed1);
    backLeft.set(speed1);
    frontLeft.set(speed1);
    frontRight.set(speed2);
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
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
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
