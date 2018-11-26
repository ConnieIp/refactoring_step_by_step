package com.tws.refactoring;

public class Police {
    private final int validDriverAge = 18;

    public boolean checkDriverAge(Driver driver) {
        return (driver.getAge() >= this.validDriverAge);
    }
}
