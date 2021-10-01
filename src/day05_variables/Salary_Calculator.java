package day05_variables;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Salary_Calculator {
    public static void main(String[] args) {

//        variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
//        100000    0.08         0.21

        double salary= 100_000;
        double stateTaxRate= 0.08;
        double federalTaxRate= 0.21;

        double stateTax, federalTax, totalTax, salaryAfterTax;
        stateTax = salary * stateTaxRate;
        federalTax= salary * federalTaxRate;
        totalTax= stateTax+federalTax;

        salaryAfterTax= salary - totalTax;
        System.out.println(salaryAfterTax);

        System.out.println("with these values: ");
        System.out.println("salary: "+salary);
        System.out.println("state tax rate: "+ stateTaxRate);
        System.out.println("Federal tax rate: "+ federalTaxRate);

        System.out.println("total tax amounts were: ");
        System.out.println("state tax: "+ stateTax);

        System.out.println("federal tax: "+ federalTax);
        System.out.println("total tax: "+ totalTax);
        System.out.println("salary after tax: "+ salaryAfterTax+"$");





























    }
}
