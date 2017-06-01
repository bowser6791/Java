
import javax.swing.JOptionPane;
public class StackDriver  {

    public static void main(String[] args) {
         Stack<Character> stack = new Stack();
       String myString;
       String cont;
       char ch;
       int h=0;
       int count=0;
      int f=0;
     while(h==0){
        myString = JOptionPane.showInputDialog(null, "Enter a String");
        while(h==0){
        if (myString==null) {
              myString = JOptionPane.showInputDialog(null, "Enter a String");
         }
        else
            break;
         }
        for(int i = 0;i<myString.length();i++){
        stack.push(myString.charAt(i));
      }
      for(int i = 0;i<myString.length();i++){
      if(!stack.empty()){
           ch=stack.pop();
          if(ch==myString.charAt(i)){
              System.out.println("Match on- "+ch);
              count+=1;
          }
          else {
              System.out.println("No Match on- "+ch);
              count+=0;
          }
    }
      }
      if(count==myString.length()){
               System.out.println("Palindrome Result:True");
      }
           else{
               System.out.println("Palindrome Result:False");
           }
        count=0;
      cont = JOptionPane.showInputDialog(null,"Run Again? Y/N?");
      
       if(cont.equalsIgnoreCase("n"))
           h=1;

        }

    }
      
        }
    

        
            
       
           
           
    
       


