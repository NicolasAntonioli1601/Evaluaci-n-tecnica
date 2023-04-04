import java.util.Scanner;

public class Parte2 {

    //hora de inicio 12:10 hs
    //hora de fin: 12:14 hs
    public static void main(String args[]){
        String fraseFormateada = new String();

        Scanner in = new Scanner(System.in);

        System.out.println("ingrese una frase para formatear");
        String frase = new String(in.nextLine());

        String[] palabras = frase.split(" ");
        for(String palabra : palabras){
            fraseFormateada += parseString(palabra) + " ";
        }
        System.out.println("su frase una vez formateada es: "+fraseFormateada);

        in.close();
    }

    public static String parseString(String palabra){
        if(palabra == null || palabra.length() == 0){
            return palabra;
        } //caso de ingresar un vacío

        char primerLetra = palabra.charAt(0); //guardo la primer letra para luego concatenar

        return palabra.substring(1, palabra.length()) + primerLetra + "ay"; //me deshago primer letra, concateno y retorno resultado
    }
}
