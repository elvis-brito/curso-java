package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double Area(){
		return width * height;
	}
	public double Perimeter(){
		return (width*2) + (height*2);
	}
	public double Diagonal() {
		return Math.sqrt((width*width) + (height*height));
	}
	public String toString(){
		return "AREA = "
			+ String.format("%.2f%n", Area())
			+ "PERIMETRO = "
			+ String.format("%.2f%n", Perimeter())
			+ "DIAGONAL = "
			+ String.format("%.2f%n", Diagonal());
	}
}
