public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    double tax;
    int bonus;
    double raise;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
        info();
    }

    public double tax(){
        if (salary < 1000) {
            tax=0;
        }else{
            tax=salary*0.03;
        }
        return tax;
    }

    public  int bonus(){
        if (workHours < 40) {
            bonus=0;
        }else{
            bonus=(workHours-40)*30;
        }
        return bonus;
    }

    public double raiseSalary(){
        if (2021-hireYear<10) {
            raise=salary*0.05;
        }else if (2021-hireYear <20) {
            raise=salary*0.1;
        }else{
            raise=salary*0.15;
        }
        return raise;
    }

    public void info(){

        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
        System.out.println("Work Hours: "+workHours);
        System.out.println("Hire Year: "+hireYear);
        System.out.println("Tax: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Salary Raise: "+raiseSalary());
        System.out.println("Salary with Taxes and Bonuses: "+(salary-tax()+bonus()));
        System.out.println("Total Salary: "+(salary+raiseSalary()));
    }
}
