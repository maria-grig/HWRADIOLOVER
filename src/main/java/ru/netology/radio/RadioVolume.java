package ru.netology.radio;

public class RadioVolume {
    private int currentVolume;
        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int currentVolume) {
            this.currentVolume = currentVolume;
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
