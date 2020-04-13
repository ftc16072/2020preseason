package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.ColorSensor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

class QQ_TestColorSensor extends QQ_Test {
    private ColorSensor colorSensor;

    /**
     * Constructor for the test
     *
     * @param description    string describing the test
     * @param colorSensor    the colorsensor that will be used in the test
     */
    QQ_TestColorSensor(String description, ColorSensor colorSensor) {
        super(description);
        this.colorSensor = colorSensor;
    }

    /**
     * prints the distance in in or cm to the telemetry
     *
     * @param on        sends color when true
     * @param telemetry allows for the color to be sent back
     */
    @Override
    void run(boolean on, Telemetry telemetry) {
            telemetry.addData(getDescription(), "%d %d %d",
                            colorSensor.red(),
                            colorSensor.green(),
                            colorSensor.blue());
    }
}
