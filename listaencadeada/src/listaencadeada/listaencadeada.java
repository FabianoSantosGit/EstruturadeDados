package listaencadeada;

public class listaencadeada {
	private nodo primeiro;
	private nodo ultimo;
	private nodo elementoatual;

	public nodo getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(nodo primeiro) {
		this.primeiro = primeiro;
	}
	public nodo getUltimo() {
		return ultimo;
	}
	public void setUltimo(nodo ultimo) {
		this.ultimo = ultimo;
	}
	public nodo getElementoatual() {
		return elementoatual;
	}
	public void setElementoatual(nodo elementoatual) {
		this.elementoatual = elementoatual;
	}
	public void add(Professor valor ) {
		nodo nodo = new nodo();
		nodo.setValor(valor);
		if(primeiro == null && ultimo == null) {
			primeiro = nodo;
			ultimo = nodo;
		} else {
			ultimo.setProximo(nodo);
			ultimo = nodo;

		}


	}
	public boolean temProximo() {
		if (primeiro == null){
			return false;
		} else if (elementoatual == null){
			elementoatual = primeiro;
			return true;
		} else {
			boolean temproximo = elementoatual.getProximo() != null ? true: false;
			elementoatual = elementoatual.getProximo();
			return temproximo;
		}

	}
	public void remove() {
		if(primeiro.getProximo()!= null) {
			nodo nodo = this.recuperarPenultimo(primeiro);
			ultimo = nodo;
			nodo.setProximo(null);
		}

	}
	private nodo recuperarPenultimo(nodo nodo) {
		if(nodo.getProximo().equals(ultimo)) {
			return nodo;
		}
		return recuperarPenultimo(nodo.getProximo());
	}


} 
