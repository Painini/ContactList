class ContactHandler {


    var contactList = ArrayList<Contact>()

    fun AddContact(forename: String, surname: String, contactNumber: Int) {
        contactList.add(Contact(forename, surname, contactNumber))
    }

    fun Print()
    {
        for (Contacts in contactList)
        println(" " + "{" + Contacts.forename + Contacts.surname + Contacts.contactNumber + " " + "}")

    }
}