package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.util.Range;

public class PuzzleProgrammingBoard extends ProgrammingBoard {
    /**
     * This allows you to set the speed of the motor on the programing board.
     *
     * @param speed set the speed of the motor on the board
     */
    public void setMotorSpeed(double speed) {
        motor.setPower(speed);
    }


    /**
     * sets servo to desired angle
     * @param angle angle to set servo to [0, 180]
     */
    public void setServoAngle(double angle){
        double pos = Range.scale(angle,0,180,0.0,1.0);
        servo.setPosition(pos);
    }

    /**
     * this returns the angle of the potentiometer
     * @return angle of teh potentiometer in [0, 270]
     */
    public double potAngle(){
        return Range.scale(pot.getVoltage(), 0, pot.getMaxVoltage(), 0, 270);
    }
}
