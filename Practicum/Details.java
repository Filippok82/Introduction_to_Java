package Practicum;

public class Details {

    int id;
    String name;
    int priceOpt;
    int priceRoz;

    @Override
    public String toString() {

        String res = String.format("%d %s %d %d", id, name, priceOpt, priceRoz);
        return res;
    }
}
