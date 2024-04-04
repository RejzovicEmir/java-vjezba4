import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //unos 10 cijelih brojeva
        System.out.println("Unesite 10 brojeva:");
        Scanner Skener = new Scanner(System.in);
        int [] brojevi = new int[10];
        for (int i = 0; i <= 9; i++){
            brojevi[i] = Skener.nextInt();
        }

        //definisanje sume
        int suma = 0;

        //provjera da li je svaki od brojeva paran ili neparan i suma svih neparnih
        for (int i = 0; i <= brojevi.length; i++){
            if (brojevi[i] % 2 == 1){
                suma += brojevi[i];
                System.out.println("Suma svih neparnih brojeva nakon svake iteracije, je " + suma);
            }
        }
    }
}