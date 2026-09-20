public class Demo {
  public static void main (String[] args){
  Student a = new Student();
  a.name = "Ali";
  Student b = a;
  b.name = "Sara";
  Student c = new Student();
  c.name = a.name; 
  
  System.out.println("Before: ");
  System.out.println("Name a: " + a.name);
  System.out.println("Name b: " + b.name);
  System.out.println("Name c: " + c.name);
  System.out.println(a==b);
  System.out.println(b==c);

  b = new Student();
  b.name = "Hira";

  System.out.println("After: ");
  System.out.println("Name a: " + a.name);
  System.out.println("Name b: " + b.name);
  System.out.println("Name c: " + c.name);

  
}}
