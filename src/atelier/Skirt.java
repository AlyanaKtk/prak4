package atelier;

public class Skirt extends clothes implements WomenClothing
{

    public boolean f;

    @Override
    public void dressWomen() {
        this.f = true;
    }
}
