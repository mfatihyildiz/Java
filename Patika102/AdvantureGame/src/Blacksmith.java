import java.util.Scanner;

public class Blacksmith extends NormalLoc{
    public Blacksmith(Player player) {
        super(player,"Blacksmith");
    }

    public boolean onLocation(){
        System.out.println("\nYou entered the Blacksmith");
        System.out.println("1- Weapons\n2- Armors\n3- Exit");
        int selectedCase=inp.nextInt();

        switch (selectedCase){
            case 1:
                showWeapons();
                buyWeapon();
                break;
            case 2:
                showArmors();
                buyArmor();
                break;
            case 3:
                return true;
        }
        return true;
    }

    public void showWeapons(){
        System.out.println("----- Weapons -----");
        for (Weapon w:Weapon.weapons()) {
            System.out.println(w.getId()+"- "+w.getName()+"    Damage: "+w.getDamage()+" Price: "+w.getPrice());
        }
    }

    public void buyWeapon(){
        System.out.print("Choose a weapon: ");
        int selectedWeaponId=inp.nextInt();

        Weapon selectedWeapon=Weapon.getWeaponObjById(selectedWeaponId);

        if (selectedWeapon != null) {
            if (selectedWeapon.getPrice() >this.getPlayer().getMoney()) {
                System.out.println("You don't have enough money!");
            }else{
                System.out.println("\n"+selectedWeapon.getName()+" added to your inventory.");

                int newMoney=this.getPlayer().getMoney()-selectedWeapon.getPrice();
                this.getPlayer().setMoney(newMoney);
                System.out.println("New balance: "+this.getPlayer().getMoney()+"\n");

                this.getPlayer().getInventory().setWeapon(selectedWeapon);
                System.out.println("Your weapon changed to "+this.getPlayer().getInventory().getWeapon().getName());
            }
        }
    }

    public void showArmors(){
        System.out.println("----- Armors -----");

        for (Armor a:Armor.armors()) {
            System.out.println(a.getId()+"- "+a.getName()+" Armor   Block: "+a.getBlock()+" Price: "+a.getPrice());
        }
    }

    public void buyArmor(){
        System.out.print("Choose a armor: ");
        int selectedArmorId=inp.nextInt();

        Armor selectedArmor=Armor.getArmorObjById(selectedArmorId);

        if (selectedArmor != null) {
            if (selectedArmor.getPrice() >this.getPlayer().getMoney()) {
                System.out.println("You don't have enough money!");
            }else{
                System.out.println("\n"+selectedArmor.getName()+" added to your inventory.");

                int newMoney=this.getPlayer().getMoney()-selectedArmor.getPrice();
                this.getPlayer().setMoney(newMoney);
                System.out.println("New balance: "+this.getPlayer().getMoney()+"\n");

                this.getPlayer().getInventory().setArmor(selectedArmor);
                System.out.println("Your armor changed to "+this.getPlayer().getInventory().getArmor().getName());
            }
        }
    }
}