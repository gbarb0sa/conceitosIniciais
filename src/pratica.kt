fun main() {

    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)// a e b e c e d
    // false e (&&) false e (&&) true e (&&) true
    //false, pois precisa que todos sejam true ou false

    println(!a && !b && (c && d))// a invertido e b invertido e (c e d)
    // true e true (true e true)
    //true

    println(a && ((!b || c)|| d))// a e (b invertido ou c) ou d
    // false (true) true
    // false

    println(a || ((!b && c) || !d))// a ( b invertido e c) ou  d invertido
    // false ou ((true e true) ou false)
    // false ou  true
    // true



}

fun ex1(cargo: String): Float {

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

fun ex2(cargo: String, experiencia: Int): Float {
    var bonus = 0f
    if (cargo == "Gerente") {
        if (experiencia < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 1) {
            bonus = 1500f
        } else {
            bonus = 1800f
        }

    } else if (cargo == "Engenheiro") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }

    return bonus
}