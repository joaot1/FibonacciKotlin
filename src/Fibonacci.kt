fun main() {
    val regex = Regex("^(?:[2-9]|\\d{2,})$")
    var num: String
    do {
        println("Digite uma casa da sequencia de Fibonacci")
        num = readln()
    } while (regex.matches(num))
    println(calcFibonacci(num.toInt()))
}

    fun calcFibonacci(n: Int): Int{
        if(n<= 1){
            return n
        }
        return calcFibonacci(n-1) + calcFibonacci(n-2)
    }
