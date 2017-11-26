package broke_ioc.entity

class Director () {
    private val musicians: ArrayList<Musician> = ArrayList()
    init {
        musicians.addAll(
                listOf(
                    Musician("Ringo", "Drums"),
                    Musician("Paul", "Bass"),
                    Musician("George", "Guitar"),
                    Musician("John", "Guitar")
                )
        ) // .. addAll
    } // .. init
} // .. class Director