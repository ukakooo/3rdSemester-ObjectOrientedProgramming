public class TestPatrolRobot {
    public static void main(String[] args) {
        Battery batt = new Battery();
        PatrolRobot pr = new PatrolRobot("ASIMO", 2048, 150, new Battery(16000));

        pr.increasePower();

        System.out.println("Name: " + pr.Name);
        System.out.println("CPUSpeed: " + pr.CPUSpeed);
        System.out.println("Power: " + pr.Power);

        // Add a code to show battery capaicty using pr object (Patrol Robot)
        System.out.println("Battery Capacity: " + pr.RobotBattery.capacity);
    }
}