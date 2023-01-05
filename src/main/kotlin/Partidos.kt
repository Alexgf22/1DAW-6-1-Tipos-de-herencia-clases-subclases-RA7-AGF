
open class Lista(
    var lista: MutableList<String> = mutableListOf()
)


/**
 * Tipo de herencia: Construccion.
 *
 * La hija puede aprovechar la padre pero no tienen conexión.
 *
 * La clase padre es Lista y la subclase es Partidos ya que hereda de Lista.
 *
 * La clase Lista contribuye a crear los Partidos realizados haciendo uso de la herencia.
 *
 * @property lista: MutableList<String> Incluye los partidos jugados.
 */
class Partidos(
    lista: MutableList<String> = mutableListOf()
): Lista(lista) {

    fun nuevoPartido(partido: String): String {
        var resultado = ""

        resultado += if (partido !in lista) {
            lista.add(partido)
            "El partido $partido ha sido anadido con exito"
        } else {
            "El partido ya se ha realizado"
        }
        return resultado
    }

    fun quitarPartido(partido: String): String {
        var resultado = ""

        resultado += if (partido in lista) {
            lista.remove(partido)
            "El partido $partido ha sido eliminado con exito"
        } else {
            "El partido $partido no se encuentra en los realizados"
        }
        return resultado



    }

    override fun toString(): String {
        return "Los partidos jugados son: $lista"
    }

}


fun main() {

    val partidos1 = Partidos(mutableListOf("Atletico Madrid vs Cadiz","Madrid vs Almeria"))

    println(partidos1.nuevoPartido("Barcelona vs Betis"))
    println(partidos1.quitarPartido("Sevilla vs Valencia"))
    println(partidos1.quitarPartido("Madrid vs Almeria"))

    println(partidos1)

}
