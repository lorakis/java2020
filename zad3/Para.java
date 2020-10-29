package struktury;


public class Para {

  public final String klucz;
  private double wartość;

  public Para(String s)
  {
    klucz = s;
  }

  public Para(String s, double x)
  {
    this(s);
    wartość = x;
  }

  public double getter()
  {
    return wartość;
  }

  public void setter(double x)
  {
    wartość = x;
  }

  @Override
  public String toString()
  {
    return klucz+"->"+ wartość;
  }

  public boolean equals(Object o)
  {
    if(this == o)
      return true;
    if( ( o == null) || (getClass() != o.getClass()))
      return false;
    Para p = (Para) o;
    return wartość == p.wartość;
  }

}
