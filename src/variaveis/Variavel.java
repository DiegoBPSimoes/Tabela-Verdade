package variaveis;

public class Variavel {
	public String nome;
	public boolean[] valores;
	public int posicao;
	public Variavel(String nome, int posicao) {
		this.nome = nome;
		this.valores = new boolean[4];
		this.posicao=posicao;
		if(posicao==1) {
			for(int i =0;i<4;i++) {
				if(i%2==0) {
					valores[i]=false;
				}else {
					valores[i]=true;
				}
			}
		}else {
			for(int i =0;i<4;i++) {
				if(i<2) {
					valores[i]=false;
				}else {
					valores[i]=true;
				}
			}
		}
	}

}
