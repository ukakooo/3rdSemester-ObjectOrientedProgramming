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
        System.out.println("\nInheritted objects:");
        LivingRoomTV tv2 = new LivingRoomTV();
        LivingRoomAC ac2 = new LivingRoomAC();
        tv2.setBrand("Samsung");
        tv2.setPixel("3840x2160px");
        tv2.setColor("Black");
        tv2.setRemoteBrand("Samsung");
        tv2.setBatteryBrand("ABC");
        tv2.printDetails();
        ac2.setBrand("Panasonic");
        ac2.setModel("Bleh-1234");
        ac2.setColor("White");
        ac2.setRemoteBrand("Panasonic");
        ac2.setBatteryBrand("ABC");
        ac2.printDetails();
    }
}
