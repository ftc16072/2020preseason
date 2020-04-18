package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.PuzzleProgrammingBoard;

/**
 * Puzzle: Turn motor when A button pressed stop when not pressed
 * Puzzle level: Easy
 */
@TeleOp()
public class puzzle_ex1 extends OpMode {
    private PuzzleProgrammingBoard board = new PuzzleProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.a) {
            board.setMotorSpeed(0.4);
        } else {
            board.setMotorSpeed(0);
        }
    }
}
