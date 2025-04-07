// Nome cientifico, Especie, Dieta, Habitat
// Essa classe é uma superclasse
// A palavra open é usada para indicar que a palavra open pode ser herdada.

class Gato: Animal(){
  val higiene: String = "Usa caixinha de areia"

    override fun somAnimal(): String{
        return "Miau"
    }
}