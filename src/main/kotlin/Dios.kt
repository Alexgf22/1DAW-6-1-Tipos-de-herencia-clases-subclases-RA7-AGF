/**
 * Tipo de herencia: Especializacion
 *
 * La clase padre es Dios y las subclases son: Zeus y Poseidon.
 *
 * En este caso la clase padre Dios posee un comportamiento basico pero las subclases lo especializan
 * dependiendo de las caracteristicas del Dios que sea. Por lo que se crea una estructura de clases en
 * la que una especializa a la otra.
 */
open class Dios(
    val nombre: String,
    private val genero: String,
    private val generacion: Int,
    val habilidad: String = ""
) {


    open fun atacar(): String = ""

    override fun toString(): String {
        return "$nombre es $genero y pertenece a la $generacion generacion"
    }
}


class Zeus(
    nombre: String,
    genero: String,
    generacion: Int,
    habilidad: String
): Dios(nombre, genero, generacion, habilidad) {

    var lanzaRayo: Boolean = false
    override fun atacar(): String {
        lanzaRayo = true
        return "$nombre ha usado $habilidad"
    }
}


class Poseidon(
    nombre: String,
    genero: String,
    generacion: Int,
    habilidad: String
): Dios(nombre, genero, generacion, habilidad) {

    var mueveElAgua : Boolean = false

    override fun atacar(): String {
        mueveElAgua = true
        return "$nombre ha utilizado $habilidad para atacar"
    }

}


fun main() {
    val dios1 = Zeus("Zeus","hombre",1,"rayo")

    val dios2 = Poseidon("Poseidon","hombre",1,"el mar")

    println(dios1.atacar())

    println(dios2.atacar())

    println(dios1)
    println(dios2)

}

