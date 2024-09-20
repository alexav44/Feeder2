public class Main
{
     public static void main(String[] args)
  {
      Feeder f = new Feeder();
      System.out.println(f);
      //System.out.println(f.currentFood);
      System.out.println(f.getcurrentFood());
      Feeder g = new Feeder(500);
      System.out.println(g.getcurrentFood());
      g.simulateOneDay(12);
      System.out.println(g.getcurrentFood());

  }
}