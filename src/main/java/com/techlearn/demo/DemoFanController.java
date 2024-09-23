package com.techlearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST Controller to expose Fan functionality.
 */
@RestController
public class DemoFanController {

    private final DemoFanService fanService;

    @Autowired
    public DemoFanController(DemoFanService fanService) {
        this.fanService = fanService;
    }

    /**
     * Get the current fan status (speed and direction).
     * @return String describing the fan's speed and direction.
     */
    @GetMapping("/fan/status")
    public String getFanStatus() {
        String direction = fanService.isReversed() ? "reversed" : "normal";
        return "Fan speed is " + fanService.getSpeed() + " and direction is " + direction;
    }

    /**
     * Pulls the speed cord, cycling through speeds.
     * @return String showing the new fan speed.
     */
    @PostMapping("/fan/speed")
    public String pullSpeedCord() {
        fanService.pullSpeedCord();
        return "Speed cord pulled. Fan speed is now " + fanService.getSpeed();
    }

    /**
     * Pulls the direction cord, reversing the fan's direction.
     * @return String showing the new fan direction.
     */
    @PostMapping("/fan/direction")
    public String pullDirectionCord() {
        fanService.pullDirectionCord();
        String direction = fanService.isReversed() ? "reversed" : "normal";
        return "Direction cord pulled. Fan direction is now " + direction;
    }
}
