public class Robot extends Character {
    protected int armor;

    public Robot(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }

    @Override
    public void destroy(Destroyable da) {
        // TODO Auto-generated method stub
        if (da instanceof Building) {
            System.out.println("Building has been destroyed! By " + name + ".");
        } else if (da instanceof Tower) {
            System.out.println("Tower has been destroyed! By " + name + ".");
        }
    }
}
