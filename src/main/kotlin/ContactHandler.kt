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

    fun AddContact(listNumber: Int, forename: String, surname: String, contactNumber: Int) {


        contacts[listNumber - 1].forename = forename
        contacts[listNumber - 1].surname = surname
        contacts[listNumber - 1].contactNumber = contactNumber
    }
}