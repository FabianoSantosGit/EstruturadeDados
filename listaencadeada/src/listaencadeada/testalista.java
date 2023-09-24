package listaencadeada;

public class testalista {

	public static void main(String[] args) {
		testalista testalista = new testalista();
		listaencadeada listaencadeada = new listaencadeada();
		
		System.out.println("Adicionar professores");
		testalista.addProfessor(listaencadeada);
		System.out.println("Professores adicionados");
		
		System.out.println("lista dos adicionados");
		while(listaencadeada.temProximo()) {
			System.out.println(listaencadeada.getElementoatual().getValor().getNome());
		}
		testalista.remover(listaencadeada);
		while(listaencadeada.temProximo()) {
			System.out.println(listaencadeada.getElementoatual().getValor().getNome());
		}
	}
		

	public void addProfessor(listaencadeada listaencadeada) {
		Professor professor1 = new Professor ("1","osvaldo");
		Professor professor2 = new Professor ("2","angela");
		Professor professor3 = new Professor ("3","Bia");
		Professor professor4 = new Professor ("4","pedro");
		
		listaencadeada.add(professor1);
		listaencadeada.add(professor2);
		listaencadeada.add(professor3);
		listaencadeada.add(professor4);
	}
	public void remover(listaencadeada listaencadeada) {
		listaencadeada.remove();
	}
}
