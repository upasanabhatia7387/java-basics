package MethodReferenceExamples;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Allen", 20, "HR", 3456),
				new Employee("Black", 21, "HR", 7889),new Employee("Max", 22, "HR", 345678),
				new Employee("Saloni", 24, "It", 12345),new Employee("Upasana", 25, "IT", 890000),
				new Employee("Doll", 26, "PS", 782));
		
		Map<String, Employee> topEmployees = employees.stream().collect(groupingBy(e -> e.getDept(),
				collectingAndThen(maxBy(comparingInt(e -> e.getSalary())), Optional::get)));
		System.out.println(topEmployees);
	}

}
