package receiver;

public class Fan {
    private boolean isHigh = false;
    public void  high(){
        isHigh = true;
        System.out.println("Fan is hight");
    }

    public void low(){
        isHigh = false;
        System.out.println("Fan is low");
    }

}
