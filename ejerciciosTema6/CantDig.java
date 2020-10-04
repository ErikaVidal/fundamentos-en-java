
public class CantDig
{   private int cantDigito;
 
    public void cantdig(int n){
        int digito = n;
        cantDigito=0;
        while (n != 0){
                n = n/10;         
                cantDigito++;          
            }
            System.out.println("El número tiene " + cantDigito+ " digitos");
            
        }
        
    }
        

