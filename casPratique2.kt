
// Corrigez cette fonction
fun sayMyName(name:String) { println(" $name ") }

// Simplifiez cette fonction
fun sayHello(): String ="hello"

// Simplifiez cette fonction
fun isStudent(isLearning: Boolean): Boolean = if (isLearning) true else  false




fun main(args: Array<String>) {
    println( sayHello() )
    sayMyName("Name")
    println( "Is Student : ${isStudent(true)} " )
}
