package builder;

import builder.exceptions.*;

public class Student {
	private String name;
	private int age;
	private double psp;
	private String batch;
	private int id;
	private int yoe;
	private String username;
	private int gradYear;
	private String phoneNumber;
	
	private Student(Builder b) {
		name = b.name;
		age = b.age;
		psp = b.psp;
		batch = b.batch;
		id = b.id;
		yoe = b.yoe;
		username = b.username;
		gradYear = b.gradYear;
		phoneNumber = b.phoneNumber;
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	static class Builder {
		private String name;
		private int age;
		private double psp;
		private String batch;
		private int id;
		private int yoe;
		private String username;
		private int gradYear;
		private String phoneNumber;
		
		public String getName() {
			return name;
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public int getAge() {
			return age;
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public double getPsp() {
			return psp;
		}
		
		public Builder setPsp(double psp) {
			this.psp = psp;
			return this;
		}
		
		public String getBatch() {
			return batch;
		}
		
		public Builder setBatch(String batch) {
			this.batch = batch;
			return this;
		}
		
		public int getId() {
			return id;
		}
		
		public Builder setId(int id) {
			this.id = id;
			return this;
		}
		
		public Builder setYoe(int yoe) {
			this.yoe = yoe;
			return this;
		}
		
		public String getUsername() {
			return username;
		}
		
		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}
		
		public int getGradYear() {
			return gradYear;
		}
		
		public Builder setGradYear(int gradYear) {
			this.gradYear = gradYear;
			return this;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public Builder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public Student build() {
			if(yoe<1) {
				throw new InvalidYoeException("Invalid Year of Experience Exception");
			}
			
			if(gradYear > 2023) {
				throw new InvalidGradYearException("Invalid Grad Year Exception");
			}
			
			if(psp < 75) {
				throw new InvalidPspException("Invalid PSP Exception");
			}
			return new Student(this);
		}
		
	}

}
