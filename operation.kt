fun main(args: Array<String>) {
    val a= readLine()
    val b = readLine()
    println("Enter operator either +, -, * or /")
    val operator = readLine()
    val result = when (operator)
    { "+" -> a?.toInt()!!+ b?.toInt()!!
        "-" -> a?.toInt()!!-b?.toInt()!!
        "*" -> a?.toInt()!!* b?.toInt()!!
        "/" -> a?.toInt()!!/ b?.toInt()!!
        else -> "$operator operator is invalid operator." }
    println("result = $result")
}
