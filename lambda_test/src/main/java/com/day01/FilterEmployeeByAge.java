package com.day01;

/**
 * @Classname FilterEmployeeByAge
 * @Description TODO
 * @Date 2019/3/24 15:15
 * @Created by cuiwei34
 */
public class FilterEmployeeByAge implements MyPredicate<Employee>{

	@Override
	public boolean test(Employee t) {
		return t.getAge() >= 35;
	}


}
