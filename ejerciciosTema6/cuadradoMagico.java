
public class cuadradoMagico
{
    private int numero;
  
    private int div;
    public void cuadradoMagico(int num){
        int numero=num;
        int numeroMagico=0;
        while(numeroMagico != num){
             div = num%10;
             numeroMagico = div + (num%10);
        }
        System.out.println (numeroMagico);
        num=numero/10;
    }
  }

