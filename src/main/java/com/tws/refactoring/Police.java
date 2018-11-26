package com.tws.refactoring;

public class Police {
    private final int validAge = 18;

    public boolean checkDriver(Driver driver) {
        return (driver.getAge() >= this.validAge);
    }

    public boolean checkDriverAge(Driver driver) {
        return (driver.getAge() >= this.validAge);
    }
}
