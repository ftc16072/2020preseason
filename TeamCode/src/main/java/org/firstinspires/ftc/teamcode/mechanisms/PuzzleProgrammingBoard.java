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
     * Sets our servo to a given angle
     *
     * @param angle angle between 0 and 180 degrees
     */
    public void setServoAngle(double angle) {
        double pos = Range.scale(angle, 0, 180, 0.0, 1.0);
        servo.setPosition(pos);
    }

    /**
     * This returns the angle of the potentiometer
     *
     * @return angle of the potentiometer in [0..270]
     */
    public double getPotAngle() {
        return Range.scale(pot.getVoltage(), 0, pot.getMaxVoltage(), 0, 270);
    }
}
