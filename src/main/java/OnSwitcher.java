public class OnSwitcher extends Thread {
    private int switcherThreshold;
    private int iterations;
    private Box box;

    public OnSwitcher (int switcherThreshold, int iterations, Box box) {
        this.iterations = iterations;
        this.switcherThreshold = switcherThreshold;
        this.box = box;
    }

    public void run () {
        for (int i = 0; i < iterations; i++) {
            System.out.println("Включаю");
            box.setToggle(true);
            try {
                Thread.sleep(switcherThreshold);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
