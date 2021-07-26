
package introdução.oo.mercado;

public class Produto {
    String nome;
    float preco;
    int qtde;
    
    Produto(String nome, float preco, int qtde){
        this.nome=nome;
        this.preco=preco;
        this.qtde=qtde;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public int getQtde() {
        System.out.println(qtde);
        return qtde;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
    
    
    
}
