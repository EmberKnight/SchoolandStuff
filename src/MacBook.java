public class MacBook extends Computer {

    boolean touchBar;

    public MacBook(double ghz, int ram, int storage, boolean on, boolean touchBar) {
        super("Apple", ghz, ram, storage, on);
        setTouchBar(touchBar);
    }

    public void setTouchBar(boolean touchBar) {
        this.touchBar = touchBar;
    }

    public boolean isTouchBar() {
        return this.touchBar;
    }

    public void start() {
        super.turnOn("Apple");
        System.out.println("The MacBook is starting!");
    }

}
