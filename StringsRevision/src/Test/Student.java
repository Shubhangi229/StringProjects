package Test;
//hello this is my first push to git gjhjhjh
public class Student {
	private String name;
	private String city;
	
	public Student(String name,String city) {
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
	      return "Student:"+this.name + " in " + this.city;
	  }

}
