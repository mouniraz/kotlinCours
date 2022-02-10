fun divTow(n:Int):Int
{   var n1=n
    var nbr=0;
    while(true)
    {
       if( n1%2==0)
       {
           nbr++
           n1=n1/2
         //passer a l´iteration suivante
       continue}
        else
      //sortir de boucle while
        break
    }

    return nbr
}
