
public class TanqueDeAgua
{
  public int totalTiempo(){
        int tiempoLLenado=10;
        int tiempoVacia=15;
        int calculoTiempo=((tiempoLLenado*tiempoVacia)/(tiempoVacia-tiempoLLenado));
        return calculoTiempo;
   }
}
