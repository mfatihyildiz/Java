import java.util.Random;

public class BattleLoc extends Location {
    Monster monster;
    private String award;
    private int maxMonster;

    public BattleLoc(Player player, String name,Monster monster,String award,int maxMonster) {
        super(player, name);
        this.monster=monster;
        this.award=award;
        this.maxMonster=maxMonster;
    }

    @Override
    public boolean onLocation(){
        int randomMonsterNumber=randomMonsterNumber();
        System.out.println("\nThere is "+randomMonsterNumber+" "+this.getMonster().getName()+"(s) ahead!\n");
        System.out.println("1- Fight\n2- Run");
        int battleCase =inp.nextInt();
        if (battleCase == 1) {
            if (combat(randomMonsterNumber)) {
                System.out.println("You cleared the "+this.getName()+"\n");
                return true;
            }else{
                if (this.getPlayer().getHealth()<=0) {
                    System.out.println("\n"+this.getMonster().getName()+" killed you in the "+this.getName()+"\n");
                    return false;
                }else {
                    System.out.println("While running you get "+(this.getMonster().getDamage()/2)+" damage\n");
                    int monsterDamage=(this.getMonster().getDamage()/2)-this.getPlayer().getInventory().getArmor().getBlock();
                    if (monsterDamage <0)
                        monsterDamage=0;
                    this.getPlayer().setHealth(this.getPlayer().getHealth()-monsterDamage);

                    if (this.getPlayer().getHealth()>0) {
                        System.out.println("You escaped from the "+this.getName()+"\n");
                        return true;
                    }else {
                        System.out.println("You tried to escape from "+this.getName()+" but you failed and died!");
                        return false;
                    }
                }
            }
        }else if(battleCase==2){
            if (this.getPlayer().getHealth()>0) {
                System.out.println("You escaped\n");
                return true;
            }else {
                System.out.println("GAME OVER");
                return false;
            }
        }
        return true;
    }

    public boolean combat(int monsterNumber){
        int monsterHealth=this.getMonster().getHealth();
        for (int i=1;i<=monsterNumber;i++){
            this.getMonster().setHealth(monsterHealth);
            playerStats();
            System.out.println("\n"+this.getMonster().getName()+" number "+i+":");
            monsterStat();
            while(this.getPlayer().getHealth()>0&&monsterHealth>0){
                System.out.println("\n1- Attack\n2-Run");
                int combatCase=inp.nextInt();
                if (combatCase == 1) {
                    System.out.println("You hit "+this.getPlayer().getDamage()+" damage to "+this.getMonster().getName());
                    this.getMonster().setHealth(this.getMonster().getHealth()-this.getPlayer().getDamage());
                    if (this.getMonster().getHealth() <0) {
                        System.out.println("\nYou killed "+this.getMonster().getName()+" number "+i+"\n");
                        System.out.println(this.getMonster().getName()+" dropped "+this.getMonster().getGold()+" gold\n");
                        this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getMonster().getGold());
                        break;
                    }
                    System.out.println(this.getMonster().getName()+" hit "+this.getMonster().getDamage()+" damage to you");
                    int monsterDamage=this.getMonster().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                    if (monsterDamage <0)
                        monsterDamage=0;
                    this.getPlayer().setHealth(this.getPlayer().getHealth()-monsterDamage);
                    if (this.getPlayer().getHealth() <=0) return false;

                    playerStats();
                    System.out.println("\n"+this.getMonster().getName()+" number "+i+":");
                    monsterStat();
                }else if(combatCase==2){
                    return false;
                }else System.out.println("\nEnter a valid action!\n");
            }
        }
        return true;
    }

    public void playerStats(){
        System.out.println("----- Player Stats -----");
        System.out.println("Health: "+this.getPlayer().getHealth());
        System.out.println("Weapon: "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Damage: "+this.getPlayer().getDamage());
        System.out.println("Armor: "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block: "+this.getPlayer().getInventory().getArmor().getBlock());
    }
    public void monsterStat(){
        System.out.println("----- "+this.getMonster().getName()+" -----");
        System.out.println("Health: "+this.getMonster().getHealth());
        System.out.println("Damage: "+this.getMonster().getDamage());
    }

    public int randomMonsterNumber(){
        Random r =new Random();
        return r.nextInt(this.getMaxMonster())+1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}