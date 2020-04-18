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
     * this allows you to set servo to an angle(0-180)
     *
     * @param angle set the angle of the servo on the board
     */
    public void setServoAngle(double angle) {
        double pos = Range.scale(angle, 0, 180, 0, 1);
        servo.setPosition(pos);

    }

    /**
     * returns the angle of the pot
     *
     * @return angle of the pot from 0-270
     */
    public double getPotAngle() {
        return Range.scale(pot.getVoltage(), 0, pot.getMaxVoltage(), 0, 270);

    }
}
