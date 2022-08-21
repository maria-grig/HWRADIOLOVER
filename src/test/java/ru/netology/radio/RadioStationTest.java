package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioStationTest {
    RadioStation service = new RadioStation();
    @Test// default number of stations, regular positive case to switch stations
    public void shouldSwitchToNextStationTestOne() {

        service.setCurrentStation(8);
        service.NextStation();
        assertEquals(9, service.getCurrentStation());
    }

    @Test // default number of stations, should switch from the last station to the first station
    public void shouldSwitchToNextStationTestTwo() {
        service.setCurrentStation(9);
        service.NextStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the first station from non-existing station
    public void shouldSwitchToNextStationTestThree() {
        service.setCurrentStation(10);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the first station from non-existing station
    public void shouldSwitchToNextStationTestFour() {
        service.setCurrentStation(-1);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }


    @Test// default number of stations, regular positive case to switch stations
    public void shouldSwitchToPrevStationTestOne() {
        service.setCurrentStation(8);
        service.prevStation();
        assertEquals(7, service.getCurrentStation());
    }

    @Test// default number of stations, should switch to the previous station from the first station
    public void shouldSwitchToPrevStationTestTwo() {
        service.setCurrentStation(9);
        service.prevStation();
        assertEquals(8, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the last station from non-existing station
    public void shouldSwitchToPrevStationTestThree() {
        service.setCurrentStation(10);
        service.prevStation();
        assertEquals(8, service.getCurrentStation());
    }
    @Test // default number of stations, should switch to the last station from non-existing station
    public void shouldSwitchToPrevStationTestFour() {
        service.setCurrentStation(-1);
        service.prevStation();
        assertEquals(8, service.getCurrentStation());
    }

}


