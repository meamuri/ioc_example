package springContainer.entity

import PrincipleIoC.entity.Musician
import PrincipleIoC.entity.Orchestra

class Director (private val orchestra: Orchestra) {

    fun makePerfectNoise(): String {
        val musicians: Array<Musician> = orchestra.musicians.toTypedArray()
        val sounds: List<String> = musicians.map { m -> m.soundCheck() }
        return sounds.joinToString(",\n")
    }

} // .. class Director