package com.code;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(new Employee(1, "Sushant", 25000, "IT"));
		employees.add(new Employee(2, "Jay", 22500, "HR"));
		employees.add(new Employee(3, "Ranjit", 35000, "IT"));
		employees.add(new Employee(4, "Amit", 45000, "FINANCE"));
		employees.add(new Employee(5, "Vipul", 32000, "IT"));
		
		// sort employee according to name
		
		employees.sort(Comparator.comparing(Employee::getName));
		employees.forEach(System.out::println);
		
		// Find max salary
		
		employees.stream().sorted((a,b)->(int)(b.getSalary()-a.getSalary()))
		.map(Employee::getSalary).limit(1).forEach(System.out::println);
		
		//Find the name of the employee having second max salary
		
		employees.stream().sorted((a,b)->(int)(b.getSalary()-a.getSalary()))
		.map(Employee::getName).limit(2).skip(1).forEach(System.out::println);
		
		// Print count of employee in each department
		
        Map<String, Long> count=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(count);
		// Find average salary
		
		double average= employees.stream().mapToInt(Employee::getSalary).average().getAsDouble();
		System.out.println(average);
		
		// Print distinct department
		
		employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
		
		// List the distinct department
		List<String> distinctDept=employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(distinctDept);
		
		
		
		Map<String, Double> average1= employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(average1);
	}

}
