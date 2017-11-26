package springContainer.service

import org.springframework.stereotype.Service
import springContainer.entity.Orchestra

interface IDirector {
    fun makePerfectNoise(orchestra: Orchestra): String
}

@Service
class Director: IDirector {
    override fun makePerfectNoise(orchestra: Orchestra): String {
        val sounds: List<String> = orchestra.musicians.map { m -> m.soundCheck() }
        return sounds.joinToString(",\n")
    }
} // .. class Director