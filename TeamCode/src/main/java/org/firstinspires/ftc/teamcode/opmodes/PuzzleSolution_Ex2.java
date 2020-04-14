package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.PuzzleProgrammingBoard;

/**
 * Puzzle: set servo to 0 if x is pressed, 90 if y is pressed and 180 if b is pressed.
 * Puzzle level: Easy
 */
@TeleOp()
public class PuzzleSolution_Ex2 extends OpMode {
    private PuzzleProgrammingBoard board = new PuzzleProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (gamepad1.x) {
            board.setServoAngle(0);
        } else if (gamepad1.y) {
            board.setServoAngle(90);
        } else if (gamepad1.b) {
            board.setServoAngle(180);
        }
    }
}

