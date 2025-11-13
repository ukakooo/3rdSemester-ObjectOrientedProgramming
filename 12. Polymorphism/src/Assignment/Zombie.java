package Assignment;

public abstract class Zombie implements Destroyable {
    protected int health, level;

    public abstract void heal();

    public String getZombieInfo() {
        return "Health: " + health + "\nLevel: " + level + "\n";
    }
}
