// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.wpilibj.AnalogInput;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public final static class DrivetrainConstants{
    public static final double DRIFT_DEADBAND = 0.05;

    public static final int BOTTOM_RIGHT_SPEED_ID = 4;
 
    public static final int TOP_RIGHT_SPEED_ID = 3;

    public static final int BOTTOM_LEFT_SPEED_ID = 1;

    public static final int TOP_LEFT_SPEED_ID = 2;


    public static final double ROTATION_SPEED_CAP = 5;
  }
  
  public final static class DriverConstants {
    public final static double speedMultiplier = 3;
    public final static double angleMultiplier = 4;
  }

  public final static class WheelConstants {
    public final static double ROTATIONS_TO_METERS = 0.33/8.33;
  }
}
