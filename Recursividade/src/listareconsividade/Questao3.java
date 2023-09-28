package listareconsividade;

public class Questao3 {

	public static void main(String[] args) {
		System.out.println(binario(30));

	}
	public static String binario(int num) {
		if(num==0) {
			return "";
		}else {
			if(num%2==0) {
				num=num/2;
				return binario(num)+" "+0;
			}else {
				num=num/2;
				return binario(num)+" "+1;
			}
		}
	}

}
