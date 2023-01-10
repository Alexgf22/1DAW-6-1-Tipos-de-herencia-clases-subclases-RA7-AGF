/**
 * Tipo de herencia: Extension
 *
 * La superclase es Vehiculo y las subclases son: Coche y Moto.
 *
 * Se crea estructura donde una clase extiende el comportamiento de otra sin que sea necesariamente
 * un concepto mas especifico.
 *
 * @property ano: Int  Ano de fabricacion del coche
 * @property matricula: String Matricula del coche
 * @property color: String Color del coche
 * @property marca: String Marca del coche
 * @property modelo: String Modelo especifico de la marca del coche
 *
 * Anadir funcionalidad por ejemplo que el coche para arrancar meta la llave y gire y en la moto
 * le de a la pata.
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
    modelo: String,
    val numeroPuertas: Int) : Vehiculo(ano, matricula, color, marca,
    modelo
) {


    override fun arrancar(): String {
        return "El coche $modelo ha sido arrancado por el conductor"
    }


    override fun parar(): String {
        return "El coche $modelo ha sido parado por el conductor"
    }

    override fun toString(): String {
        return super.toString() + "ademas tiene $numeroPuertas puertas"
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