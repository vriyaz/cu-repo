package com.cu.dp.structural.composite;
import com.cu.utils.Logger;

public class CompositePatternDemo {
	public static void main(String[] args) {
		Employee ceo = new Employee("John", "CEO", 30000);
		Employee headSales = new Employee("Robert", "Sales (Head)", 20000);
		Employee headMarketing = new Employee("Michel", "Marketing (Head)", 20000);
		
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesRep1 = new Employee("Richard", "Sales", 10000);
		Employee salesRep2 = new Employee("Rob", "Sales", 10000);

		ceo.add(headSales);
		ceo.add(headMarketing);
		headSales.add(salesRep1);
		headSales.add(salesRep2);
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		Logger.log(ceo.toString());
		for (Employee headEmployee : ceo.getSubordinates()) {
			Logger.log(headEmployee.toString());
			for (Employee employee : headEmployee.getSubordinates()) {
				Logger.log(employee.toString());
			}
		}
	}
}
