package Assignment;

public class Drawer extends Cupboard {
    boolean[] drawer = new boolean[3];

    public void openDrawer (int whichDrawer, boolean openStatus) {
        drawer[whichDrawer] = openStatus;
    }

    public void printStatus() {
        super.printDetails();
        for(int i = 0; i < drawer.length; i++) {
            System.out.println("Is drawer " + i + " opened?: " + drawer[i]);
        }
    }
}
