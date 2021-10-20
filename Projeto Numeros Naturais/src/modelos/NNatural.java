
package modelos;

public class NNatural {
   
    private long numero = 0;
    
    public NNatural(){       
    }
    
    public NNatural (long valor) throws Exception{
       if (valor    <=   0) throw new Exception("Valor não pode ser menor do que zero");
       numero = valor;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) throws Exception {
        if(numero < 0) throw new Exception("valor não pode ser < 0");
        this.numero = numero;
    }
    
    public boolean eQuadradoPerfeito(){
        
       long aux = (long)(Math.sqrt(numero));
       if ((aux*aux) == numero)  return true;
       else return false;     
    }
    
    public NNatural calcularFatorial() throws Exception {
        long fatorial = 1;
        
        if(numero >= 21) throw new Exception("Fatorial = Out of range ");
            
        
        
        for(long aux = numero; aux > 0; aux--)fatorial *=aux;
        NNatural aux = new NNatural(fatorial);
         
        return aux;
    }
    
    public boolean ePrimo() throws Exception{
        long soma = 0;
        for (int i = 2; i <= numero/2; i++) {
          if(numero%i == 0)
              return false;
        }
        return true;
    }
    
    public boolean ePerfeito() throws Exception{
        long soma = 0;
        for (int i = 1; i <= (numero/2); i++){
           if(numero%i == 0)
               soma+=i;
        }
        return soma == numero;
    }
    
    public boolean eCapicua() throws Exception{  
     
        String aux = Long.toString(this.numero);     
     if (new StringBuilder(aux).reverse().toString().equals(aux)) 
        return true; else return false;
    
   
    }
    
    public String base(int base) throws Exception{
       String numBase = ""; 
       switch (base) {
           case 2 :
               numBase = Long.toBinaryString(numero);
               break;
           case 8 :
               numBase = Long.toOctalString(numero);
               break;
           case 16:
               numBase = Long.toHexString(numero);
               break;
       default:
           throw new Exception("Base Inválida!!!");
    
       }
       return numBase;
    }
    
    public boolean ePrimoEntreSi(NNatural numero) throws Exception{
        long a = this.numero;
        long b = numero.numero;
            while (b != 0) {
                long c = a % b;
                a = b;
                b = c;
            }
            if(a == 1){
             return true;    
            } 
            else return false;       
    }
    
    
    public NNatural mDC(NNatural numero) throws Exception{
        long a = this.numero;
        long b = numero.numero;
            while (b != 0) {
                long c = a % b;
                a = b;
                b = c;
            }
            return new NNatural(a);
    }
    
    public NNatural mMC (NNatural numero) throws Exception{
        return new NNatural ((this.numero*numero.numero) / mDC(numero).getNumero());
    }
    
}
