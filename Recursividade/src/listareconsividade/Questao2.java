package listareconsividade;

public class Questao2 {


	public static void main(String[] args) {
		System.out.println(fat(7));
	}

	public static int fat(int num) {
		if(num==1) {
			return 1;
		}else {
			return num *fat(--num);
		}
	}
}

