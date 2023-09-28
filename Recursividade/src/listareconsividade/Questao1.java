package listareconsividade;

public class Questao1 {

	public static void main(String[] args) {
		System.out.println(CalculaMDC(10, 2));
		System.out.println(Recursiva(10,2));


	}

	public static int CalculaMDC(int m, int n){
		int r;
		do{
			r = m%n;
			m = n;
			n = r;
		} while (r != 0);
		return m;
	}
	public static int Recursiva(int m, int n) {
		int r = m%n;
		m = n;
		n = r;
		if(r==0) {
			return m;
		}else {
			return Recursiva(m, n);
		}
	}

}


