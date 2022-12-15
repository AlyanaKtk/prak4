package atelier;

public class Atelier implements MenClothing, WomenClothing
{
    clothes[] cloth = new clothes[4];

    Atelier()
    {
        cloth[0] = new Pants();
        cloth[1] = new Skirt();
        cloth[2] = new Tsirt();
        cloth[3] = new Tie();
    }

    @Override
    public void dressMen()
    {


        for (int i = 0; i <4; i++)
        {
                if((cloth[i] instanceof Pants) || (cloth[i] instanceof Tsirt) || (cloth[i] instanceof Tie))
                {
                    System.out.println(cloth[i].color);
                    System.out.println(cloth[i].cost);
                    System.out.println(cloth[i].size);
                }
        }
    }
    public void dressWomen()
    {
        for (int i = 0; i <4; i++)
        {
            if((cloth[i] instanceof Pants) || (cloth[i] instanceof Tsirt) || (cloth[i] instanceof Skirt))
            {
                System.out.println(cloth[i].color);
                System.out.println(cloth[i].cost);
                System.out.println(cloth[i].size);
            }
        }
    }

}
