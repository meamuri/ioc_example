package springContainer.entity

import javax.persistence.Entity

/**
 * https://kotlinlang.org/docs/reference/data-classes.html
 * data classes documentation
 */
@Entity
data class Musician(private val name: String, private val instrument: String) {
    fun soundCheck(): String {
        return "musician $name make noice on $instrument instrument"
    }
}