package prototype;

import java.util.HashMap;

public class StudentRegistry {
	private HashMap<String, Student> registry;
	
	public StudentRegistry() {
		this.registry = new HashMap<String, Student>();
	}

	public Student get(String batchName) {
		return registry.get(batchName);
	}

	public void save(Student student) {
		registry.put(student.getBatchName(), student);
	}

}
