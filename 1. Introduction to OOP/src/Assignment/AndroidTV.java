package Assignment;

public class AndroidTV extends Television {
    String displayOutput;

    public void setDisplayOutput(String newValue) {
        displayOutput = newValue;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Display output: " + displayOutput);
    }
}
