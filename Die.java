//Name: Hoshmandeep kaur
//Student number: A00227084
public class Die {

// Three variables
  private String Dicename;
  private int Dicesides;
  private int DicesideUp;

// Die class is used
//0 argument
    public Die() {
        Dicename = "d6";
        Dicesides = 6;
        roll(); // role method is used

    }
// die constructer with 1 argument
  public Die(int Dicesides) {
        this.Dicesides = Dicesides;
        Dicename = "d" + Dicesides;
        roll(); // Role method is used
    }

// die constructer with 2 argumen
  public Die(int Dicesides, int DicesideUp) {
        this.Dicesides = Dicesides;
        Dicename = "d" + Dicesides;
        this.DicesideUp = DicesideUp;
    }

    //To produce a random value, use the roll technique.
  public void roll() {
        DicesideUp = (int) (1 + Math.random() * Dicesides);
    }
// I used this for Dicename
  public String getName() {
        return Dicename;
    }

// I used this for Dicesides
public int getSides() {
  return Dicesides;
}

// I used this for Dicesideup
public int getSideUp() {
        return DicesideUp;
    }

    public void setSides(int Dicesides) {
        this.Dicesides = Dicesides;
        Dicename = "d6";// This is number of sides
    }

    public void setSideUp(int sideUp) {
        this.DicesideUp = DicesideUp;
    }
}
