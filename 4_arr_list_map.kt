/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun fn( greet: String, lst: List<String> ){
    
    lst.forEach{	itr->
        println( "$greet  $itr" )
    }
}


fun main(){ 
    
    //	By default all are immutable
    
//  val map = mapOf( 1 to "a", 2 to "b" )
//    		  listOf
    val arr = arrayOf( "kotlin", "code", "Development" )
    
    
    //	FOr mutable
    val lst = mutableListOf( "Kotliean" )
    lst.add( "newly added" )
    
    val map = mutableMapOf( 1 to "hie" )
    map.put( 2, "insert" )
    
    map.forEach{	k, v ->
        println( "$k: $v" )
    }
    
    
    
    
    println( arr.size )
    println( arr[ 0 ] )
    println( arr.get( 1 ) )
    
    for (itr in arr){
        println( itr )
    }
    
    arr.forEach{ it;String
        
        println( it )
    }
    
    arr.forEach{ iter ->
        println( iter )
    }
    
    arr.forEachIndexed { index, valu ->
        println( "$index: $valu" )
    }
    
    
    
    //	PAssing list as an argument
    
    fn( "hi", lst )
    
    
    
}
