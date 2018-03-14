/*
@author: Arica Chakraborty
@date: 13/03/2018
*/

public class FirstUnsigned {
    public static void main(String args[]){

                    
                    int a= Integer.parseUnsignedInt("2147483651");   //storing an unsigned number to a variable a of Integer datatype
                    String strOne = Integer.toUnsignedString(a);    // converting the unsigned number to a string  to print and verify it's value
                    System.out.println(strOne);
                    int b= Integer.parseUnsignedInt("2147483655");
                    String strTwo= Integer.toUnsignedString(b);
                    System.out.println(strTwo);
                    int c= Integer.compareUnsigned(a,b);         //comparing two unsigned numbers
                    System.out.println(c);
                    int d= Integer.divideUnsigned(a,b);		//performing divison with two unsigned numbers with a as dividend and b as divisor
                    System.out.println(d);
                    int e= Integer.remainderUnsigned(a,b);	//calculating the remainder with two unsigned numbers with a as dividend and b as divisor
                    String strThree= Integer.toUnsignedString(e);
                    System.out.println(strThree);
                    

    }
}
