package atelier;

public class clothes
{
    public int size;
    public double cost;
    public String color;
}

enum sizes
{
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    public void getDescription()
    {
        System.out.println("Adult size");
    }
    public int eurosize;
    sizes(int eurosize)
    {
        this.eurosize = eurosize;
    }
}