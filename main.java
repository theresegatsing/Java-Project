import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a country of your choice: ");
        String country = scanner.nextLine();
        Country countryObj = new Cameroon(country);
        System.out.println(countryObj.countryString(country));
        System.out.println(countryObj.capital());
        System.out.println(((Cameroon) countryObj).President());
        scanner.close();
    }
}