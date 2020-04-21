package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


import org.firstinspires.ftc.teamcode.mechanisms.PuzzleProgrammingBoard;

/**
 * Puzzle: Motor is fast at green, stopped at red, mid speed otherwise.
 * Puzzle level: Easy
 */
@TeleOp()
public class PuzzleSolution_Ex4 extends OpMode {
    private PuzzleProgrammingBoard board = new PuzzleProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (board.isGreen()) {
            board.setMotorSpeed(1);
        }
        else if (board.isRed()) {
            board.setMotorSpeed(0);
        }
        else {
            board.setMotorSpeed(0.5);
        }
    }
}
