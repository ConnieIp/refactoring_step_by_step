package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {
    @Test
    public void should_check_driver(){
        assertTrue(new Police().checkDriverAge(new Driver(18)));
        assertFalse(new Police().checkDriverAge(new Driver(17)));
    }
}
