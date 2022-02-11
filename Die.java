public class Die {

  private String Dicename;
  private int Dicesides;
  private int DicesideUp;

    public Die() {
        Dicename = "d6";
        Dicesides = 6;
        roll();

    }

  public Die(int Dicesides) {
        this.Dicesides = Dicesides;
        Dicename = "d" + Dicesides;
        roll();
    }

  public Die(int Dicesides, int DicesideUp) {
        this.Dicesides = Dicesides;
        Dicename = "d" + sides;
        this.DicesideUp = DicesideUp;
    }

    //To produce a random value, use the roll technique.
  public void roll() {
        DicesideUp = (int) (1 + Math.random() * Dicesides);
    }

  public String getName() {
        return Dicename;
    }

public int getSides() {
        return Dicesides;
    }

public int getSideUp() {
        return DicesideUp;
    }

    public void setSides(int Dicesides) {
        this.Dicesides = Dicesides;
        Dicename = "d6";
    }

    public void setSideUp(int sideUp) {
        this.DicesideUp = DicesideUp;
    }
}
