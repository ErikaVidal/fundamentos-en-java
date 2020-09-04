

public class ElYoutuver
{
   public float musicas(){
      float tiempoMaxDurVideo=15;
      float cancionmint=2;
      float cancionSegMint=(float)30/60;
      float totalMint=cancionmint+cancionSegMint;
      float cantidadDeCanciones=tiempoMaxDurVideo/totalMint;
      return cantidadDeCanciones;
  
    }
}
