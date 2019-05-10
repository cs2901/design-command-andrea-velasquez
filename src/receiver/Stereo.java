package receiver;

public class Stereo {
    private boolean isOn = false;
    public void  on(){
        isOn = true;
        System.out.println("Stereo is on");
    }

    public void off(){
        isOn = false;
        System.out.println("Stereo is off");
    }

}
