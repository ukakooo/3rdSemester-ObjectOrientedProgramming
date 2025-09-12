package MotorEncapsulation;

public class Motor {

    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void printStatus () {
        if (kontakOn) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan :" + kecepatan + "\n");
    }
}