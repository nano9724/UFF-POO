
package introdução.oo.mercado;

 public class Pedido {
     
     int qtdeItem;
     Item [] itens; 
     
     
     Pedido(){
     itens=new Item[1000];
     qtdeItem=0;
     }
     
     float getTotal(){
     float total=0;
         for (int i=0; i<qtdeItem;i++) {
             total += itens[i].produto.getPreco();
             System.out.println(itens[i].produto.getNome());
             System.out.println("Quantidade    "+itens[i].getQuantidadeInserida());
             System.out.println("Total         R$"+total);
             System.out.println("----------------------");
         }
     return total;
     }
     
     void addItem (Produto p, int qtde){
         this.itens[qtdeItem]= new Item(p,qtde);
         this.qtdeItem++;
     }
   
     
     
     
}
