// porque en alguns como en el double se debe poner izquierda a derecha
public class Bateria
{
    public double CuantaBateriaHay(){
        int bateriaActual =55;
        int sejugoMinutos=30;
        int seVioRedesSocialesMinutos=15;
        int seVioYoutuveMint=40; 
        int ConvHoraPorMint =60;
        int jugarReducePorHora =20;
        int redesSocialesReducePorHora =10;
        int verYoutuveReducePorHora =15;
        double calculoGastadoJugar=(double)sejugoMinutos/ConvHoraPorMint*jugarReducePorHora;
        double calculoGastadoRedesSociales=(double)seVioRedesSocialesMinutos/ConvHoraPorMint*redesSocialesReducePorHora;
        double calculoGastadoYouTuve=(double)seVioYoutuveMint/ConvHoraPorMint*verYoutuveReducePorHora;
        double CalculoGastadoTotal=(double)calculoGastadoJugar+calculoGastadoRedesSociales+calculoGastadoYouTuve;
        double CuantaBateriaQueda=(double)bateriaActual-CalculoGastadoTotal;
        return CuantaBateriaQueda;
    }
}
