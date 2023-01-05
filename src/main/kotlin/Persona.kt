

interface Juego {

    val juego: String
    fun directo(): String {
        return "Me gusta hacer stream de $juego"
    }

    fun jugar(): String {
        return "Estoy jugando a $juego"
    }

}


/**
 * Tipo de herencia: Especificacion
 */
open class Persona(
    private val nombre: String,
    private val apellido: String,
    private val edad: Int, override val juego: String
): Juego {


    open fun quienSoy(): String {
        return "Soy: "
    }



    override fun toString(): String {
        return "$nombre $apellido de $edad anos"
    }


}


class Gamer(
    nombre: String,
    apellido: String,
    edad: Int,
    juego: String
): Persona(nombre, apellido, edad, juego) {

    override fun quienSoy(): String {
        return "${super.quienSoy()} gamer"
    }



}





fun main() {

    val gamer1 = Gamer("Alfonso","Lopez",25,"Red Dead Redemption 2")

    val gamer2 = Gamer("Juan","Rodriguez",34,"Fifa 23")

    val gamer3 = Gamer("Antonio","Salado",28,"Minecraft")

    println(gamer1.quienSoy())
    println(gamer1.jugar())
    println(gamer1.directo())

    println(gamer2.directo())

    println(gamer3.jugar())

    println(gamer1)
    println(gamer2)
    println(gamer3)

}