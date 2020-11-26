package obliczenia;

public class Stala extends Wyrazenie
{

    int stala;

    public Stala(int stala)
    {
        this.stala = stala;
    }

    @Override
    public String toString()
    {
        return ""+stala;
    }


    public boolean equals(Stala obj)
    {
        return obj.stala == this.stala;
    }

    @Override
    public int oblicz()
    {
        return stala;
    }
}
