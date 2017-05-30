fun main(args: Array<String>) {
    val pair = Pair(1, "one")
    //new variables made via destructuring
    val (num, name) = pair
    println("num = $num, name = $name")
}

class Pair<K,V>(val first: K, val second) {
    operator fun component1(): K {
        return first
    }
    operator fun component2(): V {
        return second
    }
}


//My take
fun main(args: Array<String>) {
    val conversation = Conversation("hello", "bacon")

    val (hello, goodbye) = conversation

    println("Jim says $hello; Paul says $goodbye")
}

class Conversation(val intro: String, val outro: String) {
	//functions use single-item return
    operator fun component1(): String = intro
        //return intro
   
    
    operator fun component2(): String = outro
    	//return outro
} 
