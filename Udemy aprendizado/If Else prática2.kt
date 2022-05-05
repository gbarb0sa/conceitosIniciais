fun exercUm(cargo: String) {
    if (cargo == "Gerente") {
        println("Você vai receber um bônus de R$ 2.000,00")
    } else if (cargo == "Coordenadores") {
        println("Você vai receber um bônus de R$ 1.500,00")
    } else if (cargo == "Engenheiros") {
        println("Você vai receber um bônus de R$ 1.000,00")
    } else if (cargo == "Estagiário")
        println("Você vai receber um bônus de R$ 500,00")


}

fun exercDois(cargo: String, tempo: Int) {

    if (cargo == "Gerente" && tempo < 2) {
        println("Você vai receber um bônus de R$ 2.000,00")
    } else if (cargo == "Gerente" && tempo > 2)
        println("Você vai receber um bônus de R$ 3.000,00")

    if (cargo == "Coordenadores" && tempo < 1) {
        println("Você vai receber um bônus de R$ 1.500,00")
    } else if (cargo == "Coordenadores" && tempo > 1)
        println("Você vai receber um bônus de R$ 1.800,00")
    else if (cargo == "Engenheiros")
        println("Você vai receber um bônus de R$ 1.000,00")
    else if (cargo == "Estagiário") {
        println("Você vai receber um bônus de R$ 500,00")
    }
}

    fun main() {
        exercDois("Gerente", 3)
        exercDois("Coordenadores", 3)
        exercDois("Coordenadores", 0)


    }
