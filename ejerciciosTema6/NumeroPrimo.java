
public class NumeroPrimo
{
  private int numero;
  private int contador;
 public static boolean esPrimo(int numero){
  int contador = 2;
  boolean primo=true;
  while ((primo) && (contador!=numero)){
    if (numero % contador == 0)
      primo = false;
    contador++;
  }
  return primo;
}
    } 
 /* public void imprimirPrimo() {
        if (numero == 2 || numero == 1 ){
        System.out.println(numero + " ES UN NUMERO PRIMO");
        } else if  ( numero % 2 == 0 ){
        System.out.println(numero + " NO ES UN NUMERO PRIMO");
       }
       }
} 
*/