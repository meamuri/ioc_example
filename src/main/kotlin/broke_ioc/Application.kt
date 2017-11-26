package broke_ioc

import broke_ioc.entity.Director

fun main(args: Array<String>) {
    val director: Director = Director()
    val noise: String = director.makePerfectNoise()
    println(noise)
}