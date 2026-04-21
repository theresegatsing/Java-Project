public class Cameroon extends Country{

    // constructor
    public Cameroon(String country){
        super(country);
    }

    @Override
    public String capital(){
        return "The capital is: Yaounde";

    }

    public String President(){
        return "The current president is Paul Biya. He has been preseident for 45 years.";
    }

    @Override
    public String countryString(String country){
        return "The country is: " + country;
    }

    public static void main(String[] args){
        Cameroon Cameroon = new Cameroon("Cameroon");
        System.out.println(Cameroon.countryString("Cameroon"));
        System.out.println(Cameroon.capital());
        System.out.println(Cameroon.President());
    }
}