import java.util.Set;

import ftc.Motor;
import ftc.Sleep;

public class Main {

    public static void main(String[] args) {
        Motor leftMotor = new Motor(1);
        Motor rightMotor = new Motor(0);
        leftMotor.setPower(.50);
        rightMotor.setPower(.5);
        Sleep.forMilliseconds(3000);
        leftMotor.setPower(0);
        rightMotor.setPower(0);
    }
}



