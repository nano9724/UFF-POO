/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introdução.oo.mercado;

/**
 *
 * @author Adria
 */
public enum FormaPagamento {
    
    DINHEIRO("Dinheiro"), CHEQUE("Cheque"), CARTAO("Cartão");
    
    public String formaPagamento;

    public String getFormaPagamento() {
        return formaPagamento;
    }
    
    FormaPagamento (String f){
    formaPagamento=f;
    }
    
    
}
