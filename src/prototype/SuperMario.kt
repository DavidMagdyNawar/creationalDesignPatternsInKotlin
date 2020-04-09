package prototype

class SuperMario : Cloneable {

    var hairColor = ""
    var jump = ""

    var isBig: Boolean
    var length: String


    init {
        hairColor = "brown"
        jump = "0.5 meter"
        length = "1.5 meter"
        isBig = false
    }

    public override fun clone(): SuperMario {
        return SuperMario()
    }

    fun makeMarioBig() {
        isBig = true
        length = "2.0 meters"
    }
}

fun makeSuperMarioBig(smallSuperMario: SuperMario): SuperMario {
    smallSuperMario.makeMarioBig()
    return smallSuperMario
}

fun main() {
    var superMario = SuperMario()
    val smallSuperMario = superMario.clone()
    val bigSuperMario = makeSuperMarioBig(smallSuperMario)
    print("I created a big super mario , ${bigSuperMario.isBig} ${bigSuperMario.length}")
}