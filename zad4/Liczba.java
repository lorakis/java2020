package obliczenia;

public class Liczba extends Wyrazenie
{
  int liczba;
  public Liczba(int l)
  {
    this.liczba = l;
  }

  @Override
  public String toString()
  {
      return ""+liczba ;
  }


  public boolean equals(Liczba obj)
  {
      return obj.liczba == this.liczba;
  }

  @Override
  public int oblicz()
  {
      return liczba;
  }

}
