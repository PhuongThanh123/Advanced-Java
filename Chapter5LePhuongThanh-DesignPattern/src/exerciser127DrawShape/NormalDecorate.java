package exerciser127DrawShape;

public class NormalDecorate extends ShapeDecorator{

	@Override
	public void draw() {
		
		super.draw();
		setBoder();
	}
	public void setBoder(){
		System.out.println("Normal body!");
	}

}
