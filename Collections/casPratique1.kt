fun showList(list: List<String>){
    // Complétez la fonction pour afficher les éléments de la liste
    for(item in list)
        println(item)
}


fun showMap(lang: Map<String,String>){
for((index,item) in lang)
    println("$index  $item ")
}
private val languages = listOf("kotlin" , "php" ,"dart" )  // Créez une liste ordonnée de plusieurs languages de programmation, 
private val frameworks = mapOf("kotlin" to "android", "php" to "symphony","dart" to "flutter")  // Créez une liste ordonnée de plusieurs framework de programmation, indiquer pour chaque framework le langage de programmation

fun main(args: Array<String>) {
    //list de langages
    println("langages")
    showList(languages)
    //map of framework
    println("frameworks :")
    showMap(frameworks)
}

