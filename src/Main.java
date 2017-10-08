/**
 * Created by stephenboynton on 6/30/17.
 */
public class Main {

    public static void main (String[] args) {

//        Player stephen = new Player();
//        stephen.name = "Stephen";
//        stephen.health = 20;
//        stephen.weapon = "Ice";
//
//        int damage = 10;
//        stephen.loseHealth(damage);
//
//        System.out.println(stephen.healthRemaining());

        EnhancedPlayer stephen = new EnhancedPlayer("Stephen", 75, "Oathkeeper");
        System.out.println("Player health is " + stephen.getHealth() + " HP.");


    }

}
