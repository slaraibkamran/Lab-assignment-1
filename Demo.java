public class Demo{ 
  public static void main (String[] args){
  Student currentStudent = new Student();
  currentStudent = null;
  
  //null check
  if(currentStudent == null){
    System.out.println("No object created");}

  else{
    currentStudent.printSummary();}
}
}