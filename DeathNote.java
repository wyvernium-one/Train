import java.util.*;
public class DeathNote 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("RULES:\n"+" >>   The human whose name is written in this note shall die.\r\n" + 
                " >>   This note will not take effect unless the writer has the person's face in their mind when writing his/her name. Therefore, people sharing the same name will not be affected.\n" + 
                " >>   If the cause of death is written within the next 40 seconds of writing the person's name, it will happen.\n" + 
                " >>   If the cause of death is not specified, the person will simply die of a heart attack.\n" + 
                " >>   After writing the cause of death, details of the death should be written in the next 6 minutes and 40 seconds.\n");

            System.out.println("Proceed further only if you truly wish to (y/n)");
            char choice = sc.nextLine().charAt(0);
            if(Character.toUpperCase(choice)=='Y')
            {
                System.out.println("Enter the name of victim.");
                String name = sc.nextLine();
                System.out.println("Enter the cause of death (optional) :");
                String cause = sc.nextLine();
                sc.close();
                if(cause!="")
                {
                    System.out.println("Enter the details of death");
                    String details = sc.nextLine(); 
                    try
                        {
                            Thread.sleep(40000);
                        }
                        catch(Exception e){}
                        System.out.println(name+" died of "+cause+" the way you planned\n"+details);
                }
                else
                {
                    try
                        {
                            Thread.sleep(40000);
                        }
                        catch(Exception e){}
                        System.out.println(name+" died of a heart attack!");
                }
            }
            else
            {
                System.exit(0);
            }
    }
}