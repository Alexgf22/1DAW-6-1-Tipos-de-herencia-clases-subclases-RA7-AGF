import kotlin.math.PI
import kotlin.math.round

/**
 * Tipo de herencia: Especializacion
 */
open class Figura(
    val posicionX: Int,
    val posicionY: Int
) {

    open fun area(): String {
        return "El area de la figura es: "
    }
}


class Circulo(
    var radio: Int,
    posicionX: Int,
    posicionY: Int
): Figura(posicionX, posicionY) {

    constructor(radio: Int) : this(radio,0,0) {

    }


    override fun area(): String {
        val resultado = round((PI * (radio * radio)))
        return super.area() + resultado
    }

}

class Cuadrado(
    var base: Int,
    var altura: Int,
    posicionX: Int,
    posicionY: Int
): Figura(posicionX, posicionY) {

    constructor(base: Int,altura: Int) : this(base,altura,0,0) {

    }



    override fun area(): String {
        val resultado =  base * altura
        return super.area() + resultado
    }

}





class Triangulo(
    var base: Int,
    var altura: Int,
    posicionX: Int,
    posicionY: Int
): Figura(posicionX, posicionY) {

    constructor(base: Int,altura: Int) : this(base,altura,0,0) {

    }

    override fun area(): String {
        val resultado =  (base * altura) / 2
        return super.area() + resultado
    }

}




fun main() {

    val cuadrado1 = Cuadrado(12,10)

    val circulo1 = Circulo(20)

    val triangulo1 = Triangulo(25,15)

    println(cuadrado1.area())

    println(circulo1.area())

    println(triangulo1.area())

}