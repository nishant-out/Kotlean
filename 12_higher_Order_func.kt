
/*
HIgher Order FUnctions:

        Means taking function as an argument &
        returning them also as a parameter
 */

fun filteredStr( list: List<String>, check:( String ) -> Boolean ){

    list.forEach { it; String
        
        if( check( it ) ){
            println( it )
        }
    }
}




fun fil2( func: ((String) -> Boolean )? ){
    println( func( "java" ) )
}

var func: (String) -> Boolean = {

     it.startsWith( "j" )
}


//  Returning Function
fun getfunc(): (String) -> Boolean {
    return { it.startsWith( "j" ) } //  Lambda function
}


fun main(){

    val list = listOf( "Kotlin", "java", "Cpp", "javaScript" )

    filteredStr( list ) {
        it.startsWith("j")
    }

    fil2( null )    //  functions can also be nullified

    //  function can also be passed as a parameter
    fil2( func )
    fil2( getfunc() )
}

