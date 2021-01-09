package pack2.method_ref;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeedetailsPredicate {
	public static Predicate<Employeedetails> isAdultFemale(){
		return p->p.getAge() > 24 && p.getGender().equalsIgnoreCase("f");
	}
	public static Predicate<Employeedetails> ishighersalary(){
		return p ->p.getSalary()<50000 && p.getGender().equalsIgnoreCase("f");
		
	}
	public static Predicate<Employeedetails> isAdultmale(){
		return p->p.getAge() > 21 && p.getGender().equalsIgnoreCase("m");
	}
	
public static List<Employeedetails> filterEmp(List<Employeedetails> emp , Predicate<Employeedetails> predicate)
{
    return emp.stream().filter(predicate).collect(Collectors.<Employeedetails>toList());
}
}