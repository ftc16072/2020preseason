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
public class SamplePuzzleSolution extends OpMode {
    private PuzzleProgrammingBoard board = new PuzzleProgrammingBoard();

    @Override
    public void init() {
        board.init(hardwareMap);
    }

    @Override
    public void loop() {
        // get the speed from the stick, but flip since up on joystick is negative
        double speed = -gamepad1.left_stick_y;
        // if button not pressed, only go to half speed...
        if (!gamepad1.a) {
            speed = speed / 2;
        }
        board.setMotorSpeed(speed);
    }
}
