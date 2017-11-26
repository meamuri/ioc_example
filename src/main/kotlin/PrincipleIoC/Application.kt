package PrincipleIoC

import com.github.salomonbrys.kodein.*
import PrincipleIoC.entity.Director
import PrincipleIoC.entity.Musician
import PrincipleIoC.entity.Orchestra

val container = Kodein {
    constant("theBeatles") with listOf(
            Musician("Ringo", "Drums"),
            Musician("Paul", "Bass"),
            Musician("George", "Guitar"),
            Musician("John", "Guitar")
    )
    bind<Orchestra>() with singleton { Orchestra( instance("theBeatles") ) }
    bind<Director>() with provider { Director(instance()) }
}

fun main(args: Array<String>) {
    val director: Director = container.instance()
    val noise: String = director.makePerfectNoise()
    println(noise)
}