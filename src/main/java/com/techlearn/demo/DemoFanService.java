package com.techlearn.demo;

import org.springframework.stereotype.Service;

/**
 * Service class to manage the Fan's state.
 */
@Service
public class DemoFanService {
    private int speed; // Fan speed (0: Off, 1: Low, 2: Medium, 3: High)
    private boolean isReversed; // Fan direction (true: reversed, false: normal)

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
     * Changes the fan speed in a circular manner (0 -> 1 -> 2 -> 3).
     */
    public void pullSpeedCord() {
        speed = (speed + 1) % 4; // Cycle through 0, 1, 2, 3
    }

    /**
     * Toggles the fan direction between normal and reversed.
     */
    public void pullDirectionCord() {
        isReversed = !isReversed;
    }
}
