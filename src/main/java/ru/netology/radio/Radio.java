package ru.netology.radio;
public class Radio {

    private int minStation;
    private int currentVolume;
    private int maxStation;
    private int totalRadioStations;
    private int currentStation = minStation;

    public Radio(int totalRadioStations) {
        this.totalRadioStations = totalRadioStations;
        this.maxStation = totalRadioStations - 1;
    }

    public Radio() {
        this.totalRadioStations = 10;
        this.maxStation = totalRadioStations - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= minStation && currentStation <= maxStation) {
            this.currentStation = currentStation;
        } else {
            return;
        }
    }

    public void NextStation() {
        if (currentStation == maxStation) {
            this.currentStation = 0;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
            return;
        }
        currentStation--;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            this.currentVolume = currentVolume;
        } else {
            return;
        }
    }

    public void IncreaseVolume() {
        if (currentVolume < 100) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void DecreaseVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }

}