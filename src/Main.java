
import java.util.Scanner;
import trougao.Trougao;

public class Main {

    
    public static void main(String[] args) {
        
        Trougao trougao = new Trougao();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
        
        System.out.println("Enter value a:");
        int a = scanner.nextInt();
        trougao.setA(a);
        
        System.out.println("Enter value b:");
        int b = scanner.nextInt();
        trougao.setB(b);
        
        System.out.println("Enter value c");
        int c = scanner.nextInt();
        trougao.setC(c);
        
        
        trougao.triangle();
        
        System.out.println("");
        }
        
        
    }               
    
}
