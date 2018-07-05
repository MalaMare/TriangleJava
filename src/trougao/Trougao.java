package trougao;

public class Trougao {

    private int a;
    private int b;
    private int c;

    public Trougao() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
    }

    public Trougao(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void triangle() {

//        if (a+b<c || b+c<a || a+c<b) {
//            System.out.println("Greska, zbir dve strane mora biti manji od trece");
//        } if (a<0 || b<0 || c<0) {
//            System.out.println("Greska, strane ne mogu biti negativni brojevi");
//        } if (a==0 || b==0 || c==0) {
//            System.out.println("Greska, strane ne mogu imati vrednost 0");
//        } else if (a == b && b == c && a == c) {
//            System.out.println("Trougao je jednakostranican ");
//        } else if (a==b || a==c || b==c) {
//            System.out.println("Trougao je jednakokraki");
//        } else if (a!=b && b!=c && a!=c) {
//            System.out.println("Trougao je nejednakostranican");
//        }



//        if ((a < 0 || b < 0 || c < 0) || (a + b < c || b + c < a || c + a < b)) {
//            System.out.println("Podaci su neispravni");
//        } else {
//                if (a == b && b == c && c == a) {
//                    System.out.println("Trougao je jednakostranican");
//                } else if (a == b || b == c || c == a) {
//                    System.out.println("Trougao je jednakokraki");
//                } else if (a != b && b != c && a != c) {
//                    System.out.println("Trougao je nejednakostranican");
//                }
//            }


//        if (a > 0 && b > 0 && c > 0) {
//            if (a + b > c && b + c > a && c + a > b) {
//                if (a == b && b == c && c == a) {
//                    System.out.println("Trougao je jednakostranican");
//                } else if (a == b || b == c || c == a) {
//                    System.out.println("Trougao je jednakokraki");
//                } else if (a != b && b != c && a != c) {
//                    System.out.println("Trougao je nejednakostranican");
//                }
//            } else {
//                System.out.println("Neispravni parametri, zbir dve strane mora biti veci od trece");
//            }
//
//        } else {
//            System.out.println("Neispravni parametri, moraju biti >0");
//
//        }



        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Invalid parameters, parameters must be > 0"); 
        }
        if (a + b < c || b + c < a || c + a < b) {
            System.out.println("Invalid parameters, the sum of two sides must be greater than the third");
        } else {if (a==b && b !=c ) {
               System.out.println("Isosceles Triangle");
               }
               else if (b==c && c!=a) {
               System.out.println("Isosceles Triangle");    
               }
               else if (c==a && a!=b) {
               System.out.println("Isosceles Triangle");    
               }
               else if (a == b && b == c && c == a) {
               System.out.println("Equilateral Triangle");
               }
               else if  (a != b && b != c && a != c) {
               System.out.println("Scalene Triangle");
               }
        }

    }
}
