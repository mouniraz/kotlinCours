import java.time.LocalDate

open class Contact(var name:String, var surname:String, var address :String, var email:String, var mobileTel:String, var photo:String )
{
    override fun toString(): String {
        return "Le contact est ${name} ${surname} \nTel:${mobileTel}\nemail:${email}\naddress:${address} \nphoto:${photo}"
    }


}
class PersonnalContact(
    name:String,
    surname:String,
    address:String,
    email:String,
    mobileTel:String,
    photo:String,
    var homeTel:String,
    var date_naissance: LocalDate
):Contact(name,surname,address,email,mobileTel,photo)
{
    override fun toString(): String {
        return super.toString()+"\nhomeTel:${homeTel}+\"\nDate Naissance:${date_naissance}"
    }
}
class ProContact(name:String ,surname:String ,address :String,email:String ,mobileTel:String ,photo:String,var pro_tel:String ):Contact(name,surname,address,email,mobileTel,photo)
{
    override fun toString(): String {
        return super.toString()+"\nproTel:${pro_tel}"
    }
}
