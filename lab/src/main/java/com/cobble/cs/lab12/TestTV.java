//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: TestTV

package com.cobble.cs.lab12;

public class TestTV {

    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volume);
        System.out.println("tv1's channel is " + tv2.channel + " and volume level is " + tv2.volume);

        System.out.println("--------------------------------");

        TV tv3 = new TV();
        System.out.println("Turning TV 3 on...");
        tv3.turnOn();
        System.out.println("TV 3 is now on: " + tv3.on);

        System.out.println("Turning TV 3 off...");
        tv3.turnOff();
        System.out.println("TV 3 is now on: " + tv3.on);

        tv3.turnOn(); //Turns tv3 back on so that the rest of the methods work.

        System.out.println("Setting TV 3's channel to 30...");
        tv3.setChannel(30);
        System.out.println("TV 3's channel is now: " + tv3.channel);

        System.out.println("Setting TV 3's volume to 5...");
        tv3.setVolume(5);
        System.out.println("TV 3's volume is now: " + tv3.volume);

        System.out.println("Going up a channel on TV 3...");
        tv3.channelUp();
        System.out.println("TV 3's channel is now: " + tv3.channel);

        System.out.println("Going down a channel on TV 3...");
        tv3.channelDown();
        System.out.println("TV 3's channel is now: " + tv3.channel);

        System.out.println("Turning up the volume on TV 3...");
        tv3.volumeUp();
        System.out.println("TV 3's volume is now: " + tv3.volume);

        System.out.println("Turning down the volume on TV 3...");
        tv3.volumeDown();
        System.out.println("TV 3's volume is now: " + tv3.volume);
    }
}