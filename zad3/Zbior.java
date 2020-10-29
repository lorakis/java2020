package struktury;

public abstract class Zbior
{
  protected int zajete;
  protected int rozmiar;
  protected Para [] zbior;

  public abstract Para szukaj (String k) throws Exception;

  public abstract void wstaw (Para p) throws Exception;

  public abstract void usuń (String k);

  public abstract double czytaj (String k) throws Exception;

  public abstract void ustaw (Para p) throws Exception;

  public abstract void czysc ();

  public abstract int ile ();
}
