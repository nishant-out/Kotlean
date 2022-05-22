import java.util.UUID

/*
        data classes;   kotlin's way of providing very concise, immutable data types
 */

enum class EntityType{
    HELP, EASY, HARD
}

object EntityProvider{

    fun create( type: EntityType ): Entity {

        val id = UUID.randomUUID().toString()
        return when(type){

            EntityType.EASY -> Entity.Easy( id )
            EntityType.HARD -> Entity.HARD( id, 2.3f )
            EntityType.HELP -> Entity.HELP
        }
    }
}

sealed class Entity() {
    object HELP: Entity() {
        val id = "help"
    }

    data class Easy( val id: String ): Entity()
    data class HARD( val id: String, val mul: Float ): Entity()
}


fun Entity.Easy.printInfo(){
    println( "Extension function" )
}

val Entity.Easy.prop: String
    get() = "Extension property"











fun main(){

    val entity: Entity = EntityProvider.create( EntityType.HELP )

    val msg = when(entity){

        is Entity.Easy -> "easy class"
        is Entity.HARD -> "hard class"

        Entity.HELP -> "help class" //  here no 'is' keyword is used
        //  because, there is object declaration & a singleton class
        //  so no need to have 'is' & can refernce directly
    }

    println( msg )


    val entity1 = EntityProvider.create( EntityType.EASY )
    val entity2 = Entity.Easy( "UUID.randomUUID().toString()" )

    //  For checking same reference ===

    if( entity1 == entity2 )
        println( "Equal" )
    else
        println( "not Equal" )

    if( entity1 is Entity.Easy ){
        entity1.printInfo()
        entity1.prop
    }
}








