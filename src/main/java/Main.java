public class Main {
    final static int SWITCH_ON_THRESHOLD = 5000;
    final static int ITERATIONS = 5;

    public static void main(String[] args) {
        Box box = new Box();
        OnSwitcher onSwitcher = new OnSwitcher(SWITCH_ON_THRESHOLD, ITERATIONS, box);
        OffSwitcher offSwitcher = new OffSwitcher(box);
        offSwitcher.setDaemon(true);

        onSwitcher.start();
        offSwitcher.start();

        try {
            onSwitcher.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
