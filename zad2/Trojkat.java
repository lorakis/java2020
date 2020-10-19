package geo;
public class Trojkat
{
  Punkt a, b, c;
  public Trojkat(Punkt a, Punkt b, Punkt c)
  {
    if(!geo.Punkt.rozne(a, b) || !geo.Punkt.rozne(b, c) || !geo.Punkt.rozne(c, a)) ;
    if(geo.Punkt.wspolliniowe(a, b, c)) ;
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public String toString()
  {
    return "(" + a.toString() + ", " + b.toString() + ", " + c.toString()+")";
  }

  public void przesun(Wektor v)
  {
    a.przesun(v);
    b.przesun(v);
    c.przesun(v);
  }

  public void obroc(Punkt p, double kat)
  {
    a.obroc(p, kat);
    b.obroc(p, kat);
    c.obroc(p, kat);
  }

  public void odbij(Prosta p)
  {
    a.odbij(p);
    b.odbij(p);
    c.odbij(p);
  }

}
