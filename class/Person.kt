class Person( var fstName: String = "thor", var lstName: String = "Ragnarock" ){

//    val fstName = fstName
//    val lstName = lstName

//      Setters & Getters
    var nickName: String? = null

        set( value ){   //  Should be below a member declaration
            field = value
            println( "NickName is: $field" )
        }
        get() {
            println( "Returning $field" )
            return field
        }

    init{
        //  Executed when any instance of class is created
        println( "init Block" )
    }

    //  Secondary Constructor
    constructor(): this( "tony", "stark" ){
        println( "No argument constructor" )
    }

    init {
        println( "init can be multiple in a class" )
    }




    fun getInfo(){
        nickName = nickName ?: "no nickname"
        println( "$fstName ($nickName) $lstName" )
    }
}
