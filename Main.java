public class Main
{
    public static void main(String[] args)
    {
        //Test 1
        Feeder a = new Feeder(2400);
        System.out.println(a.simulateManyDays(10, 4));
        //Test 2
        Feeder b = new Feeder(250);
        System.out.println(b.simulateManyDays(10, 5));
        //Test 3
        Feeder c = new Feeder(0);
        System.out.println(c.simulateManyDays(5, 10));
        //Test 4
        Feeder d = new Feeder(500);
        d.simulateOneDay(12);
        System.out.println(d);
        //Test 5
        Feeder e = new Feeder(1000);
        e.simulateOneDay(22);
        System.out.println(e);
        //Test 6
        Feeder f = new Feeder(100);
        f.simulateOneDay(5);
        System.out.println(f);


    }

}
