package listareconsividade;
import java.util.Scanner;
public class Questao4 {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Digite um número: ");
	 int numero1 = scanner.nextInt();
	 System.out.println(Soma(numero1));
		
	}
	public static int Soma(int num) {
		if(num==0) {
			return 0;
		}else {
			return (num%10)+Soma(num/10);
		}
	}


}


