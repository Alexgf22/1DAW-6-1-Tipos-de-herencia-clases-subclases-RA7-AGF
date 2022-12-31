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


}

class Cuadrado(
    var base: Int,
    var altura: Int,
    posicionX: Int,
    posicionY: Int
): Figura(posicionX, posicionY) {

    //constructor(base: Int,altura: Int) : this(base,altura) {

    //}

    override fun area(): String {
        val resultado =  2 * (base + altura)
        return super.area() + resultado
    }

}

class Triangulo() {



}


fun main() {



}