package exercises.oop;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;

	public Rectangle() {

	}

	public Rectangle(float length, float width) {
		this.setLength(length);
		this.setWidth(width);
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public double getArea() {
		return this.width * this.length;
	}

	public double getPerimeter() {
		return 2 * (width * length);
	}

	public String toString() {
		return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
	}
}
