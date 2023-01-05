/**
 * Tipo de herencia: Extension
 */
open class Vehiculo(
    private val ano: Int,
    private val matricula: String,
    var color: String,
    private val marca: String,
    val modelo: String,
){

    open fun arrancar(): String {
        return "El vehiculo $modelo ha arrancado"
    }

    fun cambioColor(colorNuevo: String): String {
        this.color = colorNuevo
        return colorNuevo
    }

    open fun parar(): String {
        return "El vehiculo $modelo ha parado"
    }

    override fun toString(): String {
        return "El vehiculo del ano $ano, matricula: $matricula, color: $color, marca: $marca y modelo: $modelo"
    }

}




class Coche(
    ano: Int,
    matricula: String,
    color: String,
    marca: String,
    modelo: String) : Vehiculo(ano, matricula, color, marca,
    modelo
) {

    constructor(ano: Int,matricula: String,color: String,marca: String,modelo: String,numeroPuertas: Int) : this(ano,matricula,color,marca,modelo)

    override fun arrancar(): String {
        return "El coche $modelo ha sido arrancado por el conductor"
    }


    override fun parar(): String {
        return "El coche $modelo ha sido parado por el conductor"
    }



}




class Moto(
    ano: Int,
    matricula: String,
    color: String,
    marca: String,
    modelo: String) : Vehiculo(ano, matricula, color, marca,
    modelo
) {

    override fun arrancar(): String {
        return "La moto $modelo ha sido arrancada por el motorista"
    }

    override fun parar(): String {
        return "La moto $modelo ha sido parada por el motorista"
    }

}





fun main() {

    val coche1 = Coche(2019,"2045 LJD","Azul","Audi","Q5",5)

    val moto1 = Moto(2018,"6834 LPT","Verde","Kawasaki","Ninja 250SL")

    coche1.cambioColor("Rojo")
    println(coche1.arrancar())
    println(coche1.parar())

    println(coche1)

    moto1.cambioColor("Morado")
    println(moto1.arrancar())
    println(moto1.parar())

    println(moto1)

}