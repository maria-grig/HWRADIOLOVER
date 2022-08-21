package ru.netology.radio;

public class RadioStation {

    private int minStation;
    private int maxStation;
    private int totalRadioStations;
    private int currentStation = minStation;

    public RadioStation(int maxStation, int minStation) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = minStation;
    }

    public RadioStation(int totalRadioStations) {
        this.totalRadioStations = totalRadioStations;
        this.maxStation = totalRadioStations - 1;
    }

    public RadioStation() {
        this.totalRadioStations = 10;
        this.maxStation = totalRadioStations - 1;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if ((currentStation >= minStation) && (currentStation <= maxStation)) {
            this.currentStation = currentStation;
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
}
