

import java.util.Scanner;
import java.io.PrintStream;
public class Main {
    private static Scanner in = new Scanner(System.in);
    private static PrintStream dest = new PrintStream(System.out);
    public static void main(String[] args) {        
        dest.println("How Can I Serve An Evil Genius Program ");
        dest.println("_______________________________________________________________________________________________________________________");
        String answer;
        dest.println("Are you human???");
        answer = in.nextLine();
        if(answer.equalsIgnoreCase("Yes")){
            dest.println("Do you covet or have an MBA???");
            answer = in.nextLine();
            if(answer.equalsIgnoreCase("No")){
                dest.println("Whos more evil Dr.Doom or Barney???");
                answer = in.nextLine();
                if(answer.equalsIgnoreCase("Dr.Doom")){
                    dest.println("Whos more evil Dr.Doom or Dr.Laura???");
                    answer = in.nextLine();
                    if(answer.equalsIgnoreCase("Dr.Doom")){
                        dest.println("You have the itellect of dirt.You'll make a good minion");
                    }
                    else if(answer.equalsIgnoreCase("Dr.Laura")){
                        dest.println("You obviously have no life,you obsequious little worm.You'll make a great lieutenant.");
                    }
                    
                    }
                else if(answer.equalsIgnoreCase("Barney")){
                        dest.println("You have angered your overlord what do you do???");
                        answer = in.nextLine();
                        if(answer.equalsIgnoreCase("Beg")){
                            dest.println("You have the itellect of dirt.You'll make a good minion");
                        }
                        else if(answer.equalsIgnoreCase("Run")){
                            dest.println("You obviously have no life,you obsequious little worm.You'll make a great lieutenant.");
                        }
                }
            
            }
            if(answer.equalsIgnoreCase("Yes")){
                dest.println("Are you fluent in marketspeak???");
                answer = in.nextLine();
                if(answer.equalsIgnoreCase("Yes")){
                    dest.println("Does this fluency Enstrengthen Your Stakeholdship???");
                    answer = in.nextLine();
                    if(answer.equalsIgnoreCase("Yes")){
                        dest.println("You're an obvious threat to greater evil and will be treated as such");
                        dest.println("Well done.You'll make and exemplary food animal");
                    }
                }
                else if(answer.equalsIgnoreCase("No")){
                    dest.println("You have angered your overlord what do you do???");
                answer = in.nextLine();
                        if(answer.equalsIgnoreCase("Beg")){
                            dest.println("You have the itellect of dirt.You'll make a good minion");
                        }
                        else if(answer.equalsIgnoreCase("Run")){
                            dest.println("You obviously have no life,you obsequious little worm.You'll make a great lieutenant.");
                        }                
                }
                
            }
            else if(answer.equalsIgnoreCase("No")){
                dest.println("You have angered your overlord what do you do???");
                answer = in.nextLine();
                        if(answer.equalsIgnoreCase("Beg")){
                            dest.println("You have the itellect of dirt.You'll make a good minion");
                        }
                        else if(answer.equalsIgnoreCase("Run")){
                            dest.println("You obviously have no life,you obsequious little worm.You'll make a great lieutenant.");
                        }
            }
        }
        if(answer.equalsIgnoreCase("No")){
    dest.println("Do you resemble a human???");
    answer=in.nextLine();
    if(answer.equalsIgnoreCase("Yes")){
        dest.println("Are you a politician???");
        answer=in.nextLine();
        if(answer.equalsIgnoreCase("Yes")){
            dest.println("Well done.You'll make and exemplary food animal");
        }
        else if(answer.equalsIgnoreCase("No")){
            dest.println("Would you sell your parental unit(s) into slavery");
            answer = in.nextLine();
            if(answer.equalsIgnoreCase("Yes")){
                dest.println("Oh,you're a politician alright");
                dest.println("Well done.You'll make and exemplary food animal");

            }
            else if(answer.equalsIgnoreCase("No")){
                dest.println("Would you serve the dell guy");
                answer = in.nextLine();
                if(answer.equalsIgnoreCase("Yes")){
                    dest.println("You have the itellect of dirt.You'll make a good minion");

                }
                else if(answer.equalsIgnoreCase("No")){
                    dest.println("For lunch???");
                    answer = in.nextLine();
                    if(answer.equalsIgnoreCase("Yes")){
                        dest.println("You obviously have no life,you obsequious little worm.You'll make a great lieutenant.");
                    }
                    else if (answer.equalsIgnoreCase("No")){
                        dest.println("Well done.You'll make and exemplary food animal");
                    }
                }
            }
        }
    }
    else if(answer.equalsIgnoreCase("No")){
        dest.println("Stick to coding it's your destiny");
    }
}
       
    }
}



