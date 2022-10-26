import java.util.*;
public class App {
    public static String volvearPalabra(String cad) {
        String cadNew="";
        for (int i = cad.length()-1; i >=0 ; i--) {
            cadNew+= cad.charAt(i);
        }
        return cadNew;
    }
    public static List<String> converPalabraTolist(String oracion){
        String aux="";
        List<String> listWord= new ArrayList<>();
        
        for (int i = 0; i < oracion.length(); i++) {
            
            if(oracion.charAt(i)==' '){
                listWord.add(aux);
                aux="";
            }
            aux+=oracion.charAt(i);
        }
        listWord.add(aux);

        return listWord;
    }
    public static List<String> invertir5PalAdelante(List<String> oracion){
        for (int i = 0; i < oracion.size(); i++) {
            if(i>4){
                oracion.set(i,volvearPalabra( oracion.get(i)) );
            }
        }
        return oracion;
    }
    public static String convertOracion(List<String> oracion) {
        String cad="";
        for (int i = 0; i < oracion.size(); i++) {
            cad+=oracion.get(i)+" ";
        }
        return cad;
        
    }
    public static void main(String[] args) throws Exception {
        List<String> array;
        String result,oracion;
        Scanner sr= new Scanner(System.in);
        System.out.println("Ingrese una oracion");
        oracion= sr.nextLine();
        array = converPalabraTolist(oracion);
        array = invertir5PalAdelante(array);
        result= convertOracion(array);
        System.out.println(result);

        System.out.println("*********************************************");
        Persistencia aux= new Persistencia();
        aux.numPersistencia();
    }
}
