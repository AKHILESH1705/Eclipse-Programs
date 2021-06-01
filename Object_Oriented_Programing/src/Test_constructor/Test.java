package Test_constructor;



class Test{
    static int marks;
    static void set_marks(int mark)
    {
        marks=mark;               //Line 1
    }
}
/*
class Test {
	    static int a=10; 
	    static int b; 
	    static void fun1() 
	    { 
	        a = 20;                             //Line 1
	        b = a*10;                             //Line 2
	        fun2();                             //Line 3
	        System.out.print(b);           //Line 4
	    } 
	    static void fun2() 
	    {     
	        System.out.println("from m2"); 
	    }
}*/

/*
class Test 
{
    static int a = 10; 
    int b = 20; 
    static void fun1() 
    { 
        a = 20;                             //Line 1
        b = 10;                             //Line 2 Line 2: static functions cannot use non-static variables.
        fun2();                             //Line 3 Line 3: Static function cannot call non-static function.
        System.out.print(this.b);           //Line 4 Line 4: this or super keyword cannot be used inside a static function.
    } 
    void fun2() 
    {     
        System.out.println("from m2"); 
    }
}
class MCQ{    
    public static void main(String[] args) 
    { 
        Test.fun1(); 
    } 
} 
*/