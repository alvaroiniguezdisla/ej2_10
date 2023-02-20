package dominio;
import java.util.ArrayList;

public class ej2_10 {



    public static ArrayList pares(ArrayList listapares,int n) {
        if (n==2) {
            listapares.add(n);
            return listapares;
        }else {
            if(n%2==0) {
                listapares.add(n);
                return pares(listapares,n-1);
            }else {
                return pares(listapares,n-1);

            }
        }



    }

}
