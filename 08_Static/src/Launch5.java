public class Launch5 {
    
    // Instance block
    {
       System.out.println("Hi, I'm a Instance Block!"); 
    }
    
    // Static block-1
    static {
        System.out.println("Static Block-1!");
    }
    
    // Static block-2
    static {
        System.out.println("Static Block-2!");
    }
    
    // Static block-3
    static {
        System.out.println("Static Block-3!");
    }
    
    // main method
    public static void main(String args[]) {
    	Launch5 obj1 = new Launch5();
      System.out.println("Hi, I'm a main Block!");
    }
}

