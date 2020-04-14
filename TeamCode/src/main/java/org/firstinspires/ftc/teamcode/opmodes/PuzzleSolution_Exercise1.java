package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.PuzzleProgrammingBoard;

/**
 * Puzzle: Make the speed of the motor changeable by the position of the joystick on the gamepad
 * When the gamepad A button is pressed, allow full speed.  Otherwise divide the speed in
 * half.
 * Puzzle level: Easy
 */
@TeleOp()
public class PuzzleSolution_Exercise1 extends OpMode {
    private PuzzleProgrammingBoard board = new PuzzleProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.a){
            board.setMotorSpeed(0.5);
        } else {
            board.setMotorSpeed(0);
        }
    }
}
