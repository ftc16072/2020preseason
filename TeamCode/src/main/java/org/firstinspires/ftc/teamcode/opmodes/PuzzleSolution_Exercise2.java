package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.mechanisms.PuzzleProgrammingBoard;

/**
 * Puzzle2 make the servo face directions based on the buttons
 *
 * Puzzle level: Easy
 */
@TeleOp()
public class PuzzleSolution_Exercise2 extends OpMode {
    private PuzzleProgrammingBoard board = new PuzzleProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        if(gamepad1.x){
            board.setServoAngle(0);
        } else if (gamepad1.y){
            board.setServoAngle(90);
        } else if (gamepad1.b){
            board.setServoAngle(180);
        }
    }
}
