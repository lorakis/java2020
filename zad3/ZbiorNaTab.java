package struktury;

public class ZbiorNaTab extends Zbior
{

  public ZbiorNaTab(int x) throws Exception
  {
    if( x < 2) throw new Exception ("Za mały zbiór!");
    zbior = new Para[x];
    rozmiar = x;
    zajete = 0;
  }

  @Override
  public  Para szukaj (String k) throws Exception
  {
    for(int i = 0; i < zajete; i++)
      if( zbior[i].klucz.equals(k))
        return zbior[i];

    throw new Exception("Brak pary!");
  }

  @Override
  public void wstaw (Para p) throws Exception
  {
    for(int i = 0; i < zajete; i++)
    {
      if(zbior[i].equals(p))
        throw new Exception("Taka para już istnieje!");
    }
    if(zajete == rozmiar)
      throw new Exception("Tablica jest pełna!");
    zbior[zajete] = p;
    zajete++;
  }

  @Override
  public void usuń (String k)
  {
    int j = 0;
    for(int i = 0; i < zajete; i++)
    {
      if (zbior[i].klucz.equals(k))
      {
        j = i;
        break;
      }
    }
    for(int i = j; i < rozmiar; i++)
    {
      zbior[i] = zbior[i+1];
    }
    zbior[rozmiar-1] = null;
    zajete--;
  }

  @Override
  public double czytaj (String k) throws Exception
  {
    for(int i = 0; i < zajete; i++)
      if(zbior[i].klucz.equals(k))
        return zbior[i].getter();
    throw new Exception("Brak pary!");

  }

  @Override
  public void ustaw (Para p) throws Exception
  {
    boolean done = false;
    for(int i = 0; i < zajete; i++)
    {
      if(zbior[i].equals(p))
      {
        zbior[i] = p;
        done = true;
      }
    }
    if (zajete==rozmiar)
      throw new Exception("Pełna tablica!");
    if (!done)
    {
      zbior[zajete] = p;
      zajete++;
    }
  }

  @Override
  public void czysc ()
  {
    for(int i = 0; i < rozmiar; i++)
      zbior[i] = null;
  }

  @Override
  public int ile ()
  {
    return zajete;
  }


}
