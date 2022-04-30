/** Escreva uma função que seja capaz de receber a quantidade
de anos e transformar em meses, dias, horas, minutos e segundos.
Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos

 escreva uma função capaz de receber uma string e retornar
 a quantidade de carecteres

 escreva uma funçai capaz de calcular o cubo de um numero inteiro (cubo = n*n*n).

 escreva uma funçai capaz de receber milhas e converter em km (1 milha = 1,6km).

*/

fun main() {


    val anos = 2
    val meses = ((2 / 1) * 12)
    val dias = (anos * 365)
    val horas= (dias * 24)
    val minutos = (horas * 60)
    val segundos = (minutos * 60)

    println("2 anos são equivalentes a ${meses} meses.")
    println("2 anos são equivalentes a ${dias} dias.")
    println("2 anos são equivalentes a ${horas} horas.")
    println("2 anos são equivalentes a ${minutos} minutos.")
    println("2 anos são equivalentes a ${segundos} segundos")


}
