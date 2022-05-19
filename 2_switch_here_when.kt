/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main(){ 
    
    var i: String? = "def"
    
//    i = null
    
    when( i ){	//	switch case
        
        null -> println( "null i" )
        "def" -> println( "default" )
        else -> println( "else part" )
    }
    

    var new_var = if( i == null )	"default" else "non default"
    
    println( new_var )
    
    
    new_var = when( new_var ){
        
        null -> "null new_Var"
        else -> "def: " + i
    }
    
    
    println( new_var )
    
    
    
    
    
    
    
    
    
}
