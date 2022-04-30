fun maiorDeIdade(idade: Int) {
    if (idade > 18) {
        println("maior de idade")
        if (idade > 60) {
            println("Terceira idade")
        }

    } else if (idade < 10) {
        println("Criança")
    } else {
        println("Menor de idade")

    }
}


fun main() {
    maiorDeIdade(19)
    maiorDeIdade(10)
    maiorDeIdade(9)
    maiorDeIdade(67)
}