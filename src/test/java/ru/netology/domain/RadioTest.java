package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void ShouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 9;
        //assertEquals(expected, radio.getCurrentRadioStationNumber());
        radio.setCurrentRadioStationNumber(-1);
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }

    @Test
    void ShouldChangeNextRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentRadioStationNumber(0);
        int actual = radio.nextRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldChangePrevRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setCurrentRadioStationNumber(9);
        int actual = radio.prevRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldSetCurrentVolume() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(-1);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void ShouldMinusVolume() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setCurrentVolume(11);
        int actual = radio.minusVolume();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldPlusVolume() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setCurrentVolume(9);
        int actual = radio.plusVolume();
        assertEquals(expected, actual);
    }
}