/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author henrique
 */
public class PessoaFisica extends Pessoa{
    
    private String cpf;
        private String sexo;
    
    
    public PessoaFisica(String nome, String telefone, String email) {
        super(nome, telefone, email);
       
        this.cpf = cpf;
        this.sexo = sexo;
        
                
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public double calculoIR(double rendaBruta)throws Exception{
        
        if (rendaBruta>=0 && rendaBruta <= 1400) {
            
          throw new Exception("Isento");
            
        }
        if (rendaBruta>=1400 && rendaBruta <= 2100){
            
             return (rendaBruta*10/100); 
            
        } if (rendaBruta>=2100 && rendaBruta<= 2800){
            
               return (rendaBruta*15/100);            
            
            
        }
        if (rendaBruta>=2800 && rendaBruta <= 3600) {
            
             return (rendaBruta*25/100); 
            
        }
        if (rendaBruta>=3600){
               return (rendaBruta*30/100); 
        }
        return 0;
    }
}
    
    

