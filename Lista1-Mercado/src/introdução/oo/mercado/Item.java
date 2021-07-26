
package introdução.oo.mercado;

public class Item {
    Produto produto;
    int quantidadeInserida;
    
    
    Item (Produto p, int q){
        this.produto=p;
        this.quantidadeInserida=q;
        produto.qtde-=quantidadeInserida;

    }
    /*
    float getSubtotal(){
    return produto.preco * quantidadeInserida ;
    }
    Item (Produto p, int quantidade){
        this.produto=p;
        this.quantidadeInserida=quantidade;
    }*/

    public int getQuantidadeInserida() {
        return quantidadeInserida;
    }
}
