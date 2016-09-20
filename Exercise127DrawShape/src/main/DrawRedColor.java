package main;

public class DrawRedColor extends ShapeDecorator {

	@Override
	public void draw() {
		super.draw();
	}

	public void setBoderColor(){
		System.out.println(" Color is red!");
	}
}
