package obliczenia;

public class MniejszeRowne extends Wyrazenie
{
    Wyrazenie w1;
    Wyrazenie w2;

    public MniejszeRowne(Wyrazenie w1, Wyrazenie w2)
    {
        this.w1 = w1;
        this.w2 = w2;
    }

    @Override
    public String toString()
    {
        return w1.toString() + " <= " + w2.toString();
    }

    public boolean equals(MniejszeRowne obj)
    {
        return obj.w1.equals(this.w1) && obj.w2.equals(this.w2);
    }

    @Override
    public int oblicz()
    {
      if(w1.oblicz() <= w2.oblicz())
        return 1;
      else
        return 0;
    }
}
