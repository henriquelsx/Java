
package modelo;


    public class NRacionais {
    //ATRIBUTOS
        private int numerador =0;
        private int denominador =1;
    
    //METODOS
    public NRacionais(){
        
    }

    public NRacionais (int numerador, int denominador)throws Exception{
   if(denominador == 0) throw new Exception("Denominador n pode ser igual a zero");
        this.numerador = numerador;
        this.denominador = denominador;
     
 }
      
    public void setNracional(int numerador, int denominador)throws Exception{
        if(denominador == 0) throw new Exception("Denominador n pode ser igual a zero");
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public String getRacional(){
        
     return ""+ numerador +"/"+denominador; 
     
    }
  
    public NRacionais adicionar (NRacionais numero) throws Exception {
       int valorMMC = mMC(denominador,numero.denominador);
       int conta  = ((valorMMC/denominador)*numerador) + (valorMMC/numero.denominador)*numero.numerador;       
       NRacionais aux = new NRacionais(conta, valorMMC);
       aux.reduzirFracao();
       
       return aux;
   }
    
    public NRacionais subtrair (NRacionais numero) throws Exception{
        
        int valorMMC = mMC(denominador , numero.denominador);
        int conta = ((valorMMC/denominador)*numerador) - (valorMMC/numero.denominador)*numero.numerador;
        NRacionais aux = new NRacionais(conta, valorMMC);
        aux.reduzirFracao();
       
       return aux;
    }
    
    public NRacionais multiplicar(NRacionais numero)throws Exception {
        int contaNumerador = numerador *numero.numerador;
        int contaDenominador = denominador *numero.denominador;
        NRacionais aux = new NRacionais (contaNumerador, contaDenominador);
        aux.reduzirFracao();
        
        return aux;
       
    }
    public NRacionais dividir (NRacionais numero)throws Exception {
        
        int contaNumerador = numerador * numero.denominador;
        int contaDenominador = denominador * numero.numerador;
        NRacionais aux = new NRacionais (contaNumerador, contaDenominador);
        aux.reduzirFracao();
        
        return aux;
       
    }
    public boolean eigual(NRacionais numero)throws Exception{
        NRacionais aux = new NRacionais(numerador, denominador);
         aux.reduzirFracao();

        NRacionais aux2 = new NRacionais(numero.numerador, numero.denominador);
        aux2.reduzirFracao();
        return aux.getRacional().equals(aux2.getRacional());
    }
 
 
    
   
    public void reduzirFracao() throws Exception{
       int valorMDC = mDC(numerador, denominador);
       numerador = numerador/valorMDC;
       denominador=denominador/valorMDC;
   }
     
    private int mDC(int numeroA, int numeroB){
       
       while(numeroB !=  0){
           int conta = numeroA%numeroB;
           numeroA = numeroB;
           numeroB=conta;
       }
       
       
       return numeroA;
   }
   
    private int mMC(int numeroA, int numeroB){
       
  
       return numeroA *(numeroB/mDC(numeroA,numeroB));
   }
}

