package struktury;

public abstract class ZbiorNaTab extends Zbior
{
  private int rozmiar;
  private int zajete;
  private Para [] zbior;

  public Zbior(int x)
  {
    if( x < 2) throw new Exception ("Za mały zbiór!");
    zbior = new Para[x]
    rozmiar = x;
    zajete = 0;
  }



}
