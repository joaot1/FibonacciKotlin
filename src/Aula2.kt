//Ativdade: Crie uma classe Animal
//Atributos: Nome Ciêntifico, Especie, Dieta, Habitat

fun main(){
    val gato: Gato = Gato()
    gato.nome = "gato"
    gato.habitat = "Domestico"
    gato.especie = "Felino"
    gato.dieta = "Peixe"

    /*Isso não é recomendado*/
    //val gato : gato = animal as gato

    println(gato.somAnimal())

    var cachorro: cachorro = cachorro()
    cachorro.nome = "Cachorro"
    cachorro.habitat = "canil"
    cachorro.especie = "canino"
    cachorro.dieta = "Bacon"

    println(cachorro.somAnimal())

    val animal = Animal()
    println(animal.somAnimal())

    /* Toda classe começa com letra MAIUSCULA
    e segue o padrão CamelCase
    Exemplo: MinhaClasse
    */

    /* Os objetos começam com letra MINUSCULA
    Exemplo: minhaObjeto
     */
}