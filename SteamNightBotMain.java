import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.controller.PIDController;

public class SteamNightBotMain extends TimedRobot {
    private XboxController driverController;
    private SpeedController leftMotor1, leftMotor2, rightMotor1, rightMotor2;
    private SpeedControllerGroup leftMotors, rightMotors;
    private DifferentialDrive drive;
    private PIDController leftPIDController, rightPIDController;

    @Override
    public void robotInit() {
        driverController = new XboxController(0);

        leftMotor1 = new VictorSP(0); // Replace 0 with the actual port for your motor controller
        leftMotor2 = new VictorSP(1); // Replace 1 with the actual port for your motor controller
        rightMotor1 = new VictorSP(2); // Replace 2 with the actual port for your motor controller
        rightMotor2 = new VictorSP(3); // Replace 3 with the actual port for your motor controller

        leftMotors = new SpeedControllerGroup(leftMotor1, leftMotor2);
        rightMotors = new SpeedControllerGroup(rightMotor1, rightMotor2);

        drive = new DifferentialDrive(leftMotors, rightMotors);

        // Set the PID constants based on your tuning
        double kP = 0.1;
        double kI = 0.0;
        double kD = 0.0;

        leftPIDController = new PIDController(kP, kI, kD);
        rightPIDController = new PIDController(kP, kI, kD);
    }

    @Override
    public void teleopPeriodic() {
        double leftSpeed = driverController.getRawAxis(1); // Left stick Y-axis
        double rightSpeed = driverController.getRawAxis(5); // Right stick Y-axis

        // Apply PID control
        leftSpeed = leftPIDController.calculate(leftSpeed);
        rightSpeed = rightPIDController.calculate(rightSpeed);

        drive.tankDrive(leftSpeed, rightSpeed);
    }
}

