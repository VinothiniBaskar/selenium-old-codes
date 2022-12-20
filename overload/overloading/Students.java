package overload.overloading;

public class Students {

	// create a method by passing id
	public void getStudentInfo(int id) {
		System.out.println("The Student id is:" + id);

	}

	// use a method by passing id and name
	public void getStudentInfo(int id, String name) {
		System.out.println("The Student id is:" + id);
		System.out.println("The Student name is:" + name);

	}

	// use a method by passing email id and phone number
	public void getStudentInfo(String emailId, long phoneNumber) {
		System.out.println("The Student emailId is:" + emailId);
		System.out.println("The Student id phoneNumber:" + phoneNumber);

	}

	public static void main(String[] args) {

		// Create an object for class
		Students s = new Students();
		s.getStudentInfo(10);
		s.getStudentInfo(10, "Vinothini Baskaran");
		s.getStudentInfo("vinothini9198@gmail.com", 8610084950l);
	}

}
