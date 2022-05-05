
fun bonus(cargo: String): Float {

    var bonus = 0f
    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }

    return bonus
}

fun bonusWhen (cargo: String): Float {
    return when (cargo) {
        "Gerente" ->  2000f
        "Coordenador" ->  1500f
        "Engenheiro" ->  1000f
        "Estagiário" ->  500f
        else -> 0f
    }

}

fun main() {

}