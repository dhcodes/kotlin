fun main(args: Array<String>) {
    val x = args[0].toInt()
    val y = 10
    if (x in 1..y - 1)
        println("OK")

    //Iterate range
    for(num in 1..5)
        println("${num}") 

    //Check if number is out of range
    println()
    val array = arrayListOf<String>()
    array.add("aaa")
    array.add("bbb")
    array.add("ccc")

    if (x !in 0..array.size-1)
        println("Out: array has only ${array.size} elements. x = ${x}")

    if ("aaa" in array)
        println("Yes: array contains aaa")
}