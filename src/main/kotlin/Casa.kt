
class Casa(
    private var puertas: Int,
    private val ventanas: Int,
    private val plantas: Int
) {


    fun hacerReforma(puertasNuevas: Int): Boolean {
        puertas += puertasNuevas
        return true
    }

    fun tieneChimenea() : Boolean = true

    override fun toString(): String {
        return "La vivienda tiene: $puertas puertas, $ventanas ventanas y $plantas plantas"
    }
}


/**
 * Tipo de herencia: Construccion.
 *
 * La hija puede aprovechar la padre pero no tienen conexión.
 *
 * La clase padre es Casa y la subclase es Edificio ya que hereda los metodos que les conviene de Casa.
 *
 * La clase Casa contiene varios metodos que son utilizados en la clase Edificio.
 *
 * @property edificios: MutableList<Casa> Incluye las diferentes viviendas.
 */
class Edificio(
    var edificios: MutableList<Casa> = mutableListOf()
) {




    override fun toString(): String {
        return "Los edificios son: $edificios"
    }

}


fun main() {

    val casa1 = Casa(1,2,1)
    val casa2 = Casa(1,4,2)
    val casa3 = Casa(1,6,3)

    val edificios1 = Edificio(mutableListOf(casa1,casa2,casa3))

    println(casa1.hacerReforma(1))
    println(casa2.tieneChimenea())
    println(casa3.hacerReforma(2))

    println(edificios1)



}
