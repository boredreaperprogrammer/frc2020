package org.firstinspires.ftc.robotcontroller.external.samples;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.Locale;
public class gear ratio extends subsystems 
    // if uisng wheel 1/4 the size of color wheel
    
    public static void {
    telemetry.addData ("red" sensorColor.red());
    telemetry.addData ("blue" sensorColor.blue());
    telemetry.addData ("yellow" sensorColor.yellow());
    telemetry.addData ("green" sensorColor.green());
    }

public static void main(String []args) {
if (sensorColor.red() && insert blue) {
    do nothing;
}
else if (sensorColor.red() && insert yellow) {
    move 180 degrees  clockwise 1/2 rotation;
}
else if (sensorColor.red() && insert green) {
    move 180 degrees counterclockwise 1/2 rotation;
}
else if (sensorColor.red() && insert red) {
    move 360 degrees clockwise 1 rotation;
}
else if (sensorColor.blue() && insert red) {
    do nothing;
}
else if (sensorColor.blue() && insert green) {
    move 180 degrees  clockwise 1/2 rotation;
}
else if (sensorColor.blue() && insert yellow) {
    move 180 degrees counterclockwise 1/2 rotation;
}
else if (sensorColor.blue() && insert blue) {
    move 360 degrees clockwise 1 rotation;
} 
else if (sensorColor.green() && insert yellow) {
    do nothing;
}
else if (sensorColor.green() && insert red) {
    move 180 degrees  clockwise 1/2 rotation;
}
else if (sensorColor.green() && insert blue) {
    move 180 degrees counterclockwise 1/2 rotation;
}
else if (sensorColor.green() && insert green) {
    move 360 degrees clockwise 1 rotation;
} 
else if (sensorColor.yellow() && insert green) {
    do nothing;
}
else if (sensorColor.yellow() && insert blue) {
    move 180 degrees  clockwise 1/2 rotation;
}
else if (sensorColor.yellow() && insert red) {
    move 180 degrees counterclockwise 1/2 rotation;
}
else if (sensorColor.yellow() && insert yellow) {
    move 360 degrees clockwise 1 rotation;
} 
else (nothing) {
    wait for further commands;
}

}
