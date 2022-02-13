enum class Couleur{
    PIQUE,TREFLE, COEUR, CARREAU
}
class Carte (var couleur:Couleur,var valeur:Int){
    override fun toString(): String {
        return "la carte est. ${couleur} ${valeur}"
    }
}
fun showCartes(cartes:ArrayList<Carte>)
{  println("List elements")
    for(carte in cartes)
        println(carte)
}
fun main(args: Array<String>)
{

    var cartes:ArrayList<Carte>
    cartes=arrayListOf()
    //ajouter une liste a la fois
    val carte=Carte(Couleur.TREFLE,2)
    cartes.addAll(listOf( Carte(Couleur.PIQUE,4),Carte(Couleur.CARREAU,1),carte,Carte(Couleur.COEUR,5)))
    showCartes(cartes)

    cartes.remove(carte)
    showCartes(cartes)
    cartes.removeAt(2)
    showCartes(cartes)



}
