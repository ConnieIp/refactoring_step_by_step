package com.tws.refactoring;

public class Police {
    private final int validAge = 18;

    public boolean checkDriverAge(Driver driver) {
        return (driver.getAge() >= this.validAge);
    }
}
