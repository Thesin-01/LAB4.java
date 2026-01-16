import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Managerr extends Employee {
    void getDeptDetails();
}

class Head implements Managerr
{
    int empid, deptid;
    String ename, deptname;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        empid = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        ename = sc.next();

    }

    public void getDeptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department id: ");
        deptid = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter department name: ");
        deptname = sc.next();
    }

    void display() {
        System.out.println("Employee id - " + empid);
        System.out.println("Employee name - " + ename);
        System.out.println("Department id - " + deptid);
        System.out.println("Department name - " + deptname);
    }
}

public class Detailsdisplay {
    public static void main(String[] args) {
        Head h = new Head();
        h.getDetails();
        h.getDeptDetails();
        h.display();
    }
}


