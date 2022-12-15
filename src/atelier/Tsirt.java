package atelier;

public class Tsirt extends clothes implements MenClothing, WomenClothing
{
    public boolean m;
    public boolean f;
    @Override
    public void dressMen() {
        this.m = true;

    }
    @Override
    public void dressWomen() {
        this.f = true;
    }
}
