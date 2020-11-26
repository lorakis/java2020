package obliczenia;

public class Max extends Wyrazenie
{
    Wyrazenie w1;
    Wyrazenie w2;

    public Max(Wyrazenie w1, Wyrazenie w2)
    {
        this.w1 = w1;
        this.w2 = w2;
    }

    @Override
    public String toString()
    {
        return "max(" + w1.toString() + " , " + w2.toString() + " )" ;
    }

    public boolean equals(Max obj)
    {
        return obj.w1.equals(this.w1) && obj.w2.equals(this.w2);
    }

    @Override
    public int oblicz()
    {
        return Math.max(w1.oblicz(), w2.oblicz());
    }
}
