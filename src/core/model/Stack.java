package core.model;

public class Stack {
	
	Cell element;
	int numberElement;
	
	
	public Stack() {
		element = null;
		numberElement=0;
	}
	
	public void push(Object element) {
		numberElement++;
		this.element = new Cell(element, this.element);
	}
	
	public Object pop() {
		numberElement--;
		Object temp = this.element.getElement();
		this.element = this.element.getCell();
		return temp;
	}
	
	public boolean isEmpty() {
		return numberElement==0;
	}

	public int getNumberElement() {
		return numberElement;
	}
}
