public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();

        // Creates a new object named "mage" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();

        // Creates a new object named "mage" from Character class
        Character archer = new Character(7, 9, 10, "Wolverine");
        // Calls the sayMyName method
        archer.sayMyName();

        // Creates a new object named "mage" from Character class
        Character priest = new Character(5, 10, 0, "Wendy");
        // Calls the sayMyName method
        priest.sayMyName();

        Item magicbracelet = new Item();
        magicbracelet.price = 50;
        magicbracelet.weight = 3.4;
        magicbracelet.quantity = 1;
        magicbracelet.description = "This bracelet can remove curses from enemy";
        magicbracelet.canbetraded = true;
        magicbracelet.getdescription();

        Item ballnidawson = new Item();
        ballnidawson.price = 1000;
        ballnidawson.weight = 10.10;
        ballnidawson.quantity = 1;
        ballnidawson.description = "Ballnidawson explodes when there's an enemy near 10km";
        ballnidawson.canbetraded = false;
        ballnidawson.getdescription();

        Pet dog = new Pet();
        dog.name = "Sasuke";
        dog.trustlevel = 10;
        dog.petlevel = 20;
        dog.ishappy = true;
        dog.sayPetName();

        Pet cat= new Pet();
        cat.name = "Talon";
        cat.trustlevel = 100;
        cat.petlevel = 3;
        cat.ishappy = true;
        cat.sayPetName();
    
    }
}
