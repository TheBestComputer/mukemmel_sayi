
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n, nNumber, total;
        
        Scanner scanner = new Scanner(System.in);
        do {            
            System.out.print("Bir sayi giriniz : ");
            n = scanner.nextInt();
            nNumber = n;
            nNumber--;
            total = 0;
            while(nNumber > 0){
                if(n % nNumber == 0){
                    total += nNumber;
                }
                nNumber--;
            }
            if(total == n){
                System.out.println(total + " Mukemmel sayidir");
            }
            else{
                System.out.println(n + " Mukemmel sayi degildir.");
            }
        }while(true);
        
    }
}
