package org.firstinspires.ftc.teamcode.mechanisms;

public class PuzzleProgrammingBoard extends ProgrammingBoard {
    /**
     * This allows you to set the speed of the motor on the programing board.
     *
     * @param speed set the speed of the motor on the board
     */
    public void setMotorSpeed(double speed) {
        motor.setPower(speed);
    }
}
