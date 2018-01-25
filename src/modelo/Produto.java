package modelo;

/**
 *
 * @author fernanda
 */
public class Produto {
    private final int id;
    private String descricao;
    private float preco;
    private String nome;

    public Produto(int id, String descricao, float preco, String nome) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.nome = nome;
    }
    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", "
                + "preco=" + preco + ", nome=" + nome + '}';
    }
    
    
}
