class Contact(var name:String ,var surname:String ,var addressLine1:String ,var addressLine2:String ,var email:String ,var mobileTel:String ,var homeTel:String ,var photo:String )
fun main(args: Array<String>) {


    val contact=Contact("ahmed","toto","tunis","rrrrrr","34555","999999","44444","http://")
    println(" name:${contact.name}  \n surname:${contact.surname} \n addressLine1:${contact.addressLine1} \n addressLine2:${contact.addressLine2} " +
            "\n email:${contact.email} \n mobileTel:${contact.mobileTel} \n homeTel:${contact.homeTel}\n photo :${contact.homeTel}")
    contact.mobileTel="5555555"
}
