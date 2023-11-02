public class Employee{
    int age;
    String name;
    String dept;
    int salary;
   
   public void printInfo(){
     System.out.println(age);
        System.out.println(name);    
     System.out.println(dept);
      System.out.println(salary);
   }
   
   public static void main(String args[])
   {
    Employee e1= new Employee();
    e1.age=21;
    e1.name="harshitha";
    e1.dept="banking";
    e1.salary=30000;
    e1.printInfo();
   }
   
}