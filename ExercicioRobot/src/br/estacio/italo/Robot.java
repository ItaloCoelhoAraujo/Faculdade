package br.estacio.italo;

import br.estacio.newton.robot.IRobot;

public class Robot implements IRobot {
    private String name;
    private double speed, maxSpeed, temperature;
    private byte status;
    //Possibilidade de status
    private final byte standBy = 1, moving = 2, exploring = 3, stopped = 4, returning = 5;
    private int power;

    //Contrutores
    public Robot() {
        this.setStatus(standBy);
    }

    public Robot(String name){
        this();
        this.setName(name);
    }

    public Robot(String name, double speedms, double maxSpeedms, double temperaturef, byte status, int powerPercent){
        this.setName(name);
        this.setSpeed(speedms);
        this.setMaxSpeed(maxSpeedms);
        this.setTemperature(temperaturef);
        this.setStatus(status);
        this.setPower(powerPercent);
    }

    //Setters e Getters
    //Name
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    private void setSpeed(double speedms) {
        if(speed <= this.maxSpeed && speed > 0)
            this.speed = speedms;
        else if(speed <= 0) {
            this.speed = 0;
            this.setStatus(stopped);
        }
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeedms) {
        this.maxSpeed = maxSpeedms;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    private void setTemperature(double temperaturef) {
        this.temperature = temperaturef;
    }

    @Override
    public byte getStatus() {
        return status;
    }

    private void setStatus(byte status) {
        if(status > 0 && status <= 5)
            this.status = status;
    }

    @Override
    public int getPower() {
        return power;
    }

    private void setPower(int power) {
        if(power <= 100 && power >=0)
            this.power = power;
        if(this.power == 0)
            this.setStatus(standBy);
    }

    @Override
    public void show() {
        System.out.println("Name: " + this.getName() + " Speed(m/s): " + this.getSpeed() + " Max Speed(m/s): "
                            + this.getMaxSpeed() + " Temperature(F): " + this.getTemperature() + " Status: "
                            + this.getStatus() + " Power(%): " + this.getPower());
    }

    @Override
    public void stop() {
        this.setSpeed(0);
        double newTemperature = this.getTemperature() - (this.getTemperature() * 0.1);
        this.setTemperature(newTemperature);
    }

    @Override
    public void speedUp(double v) {
        int newPower = (int) (this.getPower() - (v * 0.25));
        if (newPower <= 100 && newPower >= 0) {
            double newSpeed = this.getSpeed() + v;
            double newTemperature = this.getTemperature() + (v * 0.5);

            this.setPower(newPower);
            this.setSpeed(newSpeed);
            this.setTemperature(newTemperature);
        }

    }

    @Override
    public void speedUp() {
        int newPower = (int) (this.getPower() - ((this.getSpeed() * 0.1) * 0.25));
        if(newPower <= 100 && newPower >= 0) {
            double newSpeed = this.getSpeed() + (this.getSpeed() * 0.1);
            double newTemperature = this.getTemperature() + ((this.getSpeed() * 0.1) * 0.5);

            this.setPower(newPower);
            this.setSpeed(newSpeed);
            this.setTemperature(newTemperature);
        }
    }

    @Override
    public void speedDown(double v) {
        double newSpeed = this.getSpeed() - v;
        this.setSpeed(newSpeed);

        double newTemperature = this.getTemperature() - (v * 0.5);
        this.setTemperature(newTemperature);
    }
    @Override
    public void brake() {
        double newSpeed = this.getSpeed() - (this.getSpeed() * 0.1);
        this.setSpeed(newSpeed);

        double newTemperature = this.getTemperature() - ((this.getSpeed() * 0.1) * 0.5);
        this.setTemperature(newTemperature);
    }

    @Override
    public void standBy() {
        this.setSpeed(0);
        this.setTemperature(0);
    }

    @Override
    public void exploring() {
        int newPower = this.getPower() - 10;
        if(newPower <= 100 && newPower >= 0) {
            double newTemperature = this.getTemperature() - 20;
            if (this.getStatus() == stopped)
                this.setStatus(exploring);

            this.setPower(newPower);
            this.setTemperature(newTemperature);
        }
    }

    @Override
    public void returning() {
        if(this.getStatus() == moving)
            this.setStatus(returning);
    }

    @Override
    public void charge() {
        int newPower = this.getPower() + 10;
        this.setPower(newPower);
    }

    @Override
    public void fullCharge() {
        this.setPower(100);
    }
}
