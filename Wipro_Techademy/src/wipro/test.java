package wipro;


@FunctionalInterface   //Annotation
interface validator
{
boolean validator(String input);
}
 
public class test
{
public static void main(String[] args)
{
validator emailCheck=email->email.contains("@");
 
System.out.println(emailCheck.validator("test@gmail.com"));
}
 
}