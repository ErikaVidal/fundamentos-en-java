
public class Robot
{
   private int energiaMax;
   private int energia;
   public Robot(int energiaMax){
    this.energiaMax=energiaMax;
    energia=0;
    }
   public void cargarEnergia(){
    energia=energiaMax;
    
    }
   public int cantVueltas(int perimetro){
     int vueltas=0;
     int energiaNecesito=perimetro;
     while(energia>=energiaNecesito){
         energia=energia-energiaNecesito;
         vueltas++;
         energiaNecesito=energiaNecesito+perimetro;
         
       }
       return vueltas;
    }
    public int cantvueltas2(int perimetro){
        int vueltas=0;
        for(int energiaNecesito=perimetro; energia>=energiaNecesito;energiaNecesito=energiaNecesito+perimetro){
            energia=energia-energiaNecesito;
            vueltas++;
    }
    return vueltas;
  }
}
