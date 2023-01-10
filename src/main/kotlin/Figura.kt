import kotlin.math.PI
import kotlin.math.round

/**
 * Tipo de herencia: Especializacion
 *
 * La clase es Figura y las subclases son: Circulo, Rectangulo y Triangulo.
 *
 * En este caso la clase padre Figura posee un comportamiento basico pero las subclases lo especializan
 * dependiendo de sus caracteristicas. Por lo que se crea una estructura de clases en la que una especializa
 * a la otra.
 */
open class Figura {

    open fun area(): String = ""
}


class Circulo(
    private var radio: Int
): Figura() {


    override fun area(): String {
        val resultado = round((PI * (radio * radio)))
        return "El area del circulo es $resultado"
    }

}

class Rectangulo(
    private var base: Int,
    private var altura: Int
): Figura() {


    override fun area(): String {
        val resultado =  base * altura
        return "El area del rectangulo es $resultado"
    }

}





class Triangulo(
    private var base: Int,
    private var altura: Int
): Figura() {

    override fun area(): String {
        val resultado =  (base * altura) / 2
        return "El area del triangulo es $resultado"
    }

}




fun main() {

    val cuadrado1 = Rectangulo(12,10)

    val circulo1 = Circulo(20)

    val triangulo1 = Triangulo(25,15)

    println(cuadrado1.area())

    println(circulo1.area())

    println(triangulo1.area())

}