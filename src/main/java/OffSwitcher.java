public class OffSwitcher extends Thread{
    private Box box;

    public OffSwitcher(Box box) {
        this.box = box;
    }

    public void run() {
        while (!isInterrupted()) {
            if (box.isToggle()) {
                System.out.println("Выключаю");
                box.setToggle(false);
            }
        }
    }
}
