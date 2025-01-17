package frc.robot.subsystems;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimbConstants;

public class Climber extends SubsystemBase {
    
     private final SparkMax m_Climber;
     private final SparkMaxConfig c_Climber;

     RelativeEncoder e_Climber;

    public Climber() {
        m_Climber = new SparkMax(ClimbConstants.kCLimber, MotorType.kBrushless);
        c_Climber = new SparkMaxConfig();

        c_Climber
            .inverted(true)
            .idleMode(IdleMode.kBrake)
            .smartCurrentLimit(30);
    }

    public void climbDown() {
        m_Climber.set(-.6);
    }

    public void climbUp() {
        m_Climber.set(.6);
    }

    public void climbStop() {
        m_Climber.set(0);
    }
}
