package struktury;

public class ZbiorNaTabDyna extends ZbiorNaTab
{
  public ZbiorNaTabDyna() throws Exception
  {
    super(2);
  }

  @Override
  public void wstaw(Para p) throws Exception
  {
    if( zajete == rozmiar)
    {
      Para zb[] = new Para[zajete];
      System.arraycopy(zbior, 0, zb, 0, rozmiar);
      zbior = new Para[zajete*2];
      System.arraycopy(zb, 0, zbior, 0, zb.length);
    }
    for(int i = 0; i < zajete; i++)
    {
      if (zbior[i].equals(p))
        throw new Exception("Taka para już istnieje!");
    }
    zbior[zajete] = p;
    zajete++;
  }

  @Override
  public void ustaw(Para p) throws Exception
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
    if( zajete == rozmiar)
    {
      Para zb[] = new Para[zajete];
      System.arraycopy(zbior, 0, zb, 0, rozmiar);
      zbior = new Para[zajete*2];
      System.arraycopy(zb, 0, zbior, 0, zb.length);
    }
    if (!done)
    {
      zbior[zajete] = p;
      zajete++;
    }
  }

  public void usuń(String k)
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
    if(zajete < rozmiar/4)
    {
      Para zb[] = new Para[zajete];
      zbior = new Para[zajete*2];
      System.arraycopy(zb, 0, zbior, 0, zb.length);
    }
  }

}
