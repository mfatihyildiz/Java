import java.util.Scanner;

public class Player {
    Scanner inp=new Scanner(System.in);
    private int damage;
    private int health;
    private int originalHealth;
    private int money;
    private String name;
    private String heroClass;
    private Inventory inventory;

    public Player(String name) {
        this.name = name;
        this.inventory=new Inventory();
    }

    public int getDamage() {
        return damage+inventory.getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(String heroClass) {
        this.heroClass = heroClass;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void selectClass(){
        Classes[] classList={new Samurai(),new Archer(),new Knight()};
        System.out.println("---------------------");
        for (Classes classes: classList) {
            System.out.println("ID: "+classes.getId()+"\nClass: "+classes.getName()+"\nDamage: "+classes.getDamage()+"\nHealth: "+classes.getHealth()+"\nMoney: "+classes.getMoney()+"\n---------------------");
        }

        System.out.print("Choose a class: ");
        int selectedClass=inp.nextInt();

        switch (selectedClass){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
        }
        //System.out.println("Your class: "+this.getName()+"\nDamage: "+this.getDamage()+"\nHealth: "+this.getHealth()+"\nMoney: "+this.getMoney());
    }

    public void printInfo(){
        System.out.println("Class: "+this.getHeroClass()+"\nHealth: "+this.getHealth()+"\nMoney: "+this.getMoney()+
                "\nWeapon: "+this.getInventory().getWeapon().getName()+"\nDamage: "+this.getDamage()+
                "\nArmor: "+this.getInventory().getArmor().getName()+"\nBlock:"+this.getInventory().getArmor().getBlock());
    }
    public void initPlayer(Classes classes){
        this.setDamage(classes.getDamage());
        this.setHealth(classes.getHealth());
        this.setOriginalHealth(classes.getHealth());
        this.setMoney(classes.getMoney());
        this.setHeroClass(classes.getName());
    }
}
