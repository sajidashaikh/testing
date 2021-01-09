package java8_2;

public class Employee {
	private int id;
	private int age;
	private String firstname;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, int age, String firstname, int salary) {
		super();
		this.id = id;
		this.age = age;
		this.firstname = firstname;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", firstname=" + firstname + ", salary=" + salary + "]";
	}
	/*public int compare(Employee e1,Employee e2) {
		return e1.getAge() - e2.getAge();
	}
	public int compared(Employee e1,Employee e2) {
		return e1.getFirstname().compareTo(e2.firstname) ;	}
	public int comparing(Employee e1,Employee e2) {
		return e1.getSalary() - e2.getSalary();
	}*/
	
	
	
}
