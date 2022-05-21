/*
      By default all classes are closed
      So to inherit them open keyword is prefixed

        Also to access variables open has to be used
 */
class Inh: InfoProvider() {

    override fun getInfo2() {
        super.getInfo2()
        println( "mod by Inherited Class" )
    }

    override val id: String
        get() = "Session 101"
}
