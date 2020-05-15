package work.kozh.utils;

public class Manager {

    private static Manager manager;

    public static Manager getInstance() {
        if (manager == null) {
            return new Manager();
        }
        return manager;
    }

    private boolean hasHeader;

    public boolean isHasHeader() {
        return hasHeader;
    }

    public void setHasHeader(boolean hasHeader) {
        this.hasHeader = hasHeader;
    }
}
