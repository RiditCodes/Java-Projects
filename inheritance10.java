class Device {
    void powerOn() {
        System.out.println("Device is powering on...");
    }
}

class Phone extends Device {
    void makeCall() {
        System.out.println("Making a phone call...");
    }
}

interface Camera{
    default void takePhoto(){
        System.out.println("Taking a photo...");
    }
}

interface MusicPlayer{
    default void playMusic(){
        System.out.println("Playing music...");
    }
}

class SmartPhone extends Phone implements Camera, MusicPlayer{
    void browseInternet() {
        System.out.println("Browsing the web...");
    }
}

public class inheritance10{
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();

        phone.powerOn();
        phone.makeCall();
        phone.takePhoto();
        phone.playMusic();
        phone.browseInternet();
    }
}