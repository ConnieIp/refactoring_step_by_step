package com.tws.refactoring;

public class Police {

    public boolean checkDriverAge(Driver driver) {
        final int validAge = 18;
        return (driver.getAge() >= validAge);
    }
}
