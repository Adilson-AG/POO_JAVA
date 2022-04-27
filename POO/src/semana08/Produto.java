package semana08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Produto implements Serializable {

	private int codigo;
	private String descricao;
	private double preco;
	
	

	//objetos persistentes, transientes

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", descricao=" + descricao + ", preco=" + preco + "]";
	}
	/**
	 * 
	 * @return
	 */
	public Produto recuperar() {
		try {
			FileInputStream fis =new FileInputStream("produto.obj");
			ObjectInputStream ois = new ObjectInputStream (fis);
			Produto p = ( Produto) ois.readObject();
			ois.close();
			fis.close();
			return p;//retorna o valor lido no arquivo
			
			
		} catch (Exception e) {
			System.out.println(e);//retorno o erro para o programador
					return null;
		}


	}
	/**
	 * 
	 * @return
	 */
	public boolean persistir() {
		try {
			FileOutputStream fos =new FileOutputStream("produto.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.flush();
			oos.writeObject(this);// escreve objeto no disco ( this se refere objeto corrente)
			oos.close();
			fos.close();
			return true;//gravação realizado com sucesso
			
			
		} catch (IOException e) {
			System.out.println(e);//retorno o erro para o programador
					return false;
		}


	}

	public Produto() {

	}

	public Produto(int codigo, String descricao, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		setPreco(preco); //usa metodo setPreco para não imprimir preco negativo
	}

	public void mostrar() { // apresenta o estado atual dos atributos

		System.out.println(codigo);
		System.out.println(descricao);
		System.out.println(preco);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		if(descricao.length() >=5)
			this.descricao = descricao;
		else 
			this.descricao= descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco >=0)
			this.preco = preco;
	}



}
