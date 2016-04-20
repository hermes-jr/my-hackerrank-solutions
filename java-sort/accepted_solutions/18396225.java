import java.util.*;

class Student implements Comparable<Student>{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
    
    
    
    @Override
    public int compareTo(Student o)
    { 
        if(o == null) return -1;
        if(o.getCgpa() != this.getCgpa()) {
            return new Double(o.getCgpa()).compareTo(this.getCgpa()); 
        }
        else
        {
            //System.out.println("equals, comparing names" + this.getFname() + " " + o.getFname());
            int nam = this.getFname().compareTo(o.getFname());
            if(nam != 0) {
                return nam;
            }
            else {
                //System.out.println("equals, comparing tokens" + this.getToken() + " " + o.getToken());
                return new Integer(this.getId()).compareTo(o.getId());
            }
        }
        //return 0;
    }
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      
       Collections.sort(studentList);
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}
