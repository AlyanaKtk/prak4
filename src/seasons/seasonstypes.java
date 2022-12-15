package seasons;

public class seasonstypes

{
    public static void main(String[] args)
    {
        seasons myfavses = seasons.WINTER;
        myfavses.getseason(myfavses);
        seasons[] seas = seasons.values();
        for (seasons s : seas)
        {
            System.out.println(s);
            System.out.println(s.gettemp());
            s.getDescription();

        }
    }

}
enum seasons {
    WINTER("-20"),
    SUMMER("+20"),
    SPRING("+13"),
    AUTUMN("-5");
    public String avrtemp;
    seasons(String temp)
    {
        this.avrtemp = temp;
    }
    public void getseason(seasons s)
    {
        switch (s){
            case AUTUMN -> System.out.println("I love autumn");
            case SPRING -> System.out.println("I love spring");
            case SUMMER -> System.out.println("I love summer");
            case WINTER -> System.out.println("I love winter");
        }
    }
    public String gettemp()
    {
        return avrtemp;
    }
    public void getDescription()
    {
        if (avrtemp == "+20")
        {
            System.out.println("Hot time of the year");
        }
        else
            System.out.println("Cold time of the year");

    }
}

