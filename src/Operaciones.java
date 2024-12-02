import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el primer numero");
        int x = sc.nextInt();
        System.out.println("Seleccione el segundo numero");
        int b= sc.nextInt();

        System.out.println("El resultado de multiplicar es: "+x*b);
        System.out.println("El resultado de dividir es: "+x/b);

        
        
    }
    
}
