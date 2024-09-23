package com.techlearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller manages everything about the fan.
 */
@RestController
public class DemoFanController {

    private final DemoFanService fanService;

    @Autowired
    public DemoFanController(DemoFanService fanService) {
        this.fanService = fanService;
    }

    /**
     * Get the current status of the fan, like its speed and direction.
     * @return A simple message about the fan's speed and direction.
     */
    @GetMapping("/fan/status")
    public String getFanStatus() {
        String direction = fanService.isReversed() ? "reversed" : "normal";
        return "Right now, the fan is at speed " + fanService.getSpeed() + " and it's going " + direction + ".";
    }

    /**
     * Pull the speed cord to change the fan's speed.
     * @return A message showing the new fan speed.
     */
    @PostMapping("/fan/speed")
    public String pullSpeedCord() {
        fanService.pullSpeedCord();
        return "You pulled the speed cord! The fan speed is now " + fanService.getSpeed() + ".";
    }

    /**
     * Pull the direction cord to change the fan's direction.
     * @return A message showing the new fan direction.
     */
    @PostMapping("/fan/direction")
    public String pullDirectionCord() {
        fanService.pullDirectionCord();
        String direction = fanService.isReversed() ? "reversed" : "normal";
        return "You pulled the direction cord! The fan is now going " + direction + ".";
    }
}
