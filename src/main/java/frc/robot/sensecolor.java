package org.firstinspires.ftc.robotcontroller.external.samples;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import edu.wpi.first.wpilibj.DriverStation;

import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;

import java.util.Locale;
public class gear ratio extends subsystems 
    // if uisng wheel 1/4 the size of color wheel
    
    public static void {
    String 'B' = blue;
    String 'G' = green;
    String 'R' = red;
    String 'Y' = yellow;
    }
    
    public static void {
    telemetry.addData ("red" sensorColor.red());
    telemetry.addData ("blue" sensorColor.blue());
    telemetry.addData ("yellow" sensorColor.yellow());
    telemetry.addData ("green" sensorColor.green());
    }

public static void main(String []args) {
if (sensorColor.red() && String blue) {
    do nothing;
}
else if (sensorColor.red() && String yellow) {
    move 180 degrees  clockwise 1/2 rotation;
}
else if (sensorColor.red() && String green) {
    move 180 degrees counterclockwise 1/2 rotation;
}
else if (sensorColor.red() && String red) {
    move 360 degrees clockwise 1 rotation;
}
else if (sensorColor.blue() && String red) {
    do nothing;
}
else if (sensorColor.blue() && String green) {
    move 180 degrees  clockwise 1/2 rotation;
}
else if (sensorColor.blue() && String yellow) {
    move 180 degrees counterclockwise 1/2 rotation;
}
else if (sensorColor.blue() && String blue) {
    move 360 degrees clockwise 1 rotation;
} 
else if (sensorColor.green() && String yellow) {
    do nothing;
}
else if (sensorColor.green() && String red) {
    move 180 degrees  clockwise 1/2 rotation;
}
else if (sensorColor.green() && String blue) {
    move 180 degrees counterclockwise 1/2 rotation;
}
else if (sensorColor.green() && String green) {
    move 360 degrees clockwise 1 rotation;
} 
else if (sensorColor.yellow() && String green) {
    do nothing;
}
else if (sensorColor.yellow() && String blue) {
    move 180 degrees  clockwise 1/2 rotation;
}
else if (sensorColor.yellow() && String red) {
    move 180 degrees counterclockwise 1/2 rotation;
}
else if (sensorColor.yellow() && String yellow) {
    move 360 degrees clockwise 1 rotation;
} 
else (nothing) {
    wait for further commands;
}

}
