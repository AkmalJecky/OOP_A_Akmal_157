// Superclass modul3.GameCharacter
class GameCharacter {
    private String name;
    private int health;

    public GameCharacter(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(GameCharacter target) {
        // This method will be overridden by subclasses
    }
}

// Subclass modul3.Hero
class Hero extends GameCharacter {
    public Hero(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(getName() + " attacks " + target.getName() + " using a sword!");
        target.setHealth(target.getHealth() - 20);
        System.out.println(target.getName() + " now has " + target.getHealth() + " health.");
    }
}

// Subclass modul3.Enemy
class Enemy extends GameCharacter {
    public Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println(getName() + " attacks " + target.getName() + " using magic!");
        target.setHealth(target.getHealth() - 15);
        System.out.println(target.getName() + " now has " + target.getHealth() + " health.");
    }
}


// Main class
public class Main {
    public static void main(String[] args) {
        GameCharacter general = new GameCharacter("General Character", 100);
        Hero hero = new Hero("Brimstone", 150);
        Enemy enemy = new Enemy("Viper", 200);

        // Display initial health
        System.out.println("Initial status:");
        System.out.println(hero.getName() + " has health: " + hero.getHealth());
        System.out.println(enemy.getName() + " has health: " + enemy.getHealth());
        System.out.println();

        // Simulate battle
        hero.attack(enemy);  // Brimstone attacks Viper
        hero.attack(enemy);  // Brimstone attacks again
        enemy.attack(hero);  // Viper attacks Brimstone
    }
}
