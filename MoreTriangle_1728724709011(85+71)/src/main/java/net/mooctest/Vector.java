package net.mooctest;
import java.lang.Math;

public class Vector {

   protected double dX;
   protected double dY;

   // Constructor methods ....

   public Vector() {
      dX = dY = 0.0;
   }

   public Vector( double dX, double dY ) {
      this.dX = dX;
      this.dY = dY;
   }

   // Convert vector to a string ...
    
   public String toString() {
      return "Vector(" + dX + ", " + dY + ")";
   }

   // Compute magnitude of vector ....
 
   public double length() {
      return Math.sqrt ( dX*dX + dY*dY );
   }

   // Sum of two vectors ....

   public Vector add( Vector v1 ) {
       Vector v2 = new Vector( this.dX + v1.dX, this.dY + v1.dY );
       return v2;
   }

   // Subtract vector v1 from v .....

   public Vector sub( Vector v1 ) {
       Vector v2 = new Vector( this.dX - v1.dX, this.dY - v1.dY );
       return v2;
   }
}
