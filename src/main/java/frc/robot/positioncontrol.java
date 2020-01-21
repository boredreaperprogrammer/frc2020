package org.firstinspires.ftc.robotcontroller.external.samples;
package com.ctre.phoenix.motorcontrol;

import com.ctre.phoenix.CTREJNIWrapper;

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
//autonomous code for position control

import java.util.Locale;
public class positioncontrol extends subsystems {
    // if uisng wheel 1/4 the size of color wheel

    public static final int MEASURE_FOR_ROTATION = 4096 ;
    //variable for 1 rotation
    
    public static void robocolor{
    String blue = 'B';
    String green = 'G';
    String red  = 'R';
    String yellow ='Y';
    }
    // automonous code for position control converted to variables
    public static void sensorColor{
    telemetry.addData ( sensorColor.red());
    telemetry.addData (sensorColor.blue());
    telemetry.addData (sensorColor.yellow());
    telemetry.addData ( sensorColor.green());
    }
//color sensing code
    
public static void statement {
if (sensorColor.red() && blue) {
    int MEASURE_FOR_ROTATION = 0 ;
}
else if (sensorColor.red() && yellow) {
     int MEASURE_FOR_ROTATION = 2048;
}
else if (sensorColor.red() && green) {
    int MEASURE_FOR_ROTATION = -2048;
}
else if (sensorColor.red() && red) {
    int MEASURE_FOR_ROTATION = 4096;
}
else if (sensorColor.blue() && red) {
    int MEASURE_FOR_ROTATION = 0 ;
}
else if (sensorColor.blue() && green) {
    int MEASURE_FOR_ROTATION = 2048;
}
else if (sensorColor.blue() && yellow) {
    int MEASURE_FOR_ROTATION = -2048;
}
else if (sensorColor.blue() && blue) {
    int MEASURE_FOR_ROTATION = 4096;
} 
else if (sensorColor.green() && yellow) {
    int MEASURE_FOR_ROTATION = 0 ;
}
else if (sensorColor.green() && red) {
    int MEASURE_FOR_ROTATION = 2048;
}
else if (sensorColor.green() && blue) {
    int MEASURE_FOR_ROTATION = -2048;
}
else if (sensorColor.green() && green) {
    int MEASURE_FOR_ROTATION = 4096;
} 
else if (sensorColor.yellow() && green) {
    int MEASURE_FOR_ROTATION = 0 ;
}
else if (sensorColor.yellow() && blue) {
    int MEASURE_FOR_ROTATION = 2048;
}
else if (sensorColor.yellow() && red) {
    int MEASURE_FOR_ROTATION = -2048;
}
else if (sensorColor.yellow() && yellow) {
    int MEASURE_FOR_ROTATION = 4096;

} 
else (nothing) {
    int MEASURE_FOR_ROTATION = 0 ;
}
    //code senses the color and recieves input from import file. Ajusts the color wheel based on that data
    

}
