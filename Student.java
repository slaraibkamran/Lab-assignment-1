public class Student{
    int id;
    String name;
    int completedCredits;

    public void printSummary(){
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Completed Credits: " + completedCredits);}

    public int addCredits(int amount){
    completedCredits += amount;
    return completedCredits;}
}