package singleton

object Singleton : MyClass() {
    override fun print(name: String) {
        super.print(name)
    }

    init {
        println("Singelton invoked")
    }
}

open class MyClass {
    open fun print(name: String) {
        println("Hi $name , This is my class")
    }

}

fun main(args: Array<String>) {
    Singleton.print("David")
}