package java8_2;


import java.util.Comparator;


public class nameComp implements Comparator<Employee>{​​​​​​​


        @Override
        public int compare(Employee o1, Employee o2) {​​​​​​​
            // TODO Auto-generated method stub
            return o1.getName().compareTo(o2.getName());
        }​​​​​​​
    }​​​​​​​


class AgeComp implements Comparator<Employee>{​​​​​​​


    @Override
    public int compare(Employee o1, Employee o2) {​​​​​​​
        // TODO Auto-generated method stub
        return o1.getAge()-o2.getAge();
    }​​​​​​​
}​​​​​​​


class SalaryComp implements Comparator<Employee>{​​​​​​​


    @Override
    public int compare(Employee o1, Employee o2) {​​​​​​​
        // TODO Auto-generated method stub
        return o1.getSalary()-o2.getSalary();
    }​​​​​​​


}​​​​​