package Practicum;

public class Program {
    public static void main(String[] args) {
        Details d1 = new Details();
        d1.id = 1;
        d1.name = "колодки";
        d1.priceOpt = 450;
        d1.priceRoz = 400;

        Details d2 = new Details();
        d2.id =2 ;
        d2.name = "стартер";
        d2.priceOpt = 1500;
        d2.priceRoz = 1000;

        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }
}