/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
 
fun main(){ 
    
    val str: String = "hello "	//	Immutable i.e. str = "newString"	//	Error
    var str2 : String = "new String"
    
    println( str2 )
    
    str2 = "new2"
    
    var i = 5
    
    println( "Kotin " + str + i )
    
    
    
    // Pt 1.    // data types are not null by default in Kotlin
    // Nullable String ->  ? is used
    
    var s: String? = null
 
    println( s )
 
    s = "stringe"
 
    println( s )
    
}
