package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class HiloOpmode extends OpMode {
    @Override
    public void init() {
        telemetry.addData("hello", "Ryan");
    }

    @Override
    public void loop() {

    }
}
