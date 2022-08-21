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

    @Test // defined number of stations, should switch from the last station to the first station
    public void shouldSwitchToNextStationTestFive() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(49);
        service.NextStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test // defined number of stations, positive regular case
    public void shouldSwitchToNextStationTestSix() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(35);
        service.NextStation();
        assertEquals(36, service.getCurrentStation());
    }

    @Test // defined number of stations, switch from first station to next station
    public void shouldSwitchToNextStationTestSeven() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(35);
        service.NextStation();
        assertEquals(36, service.getCurrentStation());
    }

    @Test // defined number of stations, switch from non-existing station to next station
    public void shouldSwitchToNextStationTestEight() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(50);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }

    @Test // defined number of stations, switch from second to third station
    public void shouldSwitchToNextStationTestNine() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(1);
        service.NextStation();
        assertEquals(2, service.getCurrentStation());
    }

    @Test // defined number of stations, switch from non-existing station to next station
    public void shouldSwitchToNextStationTestTen() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(-1);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }
    @Test // defined number of stations, switch from mid-station to next station
    public void shouldSwitchToNextStationTestEleven() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(25);
        service.NextStation();
        assertEquals(26, service.getCurrentStation());
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

    @Test // defined number of stations, should switch from the last station to the first
    public void shouldSwitchToPrevStationTestFive() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(0);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }
    @Test // defined number of stations, should switch from the first station to the last
    public void shouldSwitchToPrevStationTestSix() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(0);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }
    @Test // defined number of stations, should switch from the last station to previous
    public void shouldSwitchToPrevStationTestSeven() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(49);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from the second station to the first station
    public void shouldSwitchToPrevStationTestEight() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(1);
        service.prevStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from non-existing station to the last station
    public void shouldSwitchToPrevStationTestNine() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(-1);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from non-existing station to the last station
    public void shouldSwitchToPrevStationTestTen() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(50);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from second last station to previous station
    public void shouldSwitchToPrevStationTestEleven() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(48);
        service.prevStation();
        assertEquals(47, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from mid-station to previous station
    public void shouldSwitchToPrevStationTestTwelve() {
        RadioStation service = new RadioStation(50);
        service.setCurrentStation(20);
        service.prevStation();
        assertEquals(19, service.getCurrentStation());
    }

}


