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
public class PessoaJuridica extends Pessoa{
    
    private String cnpj;
    private String razaoSocial;
    
    
    
    
    public PessoaJuridica(String nome, String telefone, String email) {
        super(nome, telefone, email);
        
        this.cnpj = cnpj;
        this.razaoSocial=razaoSocial;
               
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the razaoSocial
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * @param razaoSocial the razaoSocial to set
     */
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    
    public double calculoIR(double rendaBruta)throws Exception{
    
    return rendaBruta*10/100;
    
}
}
