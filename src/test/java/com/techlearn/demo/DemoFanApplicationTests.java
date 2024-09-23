package com.techlearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CeilingFanServiceTest {

    private DemoFanService demoFanService;

    @BeforeEach
    void setUp() {
    	demoFanService = new DemoFanService();
    }

    @Test
    void testInitialState() {
        assertEquals(0, demoFanService.getSpeed());
        assertFalse(demoFanService.isReversed());
    }

    @Test
    void testPullSpeedCord() {
    	demoFanService.pullSpeedCord();
        assertEquals(1, demoFanService.getSpeed());

        demoFanService.pullSpeedCord();
        assertEquals(2, demoFanService.getSpeed());

        demoFanService.pullSpeedCord();
        assertEquals(3, demoFanService.getSpeed());

        demoFanService.pullSpeedCord();
        assertEquals(0, demoFanService.getSpeed());
    }

    @Test
    void testPullDirectionCord() {
    	demoFanService.pullDirectionCord();
        assertTrue(demoFanService.isReversed());

        demoFanService.pullDirectionCord();
        assertFalse(demoFanService.isReversed());
    }
}
