
public class numeroInvertido
{
    private int numeroInvertido;
    public void numeroInvertido(int num){
        int numero=num;
        int restoDiv=0;
        numeroInvertido=0;
        while(num>0){
            restoDiv=num%10;
            numeroInvertido = numeroInvertido *10 + restoDiv;
            num = num / 10;
        
        }
        System.out.println ("numero invertido " + numeroInvertido);
    }
}
