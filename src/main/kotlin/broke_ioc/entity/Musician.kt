package broke_ioc.entity

/**
 * https://kotlinlang.org/docs/reference/data-classes.html
 * data classes documentation
 */
data class Musician(private val name: String, private val instrument: String) {
    fun soundCheck(): String {
        return "musician $name make noice on $instrument instrument"
    }
}