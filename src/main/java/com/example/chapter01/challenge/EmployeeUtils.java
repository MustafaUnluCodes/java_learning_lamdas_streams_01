package com.example.chapter01.challenge;

import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtils {


    public String getFullName(Employee employee) {
        //

        Function<Employee, String> fullName = (Employee e) -> {
            return e.getFirstName() + " " + e.getLastName();
        };
        return fullName.apply(employee);
    }

    public String getManagersLastName(Employee employee) {
        //Function<Employee, String> managersLastName = null;

        /*
        Function<Employee, String> managersLastName = (Employee e) -> {

            return e.getManager().getLastName();

        };
        */

        Function<Employee, String> managersLastName = e ->  e.getManager().getLastName();


        return managersLastName.apply(employee);
    }

    public boolean hasBeenEmployedLongerThanFiveYears(Employee employee) {
        //Predicate<Employee> employedLongerThanFiveYears = null;

        Predicate<Employee> employedLongerThanFiveYears = (Employee e) -> {
          return e.getYearsOfService() > 5;
        };
        return employedLongerThanFiveYears.test(employee);
    }

    public boolean hasMoreThanThreeDirectReports(Employee employee) {
        //Predicate<Employee> moreThanThreeDirectReports = null;

        Predicate<Employee> moreThanThreeDirectReports = (Employee e) -> {
           return e.getNumberOfDirectReports()>3;
        };

        return moreThanThreeDirectReports.test(employee);
    }

    public boolean hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(Employee employee) {
        //Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports = null;

        Predicate<Employee> moreThanThreeYearsOfServiceAndLessThanTwoDirectReports = (Employee e) -> {

            return ( (e.getYearsOfService() > 3) && (e.getNumberOfDirectReports() < 2));
        };

        return moreThanThreeYearsOfServiceAndLessThanTwoDirectReports.test(employee);
    }
}
