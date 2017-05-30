data class User(val name: String, val id: Int)

fun getUser(): User {
    return User("Alex", 1)
}

fun main(args: Array<String>) {
    val user = getUser()
    println("name = ${user.name}, id = ${user.id}")

    //or

    val (name, id) = getUser()
    println("name = $name, id = $id")

    //or

    println("name = ${getUser().component1()}, id = ${getUser().component2()}")
}


//My take
data class Superhero(val name: String, val powers: Array<String>, val age: Int)

fun getWolverine(): Superhero {
    return Superhero("Wolverine", arrayOf("Adamantium skeleton", "Blades from knuckles"), 137) 
}

fun main(args: Array<String>) {
    val wolverine = getWolverine()
    println("name: ${wolverine.name}; powers: ${wolverine.powers.joinToString()}; age: ${wolverine.age}")

    //or
    //uses destructuring
    val (name, powers, age) = getWolverine()
    println("name: ${name}; powers: ${powers.joinToString()}; age: ${age}")

    //or
    //without variables
    println("name: ${getWolverine().component1()}; powers: ${getWolverine().component2().joinToString()}; age: ${getWolverine().component3()}")
}