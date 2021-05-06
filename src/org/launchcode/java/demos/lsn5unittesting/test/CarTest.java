package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

public class CarTest {
    Car test_car;
    @Before
    public void createCarObject(){
        test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }
    //TODO: constructor sets gasTankLevel properly
    public void testInitialGasTank(){
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    public void testInitialGasTankFalse(){
        assertFalse(test_car.getGasTankLevel() < 10);
    }
    public void testInitialGasTankTrue(){
        assertFalse(test_car.getGasTankLevel() == 10);
    }

//    //TODO: gasTankLevel is accurate after driving within tank range <Play with this some more>
//    @Before
//    test_car.drive(50);
    public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(501);
        assertFalse(test_car.getGasTankLevel() >= 0);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){

    }

}
