package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.mechanisms.PuzzleProgrammingBoard;

/**
 * Puzzle: increase the motor speed as it moves further away
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
        double distance = board.getDistance();

        if (distance > 5) {
            board.setMotorSpeed(0.6);
        } else {
            board.setMotorSpeed(0.3);
        }
    }
}
