package prototype;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentRegistry studentRegistry = new StudentRegistry();
		
		Student aprBatch = new Student();
		aprBatch.setAvgBatchPsp(80);
		aprBatch.setBatchName("Apr-LLD-Batch");
		aprBatch.setYearOfEnrollment(2022);
		studentRegistry.save(aprBatch);
		
		Student mayBatch = new Student();
		mayBatch.setAvgBatchPsp(75);
		mayBatch.setBatchName("May-LLD-Batch");
		mayBatch.setYearOfEnrollment(2022);
		studentRegistry.save(mayBatch);
		
		Student janBatch = new Student();
		janBatch.setAvgBatchPsp(85);
		janBatch.setBatchName("Jan-LLD-Batch");
		janBatch.setYearOfEnrollment(2023);
		studentRegistry.save(janBatch);
		
		Student aprStudent = studentRegistry.get("Apr-LLD-Batch");
		Student mayStudent = studentRegistry.get("May-LLD-Batch");
		Student janStudent = studentRegistry.get("Jan-LLD-Batch");
		
		System.out.println(aprStudent);
		System.out.println(mayStudent);
		System.out.println(janStudent);
		
//		System.out.println(aprBatch);
//		System.out.println(mayBatch);
//		System.out.println(janBatch);
		
		System.out.println(aprStudent.clone());
		System.out.println(mayStudent.clone());
		System.out.println(janStudent.clone());
		
		IntelligentStudent scalerIntelligentStudent = new IntelligentStudent();
		scalerIntelligentStudent.setBatchName("IntelligentGrounp");
		scalerIntelligentStudent.setAvgBatchPsp(100);
		scalerIntelligentStudent.setYearOfEnrollment(2022);
		scalerIntelligentStudent.setIq(100);
		
		System.out.println(scalerIntelligentStudent);
		System.out.println(scalerIntelligentStudent.clone());
	}

}
