import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class helloOpmode extends OpMode {
    @Override
    public void init() {
        telemetry.addData( "Hello", "World");

    }

    @Override
    public void loop() {

    }
}
