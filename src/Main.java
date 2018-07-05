
import java.util.Scanner;
import trougao.Trougao;

public class Main {

    
    public static void main(String[] args) {
        
        Trougao trougao = new Trougao();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
        
        System.out.println("Unesite vrednost a:");
        int a = scanner.nextInt();
        trougao.setA(a);
        
        System.out.println("Unesite vrednost b:");
        int b = scanner.nextInt();
        trougao.setB(b);
        
        System.out.println("Unesite vrednost c");
        int c = scanner.nextInt();
        trougao.setC(c);
        
        
        trougao.trougao();
        
        System.out.println("");
        }
        
        
    }               
    
}
