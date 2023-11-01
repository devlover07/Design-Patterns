package builder;

import builder.Student;

public class Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student st = Student.builder()
							.setName("Abhishek")
							.setId(852145)
							.setYoe(0)
							.setGradYear(2020)
							.setPsp(76)
							.build();
	}
	/*
    Nested classes ->
	    1. Normal nested or inner -> outer class object is needed to call constructor inner class
	    2. Static inner class -> no need outer class object, inner class constructor can be called using outer class Name
	    3. Local inner class -> inside a method
	 */

}
