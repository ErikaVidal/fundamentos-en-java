
public class factorialNumero
{   
    private int num;
 
    public static int factorialNumero(int n) {
        int num=n;
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
 

