package pack2.method_ref;

public class Employeedetails {
	private Integer id;
	private Integer age;
	private Integer salary;
	private String gender;
	private String fname;
	private String lname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public Employeedetails(Integer id, Integer age, Integer salary, String gender, String fname, String lname) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employeedetails [id=" + id + ", age=" + age + ", salary=" + salary + ", gender=" + gender + ", fname="
				+ fname + ", lname=" + lname + "]";
	}
	

}
