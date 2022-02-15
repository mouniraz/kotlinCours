abstract  class Forme
{
  abstract fun perimetre():Double
    abstract  fun surface():Double
}
class Rectangle(var largeur:Double,var hauteur:Double):Forme()
{
    override fun perimetre():Double {
        return (this.largeur+hauteur)*2
    }

    override fun surface():Double  {
        return (largeur*hauteur)
    }

}
class Circle(var rayon:Double):Forme()
{
    override fun perimetre(): Double {
        return (Math.PI)*2*rayon
    }

    override fun surface():Double  {
        return (Math.pow(rayon,2.0))
    }

}


fun main()
{   val circle=Circle(10.0)
    val rectangle=Rectangle(10.0,10.0)

    println("la surface du cercle est ${circle.surface()}")
    println("le perimetre du cercle est ${circle.perimetre()}")

    println("la surface du rectangle est ${rectangle.surface()}")
    println("le perimetre du rectangle est ${rectangle.perimetre()}")


}
