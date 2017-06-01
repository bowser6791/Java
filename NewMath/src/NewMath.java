/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



public class NewMath {
   
      static double squareRoot(double square)
  {
    double Guess = square/4.0;
    boolean goodEnough = false;
    while (!goodEnough)
    {
      Guess = ((square / Guess) + Guess)/2.0;
      goodEnough = Math.abs(square - Guess*Guess)
        < 0.001;
    }
    return Guess;
  }



}
