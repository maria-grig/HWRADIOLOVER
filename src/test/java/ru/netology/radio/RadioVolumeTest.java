package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioVolumeTest {
    RadioVolume service = new RadioVolume();

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