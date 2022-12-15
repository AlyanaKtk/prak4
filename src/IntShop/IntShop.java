package IntShop;
import java.util.*;
public class IntShop
{
    public static void main(String[] args)
    {
        String login;
        String psswd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and password");
        login = sc.next();
        psswd = sc.next();
        String[] catalogs = new String[3];
        catalogs[0] = "Catalog A";
        catalogs[1] = "Catalog B";
        catalogs[2] = "Catalog C";
        for (int i = 0; i < 3; i++)
        {
            System.out.println(catalogs[i]);
        }
        products[] ctlgA = new products[3];
        ctlgA[0] = products.MUGS;
        ctlgA[1] = products.SHIRTS;
        ctlgA[2] = products.STICKERS;
        for (int i = 0; i < 3; i++)
        {
            System.out.println(ctlgA[i].toString());
        }
        products[] cart = new products[2];
        cart[0] = products.SHIRTS;
        cart[1] = products.MUGS;
        int price = 0;
        for (int i = 0; i < 2; i++)
        {
            price += cart[i].getPrice();

        }
        System.out.println("Your price is: " + price);
    }
}
enum products
{
    SHIRTS(10),
    MUGS(15),
    STICKERS(5);
    public int price;
    products(int price )
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}