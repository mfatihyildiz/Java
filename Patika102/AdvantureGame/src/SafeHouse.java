import java.lang.annotation.Documented;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player) {
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Your are in the safe house.\nYour health restored.");
        this.getPlayer().setHealth(getPlayer().getOriginalHealth());
        return true;
    }
}
