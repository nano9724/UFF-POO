/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introdução.oo.mercado;

import java.util.Scanner;


public class Caixa {
    
    
    
    float valorTotal;
    Pedido pedidos;
    
    Caixa (){
     pedidos=new Pedido(); 
       
    }
    
    void pagamento(FormaPagamento fp){
        System.out.println("Total a pagar: R$"+this.pedidos.getTotal());
        if(fp.CARTAO==FormaPagamento.CARTAO){
        System.out.println("Insira o cartão, digite a senha e tecle Enter");
        Scanner enter=new Scanner(System.in);
        enter.nextLine();
        if(enter!=null){
        System.out.println("Pagamento Aprovado");
        }else{System.out.println("Pagamento não Autorizado");}}
        
        
        if(fp.CHEQUE==FormaPagamento.CHEQUE){
        System.out.println("Caixa, verifique a validade do Cheque");
        System.out.println("S - para validar");
        System.out.println("N - para invalidar");
        Scanner option=new Scanner(System.in);
       String op=option.nextLine();
        if(op.equalsIgnoreCase("s")){
        
            System.out.println("Pagamento Concluído");
        } else {System.out.println("Cheque Inválido");}}
        
       
        if (fp.DINHEIRO==FormaPagamento.DINHEIRO){
        System.out.println("Digite o valor Recebido");
        Scanner valor=new Scanner(System.in);
        float valorRecebido=valor.nextFloat();
        float aPagar=this.pedidos.getTotal();
        float troco =valorRecebido-aPagar;
        System.out.println("Troco R$"+troco);
            
        }
        
            
}
    
    
    public static void main (String [] args){
    
        Produto leite=new Produto("Leite", 4.80f ,10 );
        Produto agua=new Produto("Agua", 1.80f ,100 );
        Produto cafe=new Produto("Café", 7.80f ,150 );
        Produto acucar=new Produto("Açucar", 5.80f ,1000 );
        Caixa caixa=new Caixa();
        caixa.pedidos.addItem(leite, 2);
        caixa.pedidos.addItem(agua, 100);
        caixa.pedidos.addItem(cafe, 22);
        caixa.pedidos.addItem(acucar, 20);
        caixa.pedidos.getTotal();
        caixa.pagamento(FormaPagamento.DINHEIRO);
        
        
        leite.getQtde();
        agua.getQtde();
        cafe.getQtde();
        acucar.getQtde();
        
    
    }

   
    
    
    
}
