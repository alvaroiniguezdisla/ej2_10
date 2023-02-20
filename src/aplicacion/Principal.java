package aplicacion;
import java.util.ArrayList;
import java.util.Scanner;
import dominio.ej2_10;

public class Principal {
    public static void main(String[] args) {
        ArrayList listapares=new ArrayList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número");
        int num=sc.nextInt();
        System.out.println(ej2_10.pares(listapares,num));

    }
}
