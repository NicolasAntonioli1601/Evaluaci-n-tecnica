import java.util.Scanner;

public class Parte4 {
    //hora de inicio: 18:28 hs
    //hora de fin: 18:36 hs
    public static void main(String args[]){
        String fraseFormateada = new String();

        Scanner in = new Scanner(System.in);

        System.out.println("ingrese una frase para formatear");
        String frase = new String(in.nextLine());

        String[] palabras = frase.split(" ");
        for(int x = 0; x < palabras.length; x++ ){
            if(x != palabras.length -1 ){
                fraseFormateada += parseString(palabras[x]) + ", ";
            }
            else{
                fraseFormateada += parseString(palabras[x]) + "!";
            }
        }
        System.out.println("su frase una vez formateada es: "+fraseFormateada);

        in.close();
    }

    public static String parseString(String palabra){
        if(palabra == null || palabra.length() == 0){
            return palabra;
        } //caso de ingresar un vacío

        char primerLetra = palabra.charAt(0); //guardo la primer letra para luego concatenar

        String palabraParseada = palabra.substring(1, palabra.length()) + Character.toLowerCase(primerLetra) + "ay"; //me deshago de la primer letra, concateno y preparo el resultado

        return palabraParseada.substring(0, 1).toUpperCase() + palabraParseada.substring(1); //agarro la primer letra, la paso a mayus. y le concateno el resto de la palabra
    }
}
