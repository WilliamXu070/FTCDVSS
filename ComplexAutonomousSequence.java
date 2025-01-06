package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Complex Autonomous Sequence", group="Linear Opmode")
public class ComplexAutonomousSequence extends AdvancedConcurrentAutonomousDrive {

    // Motor and servo declarations
    private DcMotor frontLeftMotor;
    private DcMotor backLeftMotor;
    private DcMotor frontRightMotor;
    private DcMotor backRightMotor;
    private DcMotor armMotor;
    private Servo specimenClaw;

    // Drivetrain Encoder Constants
    private static final double DRIVETRAIN_COUNTS_PER_MOTOR_REV = 28;  // For REV Core Hex Motor
    private static final double DRIVETRAIN_GEAR_REDUCTION = 20.0;  // If using geared motors
    private static final double WHEEL_DIAMETER_INCHES = 4.0;  // Typical mecanum wheel size
    private static final double DRIVETRAIN_COUNTS_PER_INCH = (DRIVETRAIN_COUNTS_PER_MOTOR_REV * DRIVETRAIN_GEAR_REDUCTION) / (WHEEL_DIAMETER_INCHES * Math.PI);

    // Strafing Correction Factors
    private double frontLeftStrafeCorrectionFactor = 0.0;   // Adjusts front left motor during strafing
    private double backLeftStrafeCorrectionFactor = -0.05;  // Adjusts back left motor during strafing
    private double frontRightStrafeCorrectionFactor = 0.0;  // Adjusts front right motor during strafing
    private double backRightStrafeCorrectionFactor = 0.05;  // Adjusts back right motor during strafing
    private static final double STRAFE_CORRECTION_SCALE = 1.5;

    // Arm Motor Encoder Constants for Hex Ultraplanetary
    private static final double ARM_COUNTS_PER_MOTOR_REV = 28;  // Base motor revolution
    private static final double ARM_GEAR_REDUCTION = 40.0;  // Example: 40:1 gear reduction
    private static final double ARM_COUNTS_PER_DEGREE = (ARM_COUNTS_PER_MOTOR_REV * ARM_GEAR_REDUCTION) / 360.0;

    // Servo position constants
    private static final double CLAW_OPEN_POSITION = 1.0;
    private static final double CLAW_CLOSED_POSITION = 0.0;

    // Speed constants
    private static final double DRIVE_SPEED = 0.5;
    private static final double TURN_SPEED = 0.4;
    private static final double ARM_SPEED = 0.5;

    private ElapsedTime runtime = new ElapsedTime();


    @Override
    public void runOpMode() {
        // Initialize hardware using parent class method
        initializeHardware();

        // Wait for start button
        waitForStart();

        if (opModeIsActive()) {

                    // FIRST HANG

            // Step 1: Move forward, raise arm, close claw (concurrent)
            driveForwardAsync(DRIVE_SPEED, 10);
            moveArmToDegreeAsync(90, ARM_SPEED);
            closeClawAsync();
            waitForMovementComplete();

            // Step 2: Move forward
            driveForwardAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 3: Open claw
            openClawAsync();



                    // PUSH THOSE BLOCKS!!!

            // Step 4: Move backwards and raise arm (concurrent)
            driveForwardAsync(DRIVE_SPEED, -10); // Negative for backwards
            moveArmToDegreeAsync(180, ARM_SPEED);
            waitForMovementComplete();

            // Step 5: Move right
            strafeRightAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 6: Move forwards
            driveForwardAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 7: Move back
            driveForwardAsync(DRIVE_SPEED, -10);
            waitForMovementComplete();

            // Step 8: Move forwards
            driveForwardAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 9: Move right
            strafeRightAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 10: Move back
            driveForwardAsync(DRIVE_SPEED, -10);
            waitForMovementComplete();

            // Step 11: Move forwards
            driveForwardAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 12: Move right
            strafeRightAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 13: Move back
            driveForwardAsync(DRIVE_SPEED, -10);
            waitForMovementComplete();




                    // ROBOT IS HANGING BROOOOOOOOS REPEAT x1

            // Step 14: Close claw, lower arm, move left (concurrent)
            closeClawAsync();
            moveArmToDegreeAsync(0, ARM_SPEED);
            strafeLeftAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 15: Move forward
            driveForwardAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 16: Open claw
            openClawAsync();

            // Step 17: Move backwards and raise arm (concurrent)
            driveForwardAsync(DRIVE_SPEED, -10);
            moveArmToDegreeAsync(90, ARM_SPEED);
            waitForMovementComplete();

            // Step 18: Move right
            strafeRightAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();


                    // ROBOT IS HANGING BROOOOOOOOS REPEAT x2


            // Step 14: Close claw, lower arm, move left (concurrent)
            closeClawAsync();
            moveArmToDegreeAsync(0, ARM_SPEED);
            strafeLeftAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 15: Move forward
            driveForwardAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 16: Open claw
            openClawAsync();

            // Step 17: Move backwards and raise arm (concurrent)
            driveForwardAsync(DRIVE_SPEED, -10);
            moveArmToDegreeAsync(90, ARM_SPEED);
            waitForMovementComplete();

            // Step 18: Move right
            strafeRightAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();






                    // ROBOT IS HANGING BROOOOOOOOS REPEAT x3

            // Step 14: Close claw, lower arm, move left (concurrent)
            closeClawAsync();
            moveArmToDegreeAsync(0, ARM_SPEED);
            strafeLeftAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 15: Move forward
            driveForwardAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 16: Open claw
            openClawAsync();

            // Step 17: Move backwards and raise arm (concurrent)
            driveForwardAsync(DRIVE_SPEED, -10);
            moveArmToDegreeAsync(90, ARM_SPEED);
            waitForMovementComplete();

            // Step 18: Move right
            strafeRightAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();






                    // ROBOT IS HANGING BROOOOOOOOS REPEAT x4

            // Step 14: Close claw, lower arm, move left (concurrent)
            closeClawAsync();
            moveArmToDegreeAsync(0, ARM_SPEED);
            strafeLeftAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 15: Move forward
            driveForwardAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();

            // Step 16: Open claw
            openClawAsync();

            // Step 17: Move backwards and raise arm (concurrent)
            driveForwardAsync(DRIVE_SPEED, -10);
            moveArmToDegreeAsync(90, ARM_SPEED);
            waitForMovementComplete();

            // Step 18: Move right
            strafeRightAsync(DRIVE_SPEED, 10);
            waitForMovementComplete();



            telemetry.addData("Total Runtime", "%.2f seconds", totalTime.seconds());
            telemetry.update();

            

            // Stop all motors
            stopAllMotors();
        }
    }

    private void openClawAsync() {
        specimenClaw.setPosition(CLAW_OPEN_POSITION);
        // No sleep to allow concurrent movement
    }
    private void closeClawAsync() {
        specimenClaw.setPosition(CLAW_CLOSED_POSITION);
        // No sleep to allow concurrent movement
    }


    private void initializeHardware() {
        // Motor initialization
        frontLeftMotor = hardwareMap.dcMotor.get("frontLeftMotor");
        backLeftMotor = hardwareMap.dcMotor.get("backLeftMotor");
        frontRightMotor = hardwareMap.dcMotor.get("frontRightMotor");
        backRightMotor = hardwareMap.dcMotor.get("backRightMotor");
        armMotor = hardwareMap.dcMotor.get("armMotor");
        specimenClaw = hardwareMap.servo.get("specimen claw");

        // Set motor directions
        frontRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backRightMotor.setDirection(DcMotorSimple.Direction.REVERSE);

        // Set motor modes
        setMotorRunModes(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        setMotorRunModes(DcMotor.RunMode.RUN_USING_ENCODER);

        // Set zero power behavior
        setMotorZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }

    private void moveArmToDegreeAsync(double targetDegree, double speed) {
        if (opModeIsActive()) {
            // Calculate target position based on degrees
            int newArmTarget = (int)(targetDegree * ARM_COUNTS_PER_DEGREE);

            // Set target position
            armMotor.setTargetPosition(newArmTarget);
            armMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            // Set power
            armMotor.setPower(Math.abs(speed));
        }
    }

    private void strafeRightAsync(double speed, double inches) {
        if (opModeIsActive()) {
            // Calculate encoder targets
            int ticks = (int)(inches * DRIVETRAIN_COUNTS_PER_INCH);

            // Calculate base motor targets with strafing
            int frontLeftTarget = frontLeftMotor.getCurrentPosition() - ticks;
            int backLeftTarget = backLeftMotor.getCurrentPosition() + ticks;
            int frontRightTarget = frontRightMotor.getCurrentPosition() + ticks;
            int backRightTarget = backRightMotor.getCurrentPosition() - ticks;

            // Set motor targets
            frontLeftMotor.setTargetPosition(frontLeftTarget);
            backLeftMotor.setTargetPosition(backLeftTarget);
            frontRightMotor.setTargetPosition(frontRightTarget);
            backRightMotor.setTargetPosition(backRightTarget);

            // Set run mode
            frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            // Calculate corrected powers with dynamic scaling
            double correctedFrontLeftPower = speed + 
                (frontLeftStrafeCorrectionFactor * speed * STRAFE_CORRECTION_SCALE);
            double correctedBackLeftPower = speed + 
                (backLeftStrafeCorrectionFactor * speed * STRAFE_CORRECTION_SCALE);
            double correctedFrontRightPower = speed + 
                (frontRightStrafeCorrectionFactor * speed * STRAFE_CORRECTION_SCALE);
            double correctedBackRightPower = speed + 
                (backRightStrafeCorrectionFactor * speed * STRAFE_CORRECTION_SCALE);

            // Set motor powers
            frontLeftMotor.setPower(Math.abs(correctedFrontLeftPower));
            backLeftMotor.setPower(Math.abs(correctedBackLeftPower));
            frontRightMotor.setPower(Math.abs(correctedFrontRightPower));
            backRightMotor.setPower(Math.abs(correctedBackRightPower));
        }
    }

    private void stopAllMotors() {
        frontLeftMotor.setPower(0);
        backLeftMotor.setPower(0);
        frontRightMotor.setPower(0);
        backRightMotor.setPower(0);
        armMotor.setPower(0);

        // Reset to RUN_USING_ENCODER mode
        setMotorRunModes(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    private void setMotorRunModes(DcMotor.RunMode runMode) {
        frontLeftMotor.setMode(runMode);
        backLeftMotor.setMode(runMode);
        frontRightMotor.setMode(runMode);
        backRightMotor.setMode(runMode);
        armMotor.setMode(runMode);
    }

    private void setMotorZeroPowerBehavior(DcMotor.ZeroPowerBehavior behavior) {
        frontLeftMotor.setZeroPowerBehavior(behavior);
        backLeftMotor.setZeroPowerBehavior(behavior);
        frontRightMotor.setZeroPowerBehavior(behavior);
        backRightMotor.setZeroPowerBehavior(behavior);
        armMotor.setZeroPowerBehavior(behavior);
    }

    private void openClaw() {
        specimenClaw.setPosition(CLAW_OPEN_POSITION);
        sleep(500);  // Allow time for servo to move
    }

    private void closeClaw() {
        specimenClaw.setPosition(CLAW_CLOSED_POSITION);
        sleep(500);  // Allow time for servo to move
    }

    // Additional methods for other strafing directions can be added similarly
    private void strafeLeftAsync(double speed, double inches) {
        if (opModeIsActive()) {
            // Calculate encoder targets
            int ticks = (int)(inches * DRIVETRAIN_COUNTS_PER_INCH);

            // Calculate base motor targets
            int frontLeftTarget = frontLeftMotor.getCurrentPosition() + ticks;
            int backLeftTarget = backLeftMotor.getCurrentPosition() - ticks;
            int frontRightTarget = frontRightMotor.getCurrentPosition() - ticks;
            int backRightTarget = backRightMotor.getCurrentPosition() + ticks;

            // Set motor targets
            frontLeftMotor.setTargetPosition(frontLeftTarget);
            backLeftMotor.setTargetPosition(backLeftTarget);
            frontRightMotor.setTargetPosition(frontRightTarget);
            backRightMotor.setTargetPosition(backRightTarget);

            // Set run mode
            frontLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backLeftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            frontRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            backRightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

            // Calculate corrected powers with dynamic scaling
            double correctedFrontLeftPower = speed + 
                (frontLeftStrafeCorrectionFactor * speed * STRAFE_CORRECTION_SCALE);
            double correctedBackLeftPower = speed + 
                (backLeftStrafeCorrectionFactor * speed * STRAFE_CORRECTION_SCALE);
            double correctedFrontRightPower = speed + 
                (frontRightStrafeCorrectionFactor * speed * STRAFE_CORRECTION_SCALE);
            double correctedBackRightPower = speed + 
                (backRightStrafeCorrectionFactor * speed * STRAFE_CORRECTION_SCALE);

            // Set motor powers
            frontLeftMotor.setPower(Math.abs(correctedFrontLeftPower));
            backLeftMotor.setPower(Math.abs(correctedBackLeftPower));
            frontRightMotor.setPower(Math.abs(correctedFrontRightPower));
            backRightMotor.setPower(Math.abs(correctedBackRightPower));
        }
    }


    // Helper method to wait for all movements to complete
    private void waitForMovementComplete() {
        while (opModeIsActive() && 
               (frontLeftMotor.isBusy() || 
                backLeftMotor.isBusy() || 
                frontRightMotor.isBusy() || 
                backRightMotor.isBusy())) {
            
            telemetry.addData("Status", "Executing movement...");
            telemetry.addData("Arm Position", armMotor.getCurrentPosition());
            telemetry.addData("Front Left Position", frontLeftMotor.getCurrentPosition());
            telemetry.update();
        }
    }

    // Add forward/backward movement method
    private void driveForwardAsync(double speed, double inches) {
        if (opModeIsActive()) {
            int ticks = (int)(inches * DRIVETRAIN_COUNTS_PER_INCH);
            
            frontLeftMotor.setTargetPosition(frontLeftMotor.getCurrentPosition() + ticks);
            backLeftMotor.setTargetPosition(backLeftMotor.getCurrentPosition() + ticks);
            frontRightMotor.setTargetPosition(frontRightMotor.getCurrentPosition() + ticks);
            backRightMotor.setTargetPosition(backRightMotor.getCurrentPosition() + ticks);
            
            setMotorRunModes(DcMotor.RunMode.RUN_TO_POSITION);
            
            frontLeftMotor.setPower(Math.abs(speed));
            backLeftMotor.setPower(Math.abs(speed));
            frontRightMotor.setPower(Math.abs(speed));
            backRightMotor.setPower(Math.abs(speed));
        }
    }
}
