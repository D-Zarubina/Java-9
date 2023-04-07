package radio.settings;
public class Radio {

    private int station;
    private int sound;
    public void nextStation(){
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }
    public void prevStation(){
        if (station > 0){
            station--;
        } else {
            station = 9;
        }
    }
    public void plusSound(){
        if (sound < 100){
            sound++;
        } else {
            sound = 100;
        }
    }
    public void minusSound(){
        if (sound > 0){
            sound--;
        } else {
            sound = 0;
        }
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0){
            return;
        }
        if (station > 9){
            return;
        }
        this.station = station;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        if (sound < 0){
            return;
        }
        if (sound > 100){
            return;
        }
        this.sound = sound;
    }
}
