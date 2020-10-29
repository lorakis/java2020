package struktury;

public class Zadanie3 {


  public static void main(String[] args) throws Exception
  {
    Para a = new Para("a", 32);
    Para b = new Para("b", 13);
    Para c = new Para("c", 1);
    System.out.println("a: "+a.toString());
    ZbiorNaTab z = new ZbiorNaTab(3);
    z.wstaw(a);
    z.wstaw(b);
    z.wstaw(c);
    System.out.println("z[b]: "+z.szukaj("b").toString());
  }

}
