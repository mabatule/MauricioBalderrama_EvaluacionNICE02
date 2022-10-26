import java.util.*;

public class Persistencia {
    public void numPersistencia() {
        int aux=1;
        System.out.println("Ingrese su numero: ");
        Scanner sr = new Scanner(System.in);
        String cad= sr.nextLine();
        for (int i = 0; i < cad.length(); i++) {
            aux*= Integer.parseInt(cad.charAt(i)+"");
        }
        System.out.println("Su numero de persistencia es: ");
        System.out.println(aux);
    }
}
