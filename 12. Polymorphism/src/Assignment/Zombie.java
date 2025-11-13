package Assignment;

public abstract class Zombie implements Destroyable {
    protected int health, level;

    public abstract void heal();

    @Override
    public abstract void destroyed();

    public String getZombieInfo() {
        return "Health: " + (int) this.health + "\nLevel: " + this.level + "\n";
    }
}
