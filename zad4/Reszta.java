package obliczenia;

public class Reszta extends Wyrazenie
{
    Wyrazenie w1;
    Wyrazenie w2;

    public Reszta(Wyrazenie w1, Wyrazenie w2)
    {
        this.w1 = w1;
        this.w2 = w2;
    }

    @Override
    public String toString()
    {
        return w1.toString() + " / " + w2.toString() + "+" + (w1.oblicz() - ((w1.oblicz() / w2.oblicz())*w2.oblicz())) + "R";
    }

    public boolean equals(Reszta obj)
    {
        return obj.w1.equals(this.w1) && obj.w2.equals(this.w2);
    }

    @Override
    public int oblicz()
    {
        return w1.oblicz() - ((w1.oblicz() / w2.oblicz())*w2.oblicz());
    }
}
