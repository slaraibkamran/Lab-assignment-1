public class Demo{ 
  public static void main (String[] args){
  Student s1 = new Student();
  s1.id = 128;
  s1.name = "Laraib";
  s1.completedCredits = 4;
  
  Student s2 = new Student();
  s2.id = 129;
  s2.name = "Batool";
  s2.completedCredits = 3;
  
  System.out.println("Before changing info: ");
  s1.printSummary();
  s2.printSummary();

  s1.name = "Falaq";
  s1.completedCredits = 2;

  System.out.println("After changing info: ");
  s1.printSummary();
  s2.printSummary();


  System.out.println("New Function: ");
  s1.addCredits(2);
  s1.printSummary();
  

  

  }
}