package Exercise113;


/**
 * Author: Le Phuong Thanh Date: 19/08/2016 Version: 1.0 Class calculation
 * distance between two points
 *
 */
public class Calculate13DistancePoint {

	private Exercise13Point pointA;
	private Exercise13Point pointB;

	public Exercise13Point getPointA() {
		return pointA;
	}

	public void setPointA(Exercise13Point pointA) {
		this.pointA = pointA;
	}

	public Exercise13Point getPointB() {
		return pointB;
	}

	public void setPointB(Exercise13Point pointB) {
		this.pointB = pointB;
	}

	public Calculate13DistancePoint() {
		super();
	}

	public Calculate13DistancePoint(Exercise13Point pointA, Exercise13Point pointB) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
	}

	/**
	 * Function: calculation distance between two points Input: Output: return
	 * distance between two points
	 * 
	 * @return
	 */
	public double calDistance() {
		double distance = Math.sqrt((pointA.getX() - pointB.getX()) * (pointA.getX() - pointB.getX())
				+ (pointA.getY() - pointB.getY()) * (pointA.getY() - pointB.getY()));
		return distance;

	}
	public double calArea(){
		double area=3.14*calDistance();
		return area;
	}

}
