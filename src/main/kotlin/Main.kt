class Contact {
    var forename = ""
    var surname = ""
    var contactNumber = 0
    var digitilMailAdress = ""

}



class ContactHandler {



    var contact1 = Contact()
    var contact2 = Contact()
    var contact3 = Contact()
    var contact4 = Contact()
    var contact5 = Contact()
    var contact6 = Contact()
    var contact7 = Contact()
    var contact8 = Contact()
    var contact9 = Contact()
    var contact10 = Contact()

    var contacts = arrayOf(contact1, contact2, contact3, contact4, contact5, contact6, contact7, contact8, contact9, contact10)

    fun AddContact(contactNumber: Int){

    }

}



fun main(args: Array<String>) {
    println("Hello World!")
    println(3 + 3)

    var contact1 = Contact()
    contact1.forename = "Tim"
    contact1.surname = "Löfstedt"
    contact1.contactNumber = 1111


    //println("Program arguments: ${args.joinToString()}")
}