package Assignment;

public class JumpingZombie extends Zombie{
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                //Zombie healed by 30% in lv 1
                health += health * 0.3;
                break;
            case 2:
                //Zombie healed by 40% in lv 2
                health += health * 0.4;
                break;
            case 3:
                //Zombie healed by 50% in lv 3
                health += health  *0.5;
                break;
        }
    }

    @Override
    public void destroyed() {
        //Zombie got rekt by 1%
        health -= health * 0.01;
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data =\n" + super.getZombieInfo();
    }
}
