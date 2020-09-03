fun main(){
       var info = Schools()
    info.name()
    info.majar()

}

interface Students {
    val id : Int
    val classNum :Int
}

interface Teatchers : Students {
    fun name ()
    fun majar()
}

class Schools :Teatchers{
    override fun name() {
        println("The Teacher name is Ali")
    }

    override fun majar() {
        println("The majar is It")
    }

    override val id: Int
        get() = 12

    override val classNum: Int
        get() = 20

}