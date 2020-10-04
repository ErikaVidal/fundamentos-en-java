
    public class NumeroPerfecto
    {
        private int numero;
        private int num;
        private int resultado;
        private int res;

 
        public NumeroPerfecto(int numero){
        this.numero = numero;
        this.num = 0;
        this.resultado = 0;
        this.res = 0;
    
       }
 
        public void Divisores() {
        for (int i = 1 ; i <= numero ; i++){
            if (numero % i == 0)
             System.out.println (i);}
       }

       public void sumaDivisores() {
          for(int i = 1; i <= numero && i != numero; i++) {
         num = numero%i;
         if(num==0)
         res = res + i;
        }
      }
 
      public void imprimirSuma() {
        if (res == numero){
        System.out.println("LA SUMA DE DIVISORES ES " + res + " ES UN NUMERO PERFECTO");
        } else {
        System.out.println("LA SUMA DE LOS DIVISORES ES " + res + " NO ES UN NUMERO PERFECTO");
       }
        }
 }
