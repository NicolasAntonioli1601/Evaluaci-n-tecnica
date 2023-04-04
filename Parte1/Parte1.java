import java.util.Scanner;

public class Parte1 {
    //hora de inicio: 23:00hs 
    //hora de fin: 23:12hs
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);

        System.out.println("ingrese una frase para formatear");
        String palabra = new String(in.nextLine());

        System.out.println("su frase una vez formateada es: "+parseString(palabra));

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
