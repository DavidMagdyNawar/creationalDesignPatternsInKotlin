package builder

class Sandwich(builder: Builder) {

    var sandwichName = builder.sandwichName
    var breadType = builder.breadType
    var meatType = builder.meatType
    var saladType = builder.saladType

    class Builder(var sandwichName: String) {

        var breadType = ""
        var meatType: String = ""
        var saladType: String = ""

        fun setBreadType(breadType: String): Builder {
            this.breadType = breadType
            return this
        }

        fun setMeatType(meatType: String): Builder {
            this.meatType = meatType
            return this
        }

        fun setSaladType(saladType: String): Builder {
            this.saladType = saladType
            return this
        }

        fun makeSandwitch(): Sandwich {
            return Sandwich(this)
        }

    }

}

fun main() {
    var sandwich = Sandwich.Builder("chicken crispy")
        .setBreadType("tortilla").setMeatType("chicken").setSaladType("green salad").makeSandwitch()
    print("I made ${sandwich.sandwichName} using ${sandwich.breadType}, ${sandwich.meatType} and ${sandwich.saladType}")
}