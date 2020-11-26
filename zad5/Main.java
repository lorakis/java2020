
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import structures.OrderedList;


public class Main
{
  public static void main(String[] args) throws Exception
  {
    OrderedList<Integer> o1 = new OrderedList<>();
    o1.insert(4);
    o1.insert(3);
    o1.insert(5);
    o1.insert(7);
    o1.insert(31);
    o1.insert(1);

    for (Object obj : o1)
    {
      System.out.println(obj);
    }

    if(o1.search(5))
      System.out.println("5 jest na liscie");
    else
      System.out.println("5 nie ma na liscie");

    o1.remove(31);

    for (Object obj : o1)
    {
      System.out.println(obj);
    }

    System.out.println("min: " + o1.min());
    System.out.println("max: " + o1.max());

    System.out.println("index 7: " + o1.index(7));



    OrderedList<String> o2 = new OrderedList<>();
    o2.insert("x");
    o2.insert("d");
    o2.insert("a");
    o2.insert("z");
    o2.insert("j");

    for (Object obj : o2)
    {
      System.out.println(obj);
    }

    if(o2.search("v"))
      System.out.println("v jest na liscie");
    else
      System.out.println("v nie ma na liscie");

    o2.remove("a");

    for (Object obj : o2)
    {
      System.out.println(obj);
    }

    System.out.println("min: " + o2.min());
    System.out.println("max: " + o2.max());

    System.out.println("index x: " + o2.index("x"));



    OrderedList<Calendar> o3 = new OrderedList<>();
    o3.insert(new GregorianCalendar(2005,2,17));
    o3.insert(new GregorianCalendar(1000,11, 2));
    o3.insert(new GregorianCalendar(1999,4,28));
    o3.insert(new GregorianCalendar(31,1,3));
    o3.insert(new GregorianCalendar(2000,10,10));

    for (Calendar obj : o3)
    {
      Date x = obj.getTime();
      System.out.println(x);
    }

    if(o3.search(new GregorianCalendar(1999,4,28)))
      System.out.println("1999.05.28 jest na liscie");
    else
      System.out.println("1999.05.28 nie ma na liscie");

    o3.remove(new GregorianCalendar(1999,4,28));

    for (Calendar obj : o3)
    {
      Date x = obj.getTime();
      System.out.println(x);
    }

    System.out.println("min: " + o3.min().getTime());
    System.out.println("max: " + o3.max().getTime());

    System.out.println("index 1000.12.2: " + o3.index(new GregorianCalendar(1000,11, 2)));
  }
}
