fun main(args: Array<String>) {
    println(max(args[0].toInt(), args[1].toInt())
}
// note: no {} on the block after the conditional
fun max(a: Int, b: Int) = if (a>b) a else b