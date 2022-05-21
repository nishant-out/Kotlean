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
class InfoProvider: Info, sessionInfo{

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

    override fun getSessionID(): String {
        println( "Session 101" )
        return "Session 101"
    }
}



fun main(){
    val obj = InfoProvider()

    obj.getInfo()
    obj.getInfo2()

//    println(obj.getSessionID())
    checkingTypes( obj )
}


fun checkingTypes( ref: Info ) {

    if( ref !is sessionInfo ){
        println( "not same" )
    }
    else{
        println( "it is same" )

        //  As now we know that both interfaces are implemented by same class
        //  So we can typeCast & use I1 to access properties of I2

        (ref as sessionInfo).getSessionID() //  Explicit method

        //  Compiler automatically performs typeCasting
        ref.getSessionID()
    }
}









