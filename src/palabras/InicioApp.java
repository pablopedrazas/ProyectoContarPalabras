
package palabras;
import java.util.*;

public class InicioApp {

        
	int [] contador;
	char [] letras;
        int caracter;
        int palabra=0;
	int palabras;
	int numCaracteresSinBlancos = 0;
	final String TEXTO_LETRAS= "Las letras que se repiten son:";
	final String TEXTO_PALABRAS= "Se han ingresado ";
	final String TEXTO_FINAL_PALABRAS= " palabras.";
	final String TEXTO_TOTAL_CARACTERES_SIN_BLANCOS= "Se han introducido un total de ";
        static final String TEXTO_PEDIR_CADENA= "Introduzca un conjunto de caracteres:";
        final String caracteres = "Número de caracteres totales es ";
        static final String TEXTO_PALABRA="El numero de palabras que hay en la frase es: ";
        static final String numPalabras="El numero de palabras de tu frase es: ";
        
        final String Caracteres="El numero de caracteres de tu cadena es: ";
	
	public InicioApp(){
		contador = new int[65536];
		letras = new char[65536];
		palabras = 1;
	}
        
	int contarNumeroPalabras(String cadena){
           StringTokenizer st= new StringTokenizer(cadena);
                palabra=st.countTokens();
            return palabra;
            }
           
        int contarTodosCaracteres(String cadena){
           for (int i = 0;i<cadena.length();i++){ 
			char car = cadena.charAt(i); 
			int ascii = car; 
			contador[ascii]++; 
			letras[ascii] = car;
                }
           return 0;
           }
        
        
        int  contarCaracteresTotales(String cadena){
            for (int i = 0; i < cadena.length(); i++) {
               caracter ++;
               
            }return caracter;

}
	
	String textoCaracteresTotales(int caracter){
        String res="Número de caracteres totales es :" + caracter;
            
            return res;
        }
        
        String textoNumeroPalabras(int total){
        String res="El numero de palabras de tu frase es: "+ total;
        return res;
        }
        
	private void mostrarResultado(){
		System.out.println(TEXTO_PALABRAS + palabras + TEXTO_FINAL_PALABRAS);
		System.out.println(TEXTO_LETRAS);
                System.out.println(Caracteres + caracter);
                
		for (int i = 0;i<letras.length;i++) { //Recorro el array y muestro todo.
			if (contador[i]>0 && letras[i] != ' ') {
				if (contador[i]==1)
					System.out.println(""+letras[i]+ "-->" + contador[i] + " vez.");
				else
					System.out.println(""+letras[i]+ "-->" + contador[i] + " veces.");
			}
		}
	}
	
	public static void main(String[] args) {
		InicioApp ia = new InicioApp();
		Scanner scan = new Scanner(System.in);
		System.out.println(TEXTO_PEDIR_CADENA);
		String cadena = scan.nextLine().trim() ;
		
                System.out.println(ia.textoCaracteresTotales(ia.contarCaracteresTotales(cadena)));
                System.out.println(ia.textoNumeroPalabras(ia.contarNumeroPalabras(cadena)));
		ia.mostrarResultado();
                
		scan.close();
                
		
	}
}
