public class DiceGame {

    public static void main(String[] args) {
// In each dice, it shows which side is up first.
System.out.println("Creating a default d6...");
        Die d6 = new Die();

System.out.println("Creating a default d20...");
        Die d20 = new Die(20);

System.out.println("reating percentile die (a special d10)...");
        Die d10 = new Die(10);


System.out.println("The current side up for " + d6.getName() + " is " + d6.getSideUp());

System.out.println("The current side up for " + d20.getName() + " is " + d20.getSideUp());

System.out.println("The current side up for Percentile  is " + d10.getSideUp());

//procedure of a test roll
System.out.println("\nTesting the roll method");

//To get new value, roll the dice d6
System.out.println("Rolling the d6...");
        d6.roll();
System.out.println("The new value is " + d6.getSideUp());

// To get new value, role d20
System.out.println("Rolling the d20...");
        d20.roll();
System.out.println("The new value is " + d20.getSideUp());

//To get new value, role d10
System.out.println("Rolling the Percentile...");
        d10.roll();
System.out.println("The new value is " + d10.getSideUp());

//final last step
System.out.println("\nSetting the d20 to show 20...");
        d20.setSideUp(20);

System.out.println("The side up is now " + d20.getSideUp() + ". Finally.");
    }
}
