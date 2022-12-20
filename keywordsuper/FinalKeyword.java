package keywordsuper;

public class FinalKeyword {
	//The final keyword is a non-access modifier used for classes,attributes and methods
	//Which makes them non-changeable (impossible to inherit or override)
	//The use of this keyword is when we want  a variable to always store the same value at that time we can use final keyword
	//Here pie value is constant -->for area and perimeter
	final float value=  3.14f;
	int r=2;

	private void areaCircle() {
		float area;
		area=value*r*r;
		System.out.println("The area of circle is :"+area);

	}
	
	private void perimeterCircle() {
		float perimeter;
		perimeter=2*value*r;
		System.out.println("The perimeter of circle is :"+perimeter);

	}
	public static void main(String[] args) {
		
		FinalKeyword f=new FinalKeyword();
		f.areaCircle();
		f.perimeterCircle();
		

	}

}
