public abstract class Country {

    private String country;

    //constructor
    public Country(String country){

        this.country = country;
    }

    abstract public String capital();
    abstract public String countryString(String country);

    public static void main(String[] args){
        
    }
}