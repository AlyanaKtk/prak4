package atelier;

public class Tie extends clothes implements MenClothing{
    public boolean f;

    @Override
    public void dressMen() {
        this.f = true;
    }
}
