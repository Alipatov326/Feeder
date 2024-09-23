public class Main
{
    public static void main(String[] args)
    {
        Feeder g = new Feeder(500);
        int random = (int)(Math.random() * 50 + 1);
        Feeder i = new Feeder(100);
        i.simulateOneDay(5);
        System.out.println(i);
        Feeder j = new Feeder(0);
        System.out.println(j.simulateManyDays(5, 10));

    }

}
