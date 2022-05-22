/*

    Access Specifiers:

//  By default all are public
//  Internal -> class will be public within the same module
//  Private -> within the class in which it is implemented
//  Protected -> within its class & its subclasses


        Simple Interface:
    class class_name: Interface

        Multiple interfaces can be implemented by same class as follows

    class class_name: I1, I2,...In{
    }

 */

interface Info {

    fun getInfo()

    val str: String //  Cannot be initialised

    fun getInfo2(){
        println( "no need to implement" )
    //  THis line/code can be variable according to classes
    //  So, to tackle this we can use variable property----

        println( str )
    }
}

interface sessionInfo{

    fun getSessionID(): String
}

//  Implementing Interface
open class InfoProvider: Info, sessionInfo{

    override fun getInfo() {
        println( "Inside getInfo" )
    }

    override val str: String
        get() = "setting value"

    //  Can still override getInfo2 method
    override fun getInfo2() {
        super.getInfo2()
        println( "Modification by InfoProvider Class" )
    }

    //  To protect id from outside this class & inherited class: protected is used
    protected open val id: String = "101"

    override fun getSessionID(): String {
        println( id )
        return id
    }
}



//  This is anonymous inner Class using object keyword

    val obj = object: Info{

        override val str: String
            get() = "In object"

        override fun getInfo() {
            println( "object" )
        }

        fun getSessionID(): String = "103"
    }

    obj.getSessionID()

//    println(obj.getSessionID())
//    checkingTypes( obj )


}









