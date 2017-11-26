package ioc_principle

import com.github.salomonbrys.kodein.*
import ioc_principle.entity.Director
import ioc_principle.entity.Musician
import ioc_principle.entity.Orchestra

val perfectMusicians: List<Musician> = listOf(
        Musician("Ringo", "Drums"),
        Musician("Paul", "Bass"),
        Musician("George", "Guitar"),
        Musician("John", "Guitar")
)

val kodein = Kodein {
    bind<Orchestra>() with singleton { Orchestra(perfectMusicians) }
    bind<Director>() with provider {Director(Orchestra(listOf(
            Musician("Ringo", "Drums"),
            Musician("Paul", "Bass"),
            Musician("George", "Guitar"),
            Musician("John", "Guitar")
    ))) }
}

fun main(args: Array<String>) {
//    val orchestra: Orchestra = kodein.instance()
    val director: Director = kodein.instance()
    val noise: String = director.makePerfectNoise()
    println(noise)
}