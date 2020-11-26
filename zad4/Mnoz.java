package obliczenia;

public class Mnoz extends Wyrazenie
{
    Wyrazenie w1;
    Wyrazenie w2;

    public Mnoz(Wyrazenie w1, Wyrazenie w2)
    {
        this.w1 = w1;
        this.w2 = w2;
    }

    @Override
    public String toString()
    {
        return w1.toString() + " * " + w2.toString();
    }

    
    public boolean equals(Mnoz obj)
    {
        return obj.w1.equals(this.w1) && obj.w2.equals(this.w2);
    }

    @Override
    public int oblicz()
    {
        return w1.oblicz() * w2.oblicz();
    }
}
