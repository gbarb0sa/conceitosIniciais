import java.util.Date

/* Ainda não aprendi orientação a objeto, por isso tive dificuldade em desenolver,
preferi fazer com Inteiro, pois já tenho familiaridade e senti que conseguiria resolver a questão.
Pelo que observei, a lógica usada seria a mesma, porém usando o tipo Data.
 */

fun main() {
    filtro(0 ,10)

}

fun filtro(pInicio: Int?, pFim: Int?) {

    var tabelaFiltrada = mutableListOf<Int>()
    var tabelaDatas: IntArray = intArrayOf(1, 2, 4, 10, 6, 5, 8, 9, 3, 7, 11)

    tabelaDatas.forEach { data ->
        if (pInicio != null && data >= pInicio && pFim != null && data <= pFim)
            tabelaFiltrada.add(data)
    }
    println("$tabelaFiltrada")
}




