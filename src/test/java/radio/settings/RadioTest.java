package radio.settings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetSumStation(){
        Radio radio = new Radio(24);

        radio.setStation(17);

        int expected = 17;
        int actual = radio.getStation();
    }

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setStation(7);

        int expected = 7;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStationToZero() {
        Radio radio = new Radio();

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStationAfterNine() {
        Radio radio = new Radio();

        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStationZero() {
        Radio radio = new Radio();

        radio.setStation(0);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStationNine() {
        Radio radio = new Radio();

        radio.setStation(9);

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStationAfterNine() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationAfterZero() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetSound() {
        Radio radio = new Radio();
        radio.setSound(12);

        int expected = 12;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetSoundToZero() {
        Radio radio = new Radio();
        radio.setSound(-12);

        int expected = 0;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetSoundAfterHundred() {
        Radio radio = new Radio();
        radio.setSound(122);

        int expected = 0;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetSoundZero() {
        Radio radio = new Radio();
        radio.setSound(0);

        int expected = 0;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetSoundHundred() {
        Radio radio = new Radio();
        radio.setSound(100);

        int expected = 100;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPlusSound() {
        Radio radio = new Radio();
        radio.setSound(14);
        radio.plusSound();

        int expected = 15;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPlusSoundAfterHundred() {
        Radio radio = new Radio();
        radio.setSound(100);
        radio.plusSound();

        int expected = 100;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinusSound() {
        Radio radio = new Radio();
        radio.setSound(15);
        radio.minusSound();

        int expected = 14;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinusSoundAfterZero() {
        Radio radio = new Radio();
        radio.setSound(0);
        radio.minusSound();

        int expected = 0;
        int actual = radio.getSound();

        Assertions.assertEquals(expected, actual);

    }

}
