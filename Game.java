public class Game {
    public static void main(String[] args) 
    {
        Player one = new Player("Kicke");
        Weapon Sword = new Weapon("Steel Sword", 100);
        System.out.println(one.name + " has joined the game");
        System.out.println(one.name + " has picked up a " + Sword.Wname + " which deals " + Sword.WDamage + " damage");
    
    }
}
