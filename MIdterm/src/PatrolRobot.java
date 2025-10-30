public class PatrolRobot extends Robot{
    protected Battery RobotBattery;

    PatrolRobot (String Name, int CPUSpeed, int Power, Battery battery) {
        this.Name = "PATROL " + Name;
        this.CPUSpeed = CPUSpeed;
        this.Power = Power;
        RobotBattery = battery;
    }

    public void increasePower() {
        this.Power += 20;
    }
}
