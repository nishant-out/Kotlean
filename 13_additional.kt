
//  Useful Properties

fun main(){

    val list = listOf( "Kotlin", "java", "cpp", "javaScript", null )

    list

        .filterNotNull()    //  TO handle null values

        .filter { it.startsWith( "j" ) }    //  Gives error with null values

        .map {
            it.length   //  changes string to their Int length
        }

        .forEach {
        println( it )   //  Prints String
    }

println()

    list

        .filterNotNull()

        .take(3 )   //  Takes first X Strings
        .takeLast( 2 )  //  Gives last X Stirngs

        .forEach {
            println(it)
        }

println()

    list

        .filterNotNull()

        .associate { it.length to it }

        .forEach {
            println( "${it.key}, ${it.value}" )
        }

println()

    val map = list.filterNotNull().associateBy { it.length }

    println( map )

println()

    var ele = list.first()
    ele = list.last()
    ele = list.filterNotNull().last()

    //  Finds "java" from beginning & then stops
    ele = list.filterNotNull().find { it.startsWith( "java" ) }

    //  Finds "java" from last & then stops
    ele = list.filterNotNull().findLast { it.startsWith( "java" ) }

    //  If value is not present it returns null
    ele = list.filterNotNull().findLast { it.startsWith( "ooo" ) }

    //  to not make a string value null, orEmpty is used
    ele = list.filterNotNull().findLast { it.startsWith( "ooo" ) }.orEmpty()

    println( ele )
}








