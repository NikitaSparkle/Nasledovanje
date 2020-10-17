package homework;

public class Nalog extends Employee{
    private int Nalog;

    public void setNalog(int nalog) {
        Nalog = nalog;
    }

    public int getNalog() {
        Nalog=(getSum()-(getSum()*Nalog)/100);
        return Nalog;
    }
}
