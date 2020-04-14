package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.mechanisms.PuzzleProgrammingBoard;

/**
 * Puzzle: have servo follow the pot(potentiometer) knob so they point in the same direction.
 * Puzzle level: Easy
 */
@TeleOp()
public class PuzzleSolution_Ex3 extends OpMode {
    private PuzzleProgrammingBoard board = new PuzzleProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
       double angle = board.getPotAngle();
       board.setServoAngle(Range.scale(angle, 0, 270, 0, 180));
    }
}
