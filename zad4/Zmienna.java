package obliczenia;

import java.util.HashMap;

public class Zmienna extends Wyrazenie
{
    private static HashMap<String, Integer> zmienne = new HashMap<>();
    private String zmienna;

    public Zmienna(String zmienna)
    {
        this.zmienna = zmienna;
    }

    public static void dodajZmienna(String zmienna, int wartosc)
    {
        zmienne.put(zmienna, wartosc);
    }

    @Override
    public String toString()
    {
        return zmienna;
    }

    
    public boolean equals(Zmienna obj)
    {
        return obj.zmienna.equals(zmienna);
    }

    @Override
    public int oblicz()
    {
        return zmienne.get(zmienna);
    }
}
