import java.util.Scanner;

public class Game {
    public void start(){
        Scanner inp=new Scanner(System.in);
        System.out.println("Welcome to the adventure game! ");
        System.out.print("Enter hero name: ");
        String heroName=inp.nextLine();

        Player player=new Player(heroName);
        System.out.println(player.getName()+" the adventurer has landed to the Misty Island!\n");

        System.out.println("Classes");
        player.selectClass();
        Location location=null;
        while (true){
            player.printInfo();
            System.out.print("\nLocations\n1- Safe House\n2- Blacksmith\n3- Cave\n4- Forest\n5- River\n" +
                    "0- Exit Game\nSelect the location that you want to go: ");
            int selectedLocation=inp.nextInt();
            switch (selectedLocation){
                case 0:
                    location=null;
                    break;
                case 1:
                    location=new SafeHouse(player);
                    break;
                case 2:
                    location=new Blacksmith(player);
                    break;
                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;
                default:
                    System.out.println("\nSelect a valid place to go!\n");
                    continue;
            }
            if (location == null) {
                System.out.println(player.getName()+" gave up too early!");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("You Died!");
                break;
            }
        }
    }
}
