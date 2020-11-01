public class Box extends Thread{
    private volatile boolean toggle;


    public Box() {
        toggle = false;
    }

    public boolean isToggle() {
        return toggle;
    }

    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }

}
