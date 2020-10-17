package homework;

public class Main {
    public static void main(String[] args) {
        Premya Ivan=new Premya();
        Ivan.setName("Ivan");
        Ivan.setType("Stavka");
        Ivan.setSum(3000);
        Ivan.setNalog(20);
        Ivan.setOffshore("Да");
        Ivan.setHours(250);
        Ivan.setPremya(1000);
        if(Ivan.getOffshore().equals("Да"))
        {
            Ivan.setNalog(0);
        }
        else
        {
            if(Ivan.getHours()>200)
            {
                Ivan.setSum(Ivan.getSum() + Ivan.getPremya());
            }
        }
        System.out.print(Ivan.getName()+"\n"+Ivan.getType()+"\n"+Ivan.getNalog()+"\n");

        System.out.print("\n");

        Premya Sidor=new Premya();
        Sidor.setName("Sidor");
        Sidor.setType("Pochasovaya");
        Sidor.setSum(800);
        Sidor.setNalog(20);
        Sidor.setOffshore("Нет");
        Sidor.setHours(200);
        Sidor.setPremya(1000);
        if(Sidor.getOffshore().equals("Да"))
        {
            Sidor.setNalog(0);
        }
        else
        {
            if(Sidor.getHours()>200)
            {
                Sidor.setSum(Sidor.getSum() + Sidor.getPremya());
            }
        }
        System.out.print(Sidor.getName()+"\n"+Sidor.getType()+"\n"+Sidor.getNalog()+"\n");

        System.out.print("\n");

        Premya Petya=new Premya();
        Petya.setName("Petya");
        Petya.setType("Sdelnya");
        Petya.setSum(5500);
        Petya.setNalog(15);
        Petya.setOffshore("Нет");
        Petya.setHours(100);
        Petya.setPremya(1000);
        if(Petya.getOffshore().equals("Да"))
        {
            Petya.setNalog(0);
        }
        else
        {
            if(Petya.getHours()>200)
            {
                Petya.setSum(Petya.getSum() + Petya.getPremya());
            }
        }
        System.out.print(Petya.getName()+"\n"+Petya.getType()+"\n"+Petya.getNalog()+"\n");

        System.out.print("\n");

    }
}
