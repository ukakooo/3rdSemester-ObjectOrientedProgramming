package Assignment;

public class Demo {
    public static void main(String[] args) {
        Sofa sofa = new Sofa();
        Cupboard cupboard = new Cupboard();
        Television tv1 = new Television();
        AirConditioner ac = new AirConditioner();

        // Setting values
        sofa.setBrand("IKEA");
        sofa.setMaterial("Fabric");
        sofa.setColor("Brown");
        sofa.printDetails();
        cupboard.setBrand("IKEA");
        cupboard.setMaterial("Wood");
        cupboard.setColor("Light Brown");
        cupboard.printDetails();
        tv1.setBrand("Samsung");
        tv1.setPixel("3840x2160px");
        tv1.setColor("Black");
        tv1.printDetails();
        ac.setBrand("Panasonic");
        ac.setModel("Bleh-1234");
        ac.setColor("White");
        ac.printDetails();

        //Inheritted objects
        //Drawer
        Drawer drawer = new Drawer();
        drawer.setBrand("IKEA");
        drawer.setMaterial("Wood");
        drawer.setColor("Light Brown");
        drawer.openDrawer(0, true);
        drawer.openDrawer(1, false);
        drawer.openDrawer(2, true);
        drawer.printStatus();

        //AndroidTV
        AndroidTV androidTV = new AndroidTV();
        androidTV.setBrand("Samsung");
        androidTV.setPixel("3840x2160px");
        androidTV.setColor("Black");
        androidTV.setDisplayOutput("Netflix");
        androidTV.printDetails();
    }
}
