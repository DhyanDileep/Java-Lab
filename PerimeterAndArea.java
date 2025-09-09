import java.io.*;
class Shape{
	float getPerimeter(){
		return 0;
	}
	
	float getArea(){
		return 0;
	}
}
class Circle extends Shape{
	float radius;
	float pi = 3.14f;
	
	Circle(float radius){
		this.radius=radius;
	}
	
	float getPerimeter(){
	
		return 2*pi*radius;
	}
	
		float getArea(){
		return pi*radius*radius;
	}
}

class PerimeterAndArea{
	public static void main(String args[]){
		Circle obj = new Circle(5.0f);
		System.out.println("Perimeter: "+obj.getPerimeter());
		System.out.println("Area: "+obj.getArea());
	}
}
