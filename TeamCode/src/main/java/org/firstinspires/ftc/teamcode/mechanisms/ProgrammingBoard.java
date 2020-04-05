package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.hardware.motors.RevRobotics40HdHexMotor;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import java.util.Arrays;
import java.util.List;

public class ProgrammingBoard {
    protected DcMotor motor;
    protected Servo servo;
    protected ColorSensor sensorColor;
    protected DistanceSensor sensorDistance;

    public void init(HardwareMap hwMap){
        motor = hwMap.get(DcMotor.class, "motor1");
        servo = hwMap.get(Servo.class, "servo1");
        sensorColor = hwMap.get(ColorSensor.class, "color_distance");
        sensorDistance = hwMap.get(DistanceSensor.class, "color_distance");
    }
    List<QQ_Test> getTests() {
        return Arrays.asList(
                new QQ_TestMotor("REV Motor", 0.3, motor),
                new QQ_TestServo("servo", 1,0, servo),
                new QQ_TestColorSensor("color sensor", sensorColor),
                new QQ_TestDistanceSensor("distance from color", sensorDistance));
    }

}
