package obliczenia;

public class Silnia extends Wyrazenie
{
    Wyrazenie w1;

    public Silnia(Wyrazenie w1)
    {
        this.w1 = w1;
    }

    @Override
    public String toString()
    {
        return w1.toString() + "!";
    }

    public boolean equals(Silnia obj)
    {
        return obj.w1.equals(this.w1);
    }

    @Override
    public int oblicz()
    {
      int res = 1;
      for (int i=2; i<=w1.oblicz(); i++)
          res *= i;
      return res;
    }
}
