package com.designpattern.creational.builder.demo;

public class Computer {
    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public static class ComputerBuilder {
        private HDD diskSize;
        private RAM ramSize;

        private boolean hasUsbc;
        private boolean hasGigabitWifi;

        public ComputerBuilder(){}

        public ComputerBuilder addRam(RAM ramSize){
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder addHDD(HDD diskSize){
            this.diskSize = diskSize;
            return this;
        }

        public ComputerBuilder hasGigabitWifi(boolean hasGigabitWifi){
            this.hasGigabitWifi = hasGigabitWifi;
            return this;
        }

        public ComputerBuilder hasUsbc(boolean hasUsbc){
            this.hasUsbc = hasUsbc;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

    public Computer(ComputerBuilder builder) {
        this.diskSize = builder.diskSize;
        this.ramSize = builder.ramSize;
        this.hasGigabitWifi = builder.hasGigabitWifi;
        this.hasUsbc = builder.hasUsbc;
    }

    public HDD getDiskSize() {
        return diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public boolean isHasUsbc() {
        return hasUsbc;
    }

    public boolean isHasGigabitWifi() {
        return hasGigabitWifi;
    }
}
