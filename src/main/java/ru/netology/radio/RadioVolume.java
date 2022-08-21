package ru.netology.radio;

public class RadioVolume {
    private int currentVolume;

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
