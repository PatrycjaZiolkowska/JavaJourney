public class IncrementDecrement {
    public static void main(String[] args) {

        // increment
        int a =0;
        System.out.println("Wartość a: " + a); 
        int b =a++; 
        System.out.println("Wartość b: " + b); 
        System.out.println("Wartość a: " + a); 
        int c = ++a; 
        System.out.println("Wartość c: " + c);
        System.out.println("Wartość a: " +a); 
 
    
 
         // decrement
         int d =0;
         System.out.println("Watrość d: " + d);
         int e = d--;
         System.out.println("Wartość e: " + e);
         System.out.println("Wartość d: " + d); 
         int f = --d;
         System.out.println("Wartość f: " + f); 
         System.out.println("Wartość d: " + d); 


        // task 1 

        int g = 7;
        int h = 3;
        int i;

        i = g-- * ++h + 2;
        //g=6, h=4, i=30

        System.out.println("g=" + g + ", h=" + h + ", i=" + i);

        // tasks 2

        int x, y = 13, z;
        
        x = ++y * 2;
        z = x++ + y;
        y = ++x + x-- - z++ - --z;
        System.out.println("x=" + x + ", y=" + y + ", z=" + z);
        //x=29, y=-24, z=42

        

    }

}
