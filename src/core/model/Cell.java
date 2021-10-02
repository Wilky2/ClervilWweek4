package core.model;

public class Cell {
	
	Object element;
	Cell cell;
	
	public Cell(Object element) {
		cell = null;
		this.element = element;
	}
	
	public Cell(Object element,Cell next) {
		this.cell = next;
		this.element = element;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public Cell getCell() {
		return cell;
	}

	public void setCell(Cell cell) {
		this.cell = cell;
	}	

}
