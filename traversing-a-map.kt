fun main(args: Array<String>) {
    val map = hashMapOf<String, Int>()
    map.put("one", 1)
    map.put("two", 2)

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }
}

//my take
fun main(args: Array<String>) {
    val newMap = hashMapOf<String, String>()
    newMap.put("cat", "gunther")
    newMap.put("dog", "otis")
    newMap.put("rabbit", "sally")

    for ((k, v) in newMap) {
        println("My ${k}'s name is ${v}.")
    }
}