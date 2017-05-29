fun main(args: Array<String>) {
    println(getStringLength("aaa"))
    println(getStringLength(1))
}

//this function is used above in main
fun getStringLength(obj: Any): Int? {
    if (obj is String)
        return obj.length
    return null
}