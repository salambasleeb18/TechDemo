package com.techlearn.demo;

import org.springframework.stereotype.Service;

/**
 * This service handles the fan's state.
 */
@Service
public class DemoFanService {
    private int speed; // Fan speed (0: Off, 1: Low, 2: Medium, 3: High)
    private boolean isReversed; // Is the fan going in reverse?

    public DemoFanService() {
        this.speed = 0; // Fan starts off
        this.isReversed = false; // Fan starts in normal direction
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isReversed() {
        return isReversed;
    }

    /**
     * Pull the speed cord to change the fan speed.
     * This goes in a circle: 0 -> 1 -> 2 -> 3 -> back to 0.
     */
    public void pullSpeedCord() {
        speed = (speed + 1) % 4; // Just cycling through the speeds
    }

    /**
     * Pull the direction cord to switch the fan's direction.
     */
    public void pullDirectionCord() {
        isReversed = !isReversed; // Flip the direction
    }
}
