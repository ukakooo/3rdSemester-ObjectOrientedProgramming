public class Monster extends Character {
    protected int power;

    public Monster(String name, int power) {
        this.name = name;
        this.power = power;
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
