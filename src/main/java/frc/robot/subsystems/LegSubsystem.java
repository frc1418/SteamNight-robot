package frc.robot.subsystems;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LegSubsystem extends SubsystemBase {
    private DoubleSolenoid solenoid;

    public LegSubsystem(DoubleSolenoid solenoid) {
        this.solenoid = solenoid;
        solenoid.set(Value.kForward);
    }
    public void toggle(){
        solenoid.toggle();
        System.out.println("Kicked");
        
    }
}
