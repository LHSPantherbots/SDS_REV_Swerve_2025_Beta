package frc.robot.subsystems;

import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

import frc.robot.Constants.ClimbConstants;

public class Climber {
    
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

    public void ClimbDown() {
        m_Climber.set(-.6);
    }

    public void ClimbUp() {
        m_Climber.set(.6);
    }

    public void ClimbStop() {
        m_Climber.set(0);
    }
}
