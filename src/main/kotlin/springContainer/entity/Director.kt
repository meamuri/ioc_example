package springContainer.entity

import org.springframework.stereotype.Service

@Service
class Director {
    lateinit var orchestra: Orchestra
    fun makePerfectNoise(): String {
        val sounds: List<String> = orchestra.findAll().map { m -> m.soundCheck() }
        return sounds.joinToString(",\n")
    }

} // .. class Director