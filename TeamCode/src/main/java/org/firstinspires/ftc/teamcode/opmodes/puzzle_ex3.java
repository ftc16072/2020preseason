package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.mechanisms.PuzzleProgrammingBoard;

/**
 * have the servo follow the knob to point the same direction
 * Puzzle level: Easy
 */
@TeleOp()
public class puzzle_ex3 extends OpMode {
    private PuzzleProgrammingBoard board = new PuzzleProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        double angle = board.getPotAngle();
        board.setServoAngle(Range.clip(angle, 0, 180));
    }
}

