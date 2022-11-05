package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test // set the current station
    public void shouldSetTheCurrentStation(){
        Radio service = new Radio();
        service.setCurrentStation(5);
        Assertions.assertEquals(5, service.getCurrentStation());
    }

    @Test// default number of stations, regular positive case to switch stations
    public void shouldSwitchToNextStationTestOne() {
        Radio service = new Radio();
        service.setCurrentStation(8);
        service.NextStation();
        assertEquals(9, service.getCurrentStation());
    }

    @Test // default number of stations, should switch from the last station to the first station
    public void shouldSwitchToNextStationTestTwo() {
        Radio service = new Radio();
        service.setCurrentStation(9);
        service.NextStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the first station from non-existing station
    public void shouldSwitchToNextStationTestThree() {
        Radio service = new Radio();
        service.setCurrentStation(10);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the first station from non-existing station
    public void shouldSwitchToNextStationTestFour() {
        Radio service = new Radio();
        service.setCurrentStation(-1);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from the last station to the first station
    public void shouldSwitchToNextStationTestFive() {
        Radio service = new Radio(50);
        service.setCurrentStation(49);
        service.NextStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test // defined number of stations, positive regular case
    public void shouldSwitchToNextStationTestSix() {
        Radio service = new Radio(50);
        service.setCurrentStation(35);
        service.NextStation();
        assertEquals(36, service.getCurrentStation());
    }

    @Test // defined number of stations, switch from first station to next station
    public void shouldSwitchToNextStationTestSeven() {
        Radio service = new Radio(50);
        service.setCurrentStation(35);
        service.NextStation();
        assertEquals(36, service.getCurrentStation());
    }

    @Test // defined number of stations, switch from non-existing station to next station
    public void shouldSwitchToNextStationTestEight() {
        Radio service = new Radio(50);
        service.setCurrentStation(50);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }

    @Test // defined number of stations, switch from second to third station
    public void shouldSwitchToNextStationTestNine() {
        Radio service = new Radio(50);
        service.setCurrentStation(1);
        service.NextStation();
        assertEquals(2, service.getCurrentStation());
    }

    @Test // defined number of stations, switch from non-existing station to next station
    public void shouldSwitchToNextStationTestTen() {
        Radio service = new Radio(50);
        service.setCurrentStation(-1);
        service.NextStation();
        assertEquals(1, service.getCurrentStation());
    }
    @Test // defined number of stations, switch from mid-station to next station
    public void shouldSwitchToNextStationTestEleven() {
        Radio service = new Radio(50);
        service.setCurrentStation(25);
        service.NextStation();
        assertEquals(26, service.getCurrentStation());
    }
    @Test// default number of stations, regular positive case to switch stations
    public void shouldSwitchToPrevStationTestOne() {
        Radio service = new Radio();
        service.setCurrentStation(8);
        service.prevStation();
        assertEquals(7, service.getCurrentStation());
    }

    @Test// default number of stations, should switch to the previous station from the first station
    public void shouldSwitchToPrevStationTestTwo() {
        Radio service = new Radio();
        service.setCurrentStation(9);
        service.prevStation();
        assertEquals(8, service.getCurrentStation());
    }

    @Test // default number of stations, should switch to the last station from non-existing station
    public void shouldSwitchToPrevStationTestThree() {
        Radio service = new Radio();
        service.setCurrentStation(10);
        service.prevStation();
        assertEquals(8, service.getCurrentStation());
    }
    @Test // default number of stations, should switch to the last station from non-existing station
    public void shouldSwitchToPrevStationTestFour() {
        Radio service = new Radio();
        service.setCurrentStation(-1);
        service.prevStation();
        assertEquals(8, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from the last station to the first
    public void shouldSwitchToPrevStationTestFive() {
        Radio service = new Radio(50);
        service.setCurrentStation(0);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }
    @Test // defined number of stations, should switch from the first station to the last
    public void shouldSwitchToPrevStationTestSix() {
        Radio service = new Radio(50);
        service.setCurrentStation(0);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }
    @Test // defined number of stations, should switch from the last station to previous
    public void shouldSwitchToPrevStationTestSeven() {
        Radio service = new Radio(50);
        service.setCurrentStation(49);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from the second station to the first station
    public void shouldSwitchToPrevStationTestEight() {
        Radio service = new Radio(50);
        service.setCurrentStation(1);
        service.prevStation();
        assertEquals(0, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from non-existing station to the last station
    public void shouldSwitchToPrevStationTestNine() {
        Radio service = new Radio(50);
        service.setCurrentStation(-1);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from non-existing station to the last station
    public void shouldSwitchToPrevStationTestTen() {
        Radio service = new Radio(50);
        service.setCurrentStation(50);
        service.prevStation();
        assertEquals(48, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from second last station to previous station
    public void shouldSwitchToPrevStationTestEleven() {
        Radio service = new Radio(50);
        service.setCurrentStation(48);
        service.prevStation();
        assertEquals(47, service.getCurrentStation());
    }

    @Test // defined number of stations, should switch from mid-station to previous station
    public void shouldSwitchToPrevStationTestTwelve() {
        Radio service = new Radio(50);
        service.setCurrentStation(20);
        service.prevStation();
        assertEquals(19, service.getCurrentStation());
    }
    Radio service = new Radio();
    @Test // increase volume when volume is max
    public void increaseVolumeTestOne() {
        service.setCurrentVolume(100);
        service.IncreaseVolume();
        Assertions.assertEquals(100, service.getCurrentVolume());
    }
    @Test // increase volume to max
    public void increaseVolumeTestTwo() {
        service.setCurrentVolume(99);
        service.IncreaseVolume();
        Assertions.assertEquals(100, service.getCurrentVolume());
    }

    @Test // increase volume regular positive case
    public void increaseVolumeTestThree() {
        service.setCurrentVolume(0);
        service.IncreaseVolume();
        Assertions.assertEquals(1, service.getCurrentVolume());
    }
    @Test // increase volume from non-existing volume scale
    public void increaseVolumeTestFour() {
        service.setCurrentVolume(-1);
        service.IncreaseVolume();
        Assertions.assertEquals(1, service.getCurrentVolume());
    }

    @Test // increase volume from non-existing volume scale
    public void increaseVolumeTestFive() {
        service.setCurrentVolume(101);
        service.IncreaseVolume();
        Assertions.assertEquals(1, service.getCurrentVolume());
    }

    @Test // decrease volume from max
    public void decreaseVolumeTestOne() {
        service.setCurrentVolume(100);
        service.DecreaseVolume();
        Assertions.assertEquals(99, service.getCurrentVolume());
    }

    @Test // decrease volume from min
    public void decreaseVolumeTestTwo() {
        service.setCurrentVolume(0);
        service.DecreaseVolume();
        Assertions.assertEquals(0, service.getCurrentVolume());
    }

    @Test // decrease volume from 1 to 0
    public void decreaseVolumeTestThree() {
        service.setCurrentVolume(1);
        service.DecreaseVolume();
        Assertions.assertEquals(0, service.getCurrentVolume());
    }

    @Test // decrease volume from non-existing scale
    public void decreaseVolumeTestFour() {
        service.setCurrentVolume(-1);
        service.DecreaseVolume();
        Assertions.assertEquals(0, service.getCurrentVolume());
    }

    @Test // decrease volume from non-existing scale
    public void decreaseVolumeTestFive() {
        service.setCurrentVolume(101);
        service.DecreaseVolume();
        Assertions.assertEquals(0, service.getCurrentVolume());
    }

    @Test // decrease volume regular positive case
    public void DecreaseVolumeTestSix() {
        service.setCurrentVolume(17);
        service.DecreaseVolume();
        Assertions.assertEquals(16, service.getCurrentVolume());
    }

}