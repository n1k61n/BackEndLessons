package org.example;
/*
Create a function that takes three arguments:

1. a value to be evaluated for truthiness.
2. a function to execute if the first argument is truthy.
3. a function to execute if the first argument is falsy.
If the first argument evaluates to truthy, call the second argument (a function). If it evaluates to falsy, call the third argument instead (also a function).

In statically-typed languages, the first argument will be a boolean. In dynamically-typed languages that attribute a truth value to all expressions, it may be of any type.
 */
public class Kata {
    public static void _if(Boolean bool, Runnable func1, Runnable func2) {
        if( bool != null && bool)
            func1.run();
        else
            func2.run();
    }
}


//object Kata {
//    @JvmStatic
//    fun _if(bool: Boolean?, func1: Runnable, func2: Runnable) {
//        if (bool != null && bool) func1.run()
//        else func2.run()
//    }
//}
