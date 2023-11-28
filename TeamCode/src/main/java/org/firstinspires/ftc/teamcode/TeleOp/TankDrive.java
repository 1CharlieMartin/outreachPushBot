package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Projects.ProjectPushBot;

//import actual project name


@TeleOp(name = "TankDrive")
public class TankDrive extends LinearOpMode {
    private ProjectPushBot robot = new ProjectPushBot();
    @Override
    public void runOpMode() throws InterruptedException {
        //connects configuration to code
        robot.init(hardwareMap);
        waitForStart();
        boolean intakeOpen = false;
        while(opModeIsActive()) {
            //driving controls
            robot.frontleft.setPower(-gamepad1.left_stick_y);
            robot.frontright.setPower(-gamepad1.right_stick_y);
            robot.backleft.setPower(-gamepad1.left_stick_y);
            robot.backright.setPower(-gamepad1.right_stick_y);
        }
        robot.frontleft.setPower(0);
        robot.frontright.setPower(0);
        robot.backleft.setPower(0);
        robot.backright.setPower(0);

    }
}