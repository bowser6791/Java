
public class StackDriver {

    public static void main(String[] args) {
         Stack<Character> stack = new Stack();
       String myString;
       char ch;
       stack.push('r');
       stack.push('a');
       stack.push('c');
       stack.push('e');
       stack.push('c');
       stack.push('a');
       stack.push('r');
       while(!stack.empty()){
           ch=stack.pop();
        System.out.println(ch);

        }
}
}



