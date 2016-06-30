package main;

import com.sun.istack.internal.Builder;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class Person {

	private int age;
	private String name;
	private String sex;
	private String workOn;


	private Person(Builder builder) {
		this.age = builder.age;
		this.name = builder.name;
		this.sex = builder.sex;
		this.workOn = builder.workOn;

	}
	
	
	

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getWorkOn() {
		return workOn;
	}



	public void setWorkOn(String workOn) {
		this.workOn = workOn;
	}



	public static class Builder {
		private int age = 1;
		private String name = "fenglin";
		private String sex = "女";
		private String workOn = "apple";

	
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}

		public Builder setName(String name) {
			this.name = name;
			return this;
		}

		public Builder setSex(String sex) {
			this.sex = sex;
			return this;
		}

		public Builder setWorkOn(String workOn) {
			this.workOn = workOn;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
}
