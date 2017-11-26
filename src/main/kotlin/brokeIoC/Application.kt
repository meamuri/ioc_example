package brokeIoC

import brokeIoC.entity.Director

fun main(args: Array<String>) {
    val director = Director()
    val noise: String = director.makePerfectNoise()
    println(noise)
}