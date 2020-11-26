package obliczenia;

public class PrzeciwnyZnak extends Wyrazenie
{
    Wyrazenie w1;
    Wyrazenie w2;

    public PrzeciwnyZnak(Wyrazenie w1)
    {
        this.w1 = w1;
    }

    @Override
    public String toString()
    {
        return "-" +  w1.toString();
    }

    public boolean equals(PrzeciwnyZnak obj)
    {
        return obj.w1.equals(this.w1);
    }

    @Override
    public int oblicz()
    {
        return -w1.oblicz();
    }
}
