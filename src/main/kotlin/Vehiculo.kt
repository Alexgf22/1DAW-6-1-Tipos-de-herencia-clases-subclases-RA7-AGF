/**
 * Tipo de herencia: Extension
 */
class Vehiculo(
    val puertas: Int,
    val matricula: String,
    var color: String,
    val marca: String,
    private val modelo: String,
){

    fun arrancar(): String {
        return "El vehiculo $modelo ha arrancado"
    }

    fun cambioColor(colorNuevo: String): String {
        return color
    }

    fun parar(): String {
        return "El vehiculo $modelo ha parado"
    }

    override fun toString(): String {
        return "El vehiculo con $puertas puertas, matricula: $matricula, color: $color, marca: $marca y modelo: $modelo"
    }

}