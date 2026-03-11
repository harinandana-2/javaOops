import java.util.Scanner;
class Employee {
     int eNo;
     String eName;
     double eSalary;
     }
 public class employee {
     public static void main (String[] args) {
     
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter number of employees: ");
     int n = sc.nextInt();
     Employee[] emp = new Employee[n];
     for (int i =0;i<n;i++) {
         emp[i] = new Employee();
         System.out.print("Enter eNo: ");
         emp[i].eNo=sc.nextInt();
         sc.nextLine();
         System.out.print("Enter eName : ");
         emp[i].eName=sc.nextLine();
         System.out.print("Enter eSalary : ");
         emp[i].eSalary=sc.nextDouble();
         }
        System.out.print("Enter eNo to search: ");
        int search = sc.nextInt();
        for (int i =0;i<n;i++) {
          if (emp[i].eNo == search) {
             System.out.println("Employee found");
             System.out.println(emp[i].eNo + " " + emp[i].eName + " " + emp[i].eSalary);
             return;
             }
           }
           System.out.println("Employee not found");
           }
         }
           
          
