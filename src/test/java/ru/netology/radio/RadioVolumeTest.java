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

    @Test
    public void CreaseVolumeSecondTest() {
        radio.setCurrentVolume(99);
        radio.IncreaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.IncreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeFourthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.IncreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.IncreaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeSixthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.IncreaseVolume();
        assertEquals(2, radio.getCurrentVolume());
    }

    @Test
    public void CreaseVolumeSeventhTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(73);
        radio.IncreaseVolume();
        assertEquals(74, radio.getCurrentVolume());
    }


    //Тестируем уменьшение звука
    @Test
    public void DecreaseVolumeFirstTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.DecreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeSecondTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.DecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeThirdTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.DecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeFourthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.DecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeFifthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.DecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeSixthTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.DecreaseVolume();
        assertEquals(98, radio.getCurrentVolume());
    }

    @Test
    public void DecreaseVolumeSeventhTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(39);
        radio.DecreaseVolume();
        assertEquals(38, radio.getCurrentVolume());
    }
}
