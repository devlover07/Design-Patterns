/**
 * 
 */
package prototype;

public class IntelligentStudent extends Student {

	private int iq;
	
	public IntelligentStudent() {
		
	}
	
	public IntelligentStudent(IntelligentStudent intelligentStudent) {
		super(intelligentStudent);
		this.iq = intelligentStudent.iq;
		// TODO Auto-generated constructor stub
	}
	
	public IntelligentStudent clone() {
		return new IntelligentStudent(this);
	}

	public int getIq() {
		return iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	@Override
	public String toString() {
		return "IntelligentStudent [iq=" + iq + "]";
	}
	
	
}
