// que hacer si el resultado sale 7,33 y el total seria 8 
public class CopiaDeSeguridad
{
    public double cantidadTotal(){
        int pesoDeLosDatosTotalGb=5;
        int convGb=1024;
        double cdsBlanco=700;
        double pesoTotalMb=pesoDeLosDatosTotalGb*convGb;
        double totalCds=pesoTotalMb/cdsBlanco;
        return totalCds;
   }
}
