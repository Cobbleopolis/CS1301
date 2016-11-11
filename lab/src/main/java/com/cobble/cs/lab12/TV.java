//Class:      CS1301
//Term:       2016
//Name:       Logan Thompson
//Instructor: Monisha Verma
//Assignment: TV

package com.cobble.cs.lab12;

public class TV {
    public int channel = 1;
    public int volume = 1;
    public boolean on = false;

    public TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    /**
     * Sets the channel of the TV if it is on.
     * @param channel The new channel of the TV. Must be between 1 and 120 inclusive.
     */
    public void setChannel(int channel) {
        if (this.on && channel > 0 && channel < 121)
            this.channel = channel;
    }

    /**
     * Sets the volume of the TV if it is on.
     * @param volume The new volume of the TV. Must be between 1 and 7 inclusive.
     */
    public void setVolume(int volume) {
        if (this.on && volume > 0 && volume < 8)
            this.volume = volume;
    }

    /**
     * Increments the channel of the TV by 1 if it is on and the channel is less than 120.
     */
    public void channelUp() {
        if (this.on && this.channel < 120)
            channel++;
    }

    /**
     * Decrements the channel of the TV by 1 if it is on and the channel is greater than 1.
     */
    public void channelDown() {
        if (this.on && this.channel > 1)
            channel--;
    }

    /**
     * Increments the channel of the TV by 1 if it is on and the volume is less than 1.
     */
    public void volumeUp() {
        if (this.on && this.volume < 7)
            volume++;
    }

    /**
     * Decrements the volume of the TV by 1 if it is on and the volume ic greater than 1.
     */
    public void volumeDown() {
        if (this.on && this.volume > 1)
            volume--;
    }


}