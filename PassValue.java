/*******************
Name: Matas Backevicius

Date: Apr 20, 2021

Notes: Passin a value to a method
*******************/

public class PassValue        
{
public static void main(String[] args)                /* printed a question as a statement*/
{
System.out.print("Think what would fill in the blank?");
System.out.println("I spy with my _ _ _ _ _ _ eye a lad_ _ _ _ d ?");
setAnswer("little, lad y b i rd");
}                                               /* set a method name 'Answer' */
public static void setAnswer(String answer)
{                                               /* since it's a sub string will call upon the method */
System.out.println("That is what I saw today!  " + answer);
}
}
      /* end it with a message after the the value for this method is passed upon */
