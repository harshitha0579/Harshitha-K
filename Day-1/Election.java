public class Election{
    public static void main(String[] args){
        int age=17;
        if(age==16 || age==17 || age==18)
       { 
        System.out.println(+age+ " is eligible for vote");
       }
       if(age <= 15)
       {
        System.out.println( +age+ " is not eligible for vote");
       }
       if(age >= 18)
       {
        System.out.println(+age+ " is not eligible for vote");
       }
    }
}