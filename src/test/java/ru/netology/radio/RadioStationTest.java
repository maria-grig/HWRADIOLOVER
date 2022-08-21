package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioStationTest {

    @Test
    public void test() {
        RadioStation service = new RadioStation(30);

        Assertions.assertEquals(0, service.getMinStation());
        Assertions.assertEquals(29, service.getMaxStation());
        Assertions.assertEquals(0, service.getCurrentStation());

    }
}

