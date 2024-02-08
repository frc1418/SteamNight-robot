package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.LegSubsystem;

public class KickCommand extends SequentialCommandGroup{
    public KickCommand(LegSubsystem LegSubsystem){
        addCommands(
            new InstantCommand(() -> LegSubsystem.toggle()),
            new WaitCommand(0.5)
            

        );
    }
    
}
