import java.util.Scanner;

interface Salary {
    void earnings(double basic);
    void deductions(double basic);
    void bonus(double basic);
}

class Manager implements Salary {
    public void earnings(double basic) {
        double earn = basic + (0.8 * basic) + (0.15 * basic);
        System.out.println("Earnings - " + earn);
    }

    public void deductions(double basic) {
        double ded = 0.12 * basic;
        System.out.println("Deduction - " + ded);
    }

    public void bonus(double basic) {
    }
}

class Substaff extends Manager {
    public void bonus(double basic) {
        double bon = 0.5 * basic;
        System.out.println("Bonus - " + bon);
    }
}

public class ammountcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double basic = sc.nextDouble();

        Substaff s = new Substaff();
        s.earnings(basic);
        s.deductions(basic);
        s.bonus(basic);
    }
}
