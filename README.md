# A-Die-Game-With-Java
A Die Game Made With Java ( An Assignment of My Course )

# 1. Assign3 class // Main class
       public static void main(String[]) // Assignment 3 main
# 2. Die class // This class models a single die
       private int dieValue // holds the value of the ONE die
       private Random randomNumbers // common random number generator
       public Die() // default (no-arg) constructor
       public void rollDie() // Generate a random value for die
       public void displayDie() // Displays the value of die
       public int getValue() // Returns value of die
# 3. Game class // This class contains the logic of die betting Game
       private int potAmount // holds the value of the pot
       private int betAmount // holds the bet value
       private String betType  // holds the bet type
       private Scanner input // common scanner
       public Game() // default (no-arg) constructor
       public void getBetFromUser() // prompts the user to enter a valid bet amount and type
       public void playGame() // logic for the game
