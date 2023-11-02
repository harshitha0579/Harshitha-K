public class Bank{
    
        int reg_no;
        String bank_loc;

    public Bank( int regNo , String loc)
    {
        reg_no = regNo;
         bank_loc = loc;
    }
    public static void main(String args[])
    {
        Bank b=new Bank(123 , "bangalore");
        System.out.println("Bank registration number is " + b.reg_no);
        System.out.println("Bank location is " + b.bank_loc);

    }
}