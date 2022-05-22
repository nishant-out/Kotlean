
interface idProvider{
    fun getID(): String
}


class Entity private constructor( val id: String ) {

    //  can be used without name also "Factory"
    companion object Factory: idProvider{

        fun create() = Entity( getID() )

        const val id = "100"

        override fun getID(): String {
            return "999"
        }
    }

    fun show() = println( "running" )
}

fun main(){

    val obj0 = Entity.Factory.create()

    //  Or
    val obj = Entity.create()

    obj.show()
}
