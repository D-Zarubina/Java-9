package radio.settings;
public class Radio {

    private int station;
    private int sound;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int sumStation){
        this.maxStation = sumStation - 1;
    }






    public void nextStation(){
        if (station < maxStation) {
            station++;
        } else {
            station = 0;
        }
    }
    public void prevStation(){
        if (station > 0){
            station--;
        } else {
            station = maxStation;
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
        if (station > maxStation){
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
