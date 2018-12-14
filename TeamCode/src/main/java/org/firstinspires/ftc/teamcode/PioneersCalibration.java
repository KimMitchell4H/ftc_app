package org.firstinspires.ftc.teamcode;

/**
 * Created by phurley on 11/10/17.
 */

public class PioneersCalibration extends PioneersConstants {
    public static double TRAY_PINCH_EPSILON = 0.07;
    public static double JEWEL_ARM_DEPLOYED = 0.1;
    public static double JEWEL_ARM_RETRACTED = 0.9;
    public static double SLOW_COLLECT = 0.4;

    public static double TRAY_EPSILON = 0.05;
    public static double TRAY_DEPLOY_POSITION = 1;
    public static double TRAY_DRIVE_POSTION = 0.45;
    public static double TRAY_COLLECT_POSITION = 0;
    public static double TRAY_PINCH_OPEN = 0.25;
    public static double TRAY_PINCH_WIDE_OPEN = 0;
    public static double TRAY_PINCH_CLOSE = 1;

    public static double COLOR_SENSOR_POS_UP = 1.0;
    public static double COLOR_SENSOR_POS_DOWN = 0.0;

    public static double GEM_DRIVE_DURATION = 0.9;

    public static double RAMP_TIME = 1.0;
    public static double DRIVE_SPEED = 0.8;

    public static double ELEVATOR_DEADZONE = 0.1;
    public static double MAX_ELEVATOR_ADJUST = 0.2;
    public static int SAMPLES = 50;
    public static double REVERSE_POWER = 0.25;
    public static double MAX_INTAKE_POWER = 0.4;
    public static double WIGGLE_WAIT = 0.4;

    public static boolean LOCK_DRIVE_WHEELS = false;
    public static boolean LOCK_INTAKE_WHEELS = true;

    public static boolean RAMP_DRIVE_POWER = true;
    public static double RAMP_DRIVE_DURATION = 0.0015;
    public static long TRAY_RAMP_DURATION = 750;

    public static boolean INITIALIZE_IMU = false;
    public static boolean INITIALIZE_VUFORIA = false;

    public PioneersCalibration() {}
}