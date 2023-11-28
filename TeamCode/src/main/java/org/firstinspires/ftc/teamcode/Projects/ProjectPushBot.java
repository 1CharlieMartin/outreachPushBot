package org.firstinspires.ftc.teamcode.Projects;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class ProjectPushBot extends Project{

    //Sample project file/hardware map


    //Setup motors
    public DcMotor frontleft = null;
    public DcMotor frontright = null;
    public DcMotor backright = null;
    public DcMotor backleft = null;

    @Override
    public void init(HardwareMap ahwMap) {
        //Save reference to Hardware map
        hwMap = ahwMap;


        //Define and Initialize Motors

        backright = hwMap.dcMotor.get("backright"); //port c0
        backleft = hwMap.dcMotor.get("backleft"); //port e3

        //Setup Motor directions and Encoder settings
        frontleft.setDirection(DcMotor.Direction.REVERSE);
        frontright.setDirection(DcMotor.Direction.FORWARD);
        backright.setDirection(DcMotor.Direction.FORWARD);
        backleft.setDirection(DcMotor.Direction.REVERSE);

        frontleft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        frontright.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backright.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        backleft.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        // Set all motors to zero power
        Stop();
    }

    public void Stop(){
        frontleft.setPower(0);
        frontright.setPower(0);
        backright.setPower(0);
        backleft.setPower(0);
    }
}