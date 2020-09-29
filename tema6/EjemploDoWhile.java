
public class EjemploDoWhile
{
   public int calcuarEnergiaGasto(int perimetro, int cantVueltas){
      int res=0;
      int factor=1;
      int cont=0;
      do{ 
          res=res+(perimetro*factor);
          factor=factor+1;
          cont ++;        
      }while(cont<cantVueltas);
       return res;
   }
}
