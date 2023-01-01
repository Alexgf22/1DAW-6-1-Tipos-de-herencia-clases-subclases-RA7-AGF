

open class Persona(
    private val nombre: String,
    private val apellido: String,
    private val edad: Int
) {

    open fun quienSoy(): String {
        return "Soy una persona: "
    }

    override fun toString(): String {
        return "$nombre $apellido de $edad anos"
    }


}


class Estudiante(
    nombre: String,
    apellido: String,
    edad: Int): Persona(nombre, apellido, edad) {

    override fun quienSoy(): String {
        return "${super.quienSoy()} estudiante"
    }

}




class Trabajador(
    nombre: String,
    apellido: String,
    edad: Int): Persona(nombre, apellido, edad) {

    override fun quienSoy(): String {
        return "${super.quienSoy()} trabajadora"
    }

}



fun main() {
    val persona1 = Persona("Jose","Lopez",22)

    val trabajador1 = Trabajador("Juan","Marquez",34)

    val estudiante1 = Estudiante("Marcos","Peralta",19)

    println(trabajador1.quienSoy())

    println(estudiante1.quienSoy())

    println(persona1)
    println(trabajador1)
    println(estudiante1)

}