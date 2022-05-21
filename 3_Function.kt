/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

/*

fun function_name( arg1: type, arg2........ ): return_type

*/

fun say( ){
    println( "Hello" )
}

// Or

fun say2( ) = println( "Hello2" )


//	Or

fun say3( arg: String ){
    println( "HEllo $arg" )
}

//  Default value of arguments
fun fn( greet: String = "def_greet", lst: String = "def_list" ): Int {

    println( "$greet $lst" )
    return -100;
}

fun main(){ 
    
    say3( "Nishant" )
}
