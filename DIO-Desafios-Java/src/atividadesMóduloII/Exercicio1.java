package atividadesM�duloII;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int i;
		//int i;"vari�vel com mesmo nome"
		int I;
		//int 1a;"vetado iniciar com n�meros"
		//Os exemplos abaixo n�o apresentam erro de copila��o, p�rem n�o caracteriza uma boa pr�tica!
		int _1a;
		int $aq;
		
		i = 5;
		I = 10;
		_1a = 20;
		$aq = 7;
		
		final int j = 10;
		// j=15 "o termo final representa um valor que n�o pode ser modificado"
		int asrn24678md;
		//int asrn246 78md;"vetado separar termos"
		int asrn2$4678md = 10;
		//int asrn246%78md = 10;"vetado uso de caracteres reservados"
		
		asrn24678md = 100;
		asrn2$4678md = 10;
		
		int quantidadeProduto = 50;
		//int QuantidadeProduto; "deve come�ar com a primeira letra min�scula"
		final int NUMERO_TENTATIVAS = 5;
		//final int numeroTentativas = 5;"elementos final devem ser escritos em caixa alta com separa��o por _"
		int QUANTIDADE_OPCOES = 25; //n�o � exemplo de boa pr�tica, pois utiliza as regras de final sem ser final
		//int qtdProd; "vari�vel com nome n�o expressivo"
		
		System.out.println(i);
		System.out.println(I);
		System.out.println(_1a);
		System.out.println($aq);
		
		System.out.println(j);
		System.out.println(asrn24678md);
		System.out.println(asrn2$4678md);
		
		System.out.println(quantidadeProduto);
		System.out.println(NUMERO_TENTATIVAS);
		System.out.println(QUANTIDADE_OPCOES);		
		
		
	}

}
