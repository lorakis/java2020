
public class Spirala
{
  public static boolean isPrime(int x)
  {
    if(x == 1)
      return false;
    for(int i = 2; i <= x/2; i++)
      if(x % i == 0 )
        return false;
    return true;
  }

  public static void main (String[] args)
  {
    int n = Integer.valueOf(args[0]);
    int tab[][];
    if(n < 2 || n > 200)
      throw new IllegalArgumentException("n musi być w przedziale [2,200]");

    tab = new int[n][n];
    int x,y;
    y = n/2;
    if(n%2 == 0)
      x = n/2 - 1;
    else
      x = n/2;

    int i = 1;
    int oile = 1;
    int ilenaile = 0;
    char kier = 'r';
    int ktoryraz = 1;
    tab[x][y] = i;
    i++;
    while( i <= n*n)
    {

      if(kier == 'r')
      {
        x++;
        tab[x][y] = i;
        ilenaile++;
        if(ilenaile == oile)
        {
          ilenaile = 0;
          kier = 'u';
          if(ktoryraz < 2)
          {
            ktoryraz++;
          }
          else
          {
            ktoryraz = 1;

          }
        }
      }
      else if(kier == 'u')
      {
        y--;
        tab[x][y] = i;
        ilenaile++;
        if(ilenaile == oile)
        {
          ilenaile = 0;
          kier = 'l';
          if(ktoryraz < 2)
          {
            ktoryraz++;

          }
          else
          {
            ktoryraz = 1;
            oile++;
          }
        }
      }
      else if(kier == 'l')
      {
        x--;
        tab[x][y] = i;
        ilenaile++;
        if(ilenaile == oile)
        {
          ilenaile = 0;
          kier = 'd';
          if(ktoryraz < 2)
          {
            ktoryraz++;
          }
          else
          {
            ktoryraz = 1;

          }
        }
      }
      else if(kier == 'd')
      {
        y++;
        tab[x][y] = i;
        ilenaile++;
        if(ilenaile == oile)
        {
          ilenaile = 0;
          kier = 'r';
          if(ktoryraz < 2)
          {
            ktoryraz++;
          }
          else
          {
            ktoryraz = 1;
            oile++;
          }
        }
      }

      i++;
    }

    for(int k=0; k<tab.length; k++)
    {
      for (int j=0; j<tab[k].length; j++)
        if( !isPrime(tab[j][k]) )
          tab[j][k] = 0;
    }


    for(int k=0; k<tab.length; k++)
    {
      for (int j=0; j<tab[k].length; j++)
        if(tab[j][k] == 0)
          System.out.print("  ");
        else
          System.out.print("* ");
      System.out.println();
    }
  }
}
