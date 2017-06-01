

import java.io.PrintStream;
public class Byte {
    private boolean [] Byte ;
  public boolean bytees [] = {false,false,false,false,false,false,false,true};
    public Byte(){
        Byte=new boolean[8];
    }
    
    public Byte(boolean[]b){
    Byte = b;
    
}
    
    public Byte(char []a){
        Byte = new boolean[8];
        for(int i = 0;i<8;i++)
            if(a[i] == 1)
                Byte[i] = true;
            else
                Byte[i] = false;
    }
public void print(PrintStream o){
    for(int i = 0;i<8;i++){
        if(Byte[i]==true)
            o.print("1");
        else 
            o.print("0");
    }
}
public Byte to2s(){
    Byte[0]=!Byte[0];
    return this;
}
public boolean hiBit(){
    return Byte[0];
}
public int absVal(){
    int val =0;
    int power = 128;
    for(int i =0;i<8;i++){
        if(Byte[i]==true)
            val=val+power;
        power=power/2;
    }
    return val;
    }
public Byte add (Byte b){
    Byte solv = new Byte();
    boolean carry = false;
    for(int i =7;i>=0;i--){
        if(!carry)
            if(Byte[i]=b.Byte[i])
                solv.Byte[i]=false;
            else{
                solv.Byte[i]=true;
             carry=Byte[i]&&b.Byte[i];
            }
        else{
            if(Byte[i]==b.Byte[i])
            solv.Byte[i]=true;
            else 
                solv.Byte[i]=false;
        if(Byte[i]==false&&b.Byte[i]==false)
             carry=false;
        else
            carry=true;
        }
            }
   return solv;
    }

public  int decVal(){
    if(Byte[0]==false)
        return this.absVal();
    else{
        Byte t=new Byte(Byte);
        for(int i =0;i<8;i++){
            t.Byte[i]=!t.Byte[i];
            
        }
            Byte one = new Byte(bytees);
            Byte r = t.add(one);
            return r.absVal()*-1;
        }
    
    }
}




