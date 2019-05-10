package receiver;

public class Door {
    private boolean isOpen = false;
    public void  open(){
        isOpen = true;
        System.out.println("Door is open");
    }

    public void close(){
        isOpen = false;
        System.out.println("Door is closed");
    }

}
