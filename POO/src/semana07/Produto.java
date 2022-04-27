package semana07;

public class Produto {
	
	private int codigo;
	private String nome;
	private double preco;
	
	
	public void setCodigo(int codigo) {
		this.codigo =codigo;
	}
		public void setNome(String nome) {
		this.nome =nome;
	}
	public void setPreco(double preco) {
		this.preco =preco;
	}
	public int getCodigo(int codigo) {
		return codigo;
	}
	public String getNome(String nome) {
		return nome;
	}
	public double getPreco(double preco) {
		return preco;
	}
	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}


}
