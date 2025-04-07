open class Animal() {
    var nome: String = ""
    var especie: String = ""
    var dieta: String = ""
    var habitat: String = ""

    /*ENCAPSULAMENTO:
   É uma forma de controle sobre os atributos quem pode acessar ou não
     */

    open fun somAnimal() : String {
        return "faz um barulho"
    }
}