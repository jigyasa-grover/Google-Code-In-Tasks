import javax.swing.*;
public class FossasiaGame
{
     public static void main (String [] args)
      {

       String answer = "";
          
       
       String response;
       char responseChar;
       int c=0;
      JOptionPane.showMessageDialog(null,"Welcome to the Open Source Quiz. You will need to put choices for your answer. Good Luck!!");
//1
        response=JOptionPane.showInputDialog(null,"Who created Linux?"
                                            + "\n A. Linus Torvalds"
                                            + "\n B. Richard Stallman"
                                            + "\n C. Eric Raymond"
                                            + "\n D. Tim Cook");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='a' || responseChar=='A')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is A");
      }
//2      
      response=JOptionPane.showInputDialog(null,"Who wrote the book The Road Ahead?"
                                            + "\n A. Steve Jobs"
                                            + "\n B. Steve Wozniak"
                                            + "\n C. Mark Zuckerberg"
                                            + "\n D. Bill Gates");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='d' || responseChar=='D')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is D");
      }
      
//3      
      response=JOptionPane.showInputDialog(null,"Who created Free Software Foundation?"
                                            + "\n A. Linus Torvalds"
                                            + "\n B. Richard Stallman"
                                            + "\n C. Eric Raymond"
                                            + "\n D. Steve Jobs");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='b' || responseChar=='B')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is B");
      }
      
//4      
      response=JOptionPane.showInputDialog(null,"Who company developed the first UNIX OS?"
                                            + "\n A. AT&T"
                                            + "\n B. IBM"
                                            + "\n C. Sun Microsystems"
                                            + "\n D. Apple");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='a' || responseChar=='A')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is A");
      }
      
//5      
      
      response=JOptionPane.showInputDialog(null,"Who coined the term Open Source?"
                                            + "\n A. Dave Hanson"
                                            + "\n B. Richard Stallman"
                                            + "\n C. Eric Raymond"
                                            + "\n D. Bill Gates");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='c' || responseChar=='C')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is C");
      }
      
//6      
      response=JOptionPane.showInputDialog(null,"Which of the following is not a con to using open source software?"
                                            + "\n A. Difficult to integrate with proprietary software"
                                            + "\n B. Users have to learn new systems if they are used to Windows"
                                            + "\n C. There is often an abundance of patches"
                                            + "\n D. It has a very high cost");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='d' || responseChar=='D')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is D");
      }
      
//7      
      response=JOptionPane.showInputDialog(null,"Which of the following is an alternative to Microsoft Visio"
                                            + "\n A. Dia"
                                            + "\n B. Pidgin"
                                            + "\n C. MySQL"
                                            + "\n D. Powerpoint");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='a' || responseChar=='A')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is A");
      }
      
//8      
      response=JOptionPane.showInputDialog(null,"Which of the following is an alternative to Microsoft Office?"
                                            + "\n A. Amarok"
                                            + "\n B. Thunderbird"
                                            + "\n C. Firefox"
                                            + "\n D. OpenOffice");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='d' || responseChar=='D')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is D");
      }
      
//9      
      response=JOptionPane.showInputDialog(null,"Which of the following is an alternative to Microsoft Visual Studio"
                                            + "\n A. Skype"
                                            + "\n B. Exchange"
                                            + "\n C. Foobar"
                                            + "\n D. Eclipse");
        if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }
        responseChar=response.charAt(0);
        if (responseChar=='d' || responseChar=='D')
             {

                JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
             }
             else
             {

                JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is D");
      }
//10     
       response=JOptionPane.showInputDialog(null,"	What is the most popular open source ECM?"
                                            + "\n A. Django"
                                            + "\n B. Alfresco"
                                            + "\n C. JQuery"
                                            + "\n D. Sharepoint");
     if (response == null)
        {
            JOptionPane.showMessageDialog(null, "Thanks for playing. Your score is " +c, "Thanks", 1);
        }                                       
     responseChar=response.charAt(0);

         if (responseChar=='b' || responseChar=='B')
      	     {

      	     	JOptionPane.showMessageDialog(null,"Excellent, you answered correctly");
                       c +=1;
      	     }
      	     else
      	     {

      	     	JOptionPane.showMessageDialog(null,"Incorrect answer, Correct answer is B");
      	     	
      }
      JOptionPane.showMessageDialog(null,"You answered "+c+" out of 10 correctly.");
                       
    }
}