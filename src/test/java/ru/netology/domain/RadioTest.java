package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void ShouldSetCurrentRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 0;
        //assertEquals(expected, radio.getCurrentRadioStationNumber());
        radio.setCurrentRadioStationNumber(-1);
        assertEquals(expected, radio.getCurrentRadioStationNumber());
    }
    @Test
    void ShouldSetCurrentRadioStationNumber2() {
        Radio radio = new Radio();
        int expected =9;
        //assertEquals(expected, radio.getCurrentRadioStationNumber());
        radio.setCurrentRadioStationNumber(15);
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
    void ShouldChangeNextRadioStationNumber2() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentRadioStationNumber(40);
        int actual = radio.nextRadioStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldChangeNextRadioStationNumber3() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentRadioStationNumber(-9);
        int actual = radio.nextRadioStationNumber();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldChangePrevRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentRadioStationNumber(0);
        int actual = radio.prevRadioStationNumber();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldChangePrevRadioStationNumber2() {
        Radio radio = new Radio();
        int expected = 8;
        radio.setCurrentRadioStationNumber(50);
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
    void ShouldMinusVolume2() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(-5);
        int actual = radio.minusVolume();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldMinusVolume3() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentVolume(5);
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
    @Test
    void ShouldPlusVolume2() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(-2);
        int actual = radio.plusVolume();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldPlusVolume3() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setCurrentVolume(50);
        int actual = radio.plusVolume();
        assertEquals(expected, actual);
    }
}