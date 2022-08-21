package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioStationTest {

    @Test// default number of stations, regular positive case to switch stations
    public void shouldSwitchToNextStationTestOne() {
        RadioStation service = new RadioStation();
        service.setCurrentStation(8);
        service.NextStation();
        assertEquals(9, service.getCurrentStation());
    }

    @Test // default number of stations, should switch from the last station to the first station
    public void shouldSwitchToNextStationTestTwo() {
        RadioStation service = new RadioStation();
        service.setCurrentStation(9);
        service.NextStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the first station from non-existing station
    public void shouldSwitchToNextStationTestThree() {
        RadioStation service = new RadioStation();
        service.setCurrentStation(10);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the first station from non-existing station
    public void shouldSwitchToNextStationTestFour() {
        RadioStation service = new RadioStation();
        service.setCurrentStation(-1);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }


    @Test// default number of stations, regular positive case to switch stations
    public void shouldSwitchToPrevStationTestOne() {
        RadioStation service = new RadioStation();
        service.setCurrentStation(8);
        service.prevStation();
        assertEquals(7, service.getCurrentStation());
    }

    @Test// default number of stations, should switch to the previous station from the first station
    public void shouldSwitchToPrevStationTestTwo() {
        RadioStation service = new RadioStation();
        service.setCurrentStation(9);
        service.prevStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the last station from non-existing station
    public void shouldSwitchToPrevStationTestThree() {
        RadioStation service = new RadioStation();
        service.setCurrentStation(10);
        service.prevStation();
        assertEquals(9, service.getCurrentStation());
    }
    @Test // default number of stations, should switch to the last station from non-existing station
    public void shouldSwitchToPrevStationTestFour() {
        RadioStation service = new RadioStation();
        service.setCurrentStation(-1);
        service.prevStation();
        assertEquals(9, service.getCurrentStation());
    }

}


