package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp()
public class GamePadExcersize extends OpMode {
    @Override
    public void init() {
        telemetry.addData( "Hello", "Nikhil");

    }

    @Override
    public void loop() {
        double rightControlY = gamepad1.right_stick_y;
        double rightControlX = gamepad1.right_stick_x;
        telemetry.addData("X variable", rightControlX);
        telemetry.addData("Y Variable", rightControlY);


    }
}
