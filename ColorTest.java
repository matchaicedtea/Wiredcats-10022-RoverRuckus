package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.LED;

@TeleOp

public class ColorTest extends OpMode {

    ColorSensor goldSensor;

    @Override
    public void init() {

        goldSensor = hardwareMap.colorSensor.get("goldsensor");

    }

    @Override
    public void loop() {

        telemetry.addData("R: ", goldSensor.red());
        telemetry.addData("G: ", goldSensor.blue());
        telemetry.addData("B: ", goldSensor.green());
        telemetry.update();

    }

}
