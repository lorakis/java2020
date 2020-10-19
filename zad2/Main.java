package geo;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Punkt:");
    Punkt p1 = new Punkt(3,2);
    Punkt p2 = new Punkt(1,5);
    Punkt p3 = new Punkt(2,1);
    System.out.println("p1: "+p1.toString());
    System.out.println("p2: "+p2.toString());
    p1.obroc(p2,90);
    System.out.println("p1 po obroceniu o 90* wzgledem p2: "+p1.toString());

    System.out.println("Wektor:");
    Wektor v1 = new Wektor(1,2);
    Wektor v2 = new Wektor(3,3);
    Wektor v3 = Wektor.suma(v1,v2);
    System.out.println(v1.toString()+ " + "+ v2.toString() + " =");
    System.out.println(v3.toString());

    System.out.println("Odcinek:");
    Odcinek odc = new Odcinek(p2,p3);
    System.out.println("odc z punktow p2 i p3: "+odc.toString());

    System.out.println("Prosta:");
    Prosta pr = new Prosta(2,2,4);
    System.out.println("pr: "+pr.toString());


    System.out.println("Trojkat:");
    Trojkat t = new Trojkat(p1,p2,p3);
    System.out.println("t: "+t.toString());

    t.odbij(pr);
    System.out.println("t po odbiciu wzgledem prostej pr: "+t.toString());
    t.przesun(v2);
    System.out.println("t przesuniete o wektor v2: "+t.toString());
  }
}
