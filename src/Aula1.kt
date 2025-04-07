fun main(){

   val p = Pessoa()

    println("Qual seu Nome?")
    p.nome = readln()

    println("qual sua Idade?")
    p.idade = readln().toInt()

    println("qual seu Peso?")
    p.peso = readln().toDouble()

   println("qual sua Altura?")
    p.altura = readln().toDouble()

   val calcImc = p.peso/ (p.altura * p.altura)
    println("seu Imc é: $calcImc")
}
