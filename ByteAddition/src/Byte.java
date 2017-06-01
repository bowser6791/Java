
import java.io.PrintStream;
public class Byte
{   private boolean[] Bytes;
    public boolean [] ones = {false,false,false,false,false,false,false,true};
    public Byte()
    { Bytes = new boolean[8];
    }

    public Byte(boolean[] b)
    {Bytes = b;
    }
    
    public Byte(char [] a)
    {Bytes = new boolean [8];
        for(int i = 0; i<8; i++)
            if(a[i]=='1')
                Bytes[i]=true;
            else 
                Bytes[i]=false;
    }
        
    public Byte to2s()
    {Bytes [0] = !Bytes[0];
     return this;    
    }
        
    public boolean highBit()
    {return Bytes [0];
    }

    public int decimalValue ()
    {if(Bytes[0]==false)
       { return this.absoluteValue();}
     else { Byte one = new Byte(ones);
            Byte t = new Byte(Bytes);
            for(int i=0;i<8;i++)
            {  t.Bytes[i] = !t.Bytes[i];
            }
           t = t.add(one);
           return t.absoluteValue()*-1;
          }
    }
        
    public Byte add (Byte b)
    { Byte sol = new Byte();
        boolean carry = false;
        for(int i=7; i>=0; i--)
        {if (!carry)
         {
           if(Bytes[i] == b.Bytes[i])
              sol.Bytes[i]=false;
           else sol.Bytes[i]=true;
           carry = Bytes[i] && b.Bytes[i];
         }
        else
        { if(Bytes[i] == b.Bytes[i])
            sol.Bytes[i]=true;
          else
            sol.Bytes[i]=false;
             if(Bytes[i] == false && b.Bytes[i] == false)
                carry = false;
            else
              carry = true;
        }

        }
          return sol;
     }

    public int absoluteValue()
    { int val = 0;
       int power = 128;
       for(int i =0; i<8; i++)
       { if(Bytes[i] == true)
         {val = val + power;
         }
       power = power / 2;
       }
       return val;
    }

    public void print(PrintStream o)
    { for(int i=0; i<8; i++)
         if(Bytes[i] == true)
            o.print("1");
         else
            o.print ("0");
     System.out.println (" ");
    }
    
    public String toString()
    { char[] bit = new char[8];
        for(int i = 0; i<8; i++){
        if(Bytes[i] == true)
            bit[i] = '1';
        else bit[i] = '0';
    }
      return "" + bit[0] +"" + bit[1] + "" + bit[2] +
                "" + bit[3] + "" + bit[4] +"" + bit[5] + "" + bit[6] +""+ bit[7];
   }
  }
