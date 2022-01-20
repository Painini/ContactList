class ContactHandler () {


    var contactList = ArrayList<Contact>()

    fun AddContact(forename: String, surname: String, contactNumber: String, mailAdress: String) {
        contactList.add(Contact(forename, surname, contactNumber, mailAdress))
    }

    fun RemoveContact(listNumber: Int){
        contactList.removeAt(listNumber - 1)
    }

    fun EditContact(listNumber:Int, forename: String, surname: String, contactNumber: String, mailAdress: String){
        contactList[listNumber - 1].forename = forename
        contactList[listNumber - 1].surname = surname
        contactList[listNumber - 1].contactNumber = contactNumber
        contactList[listNumber - 1].mailAdress = mailAdress

    }

    fun Print()
    {
        var listNumber = 1
        for (Contacts in contactList)
        {
            println("listNumber: " + listNumber + "  ")
            println("{" + " " + Contacts.forename + " " + Contacts.surname + " " + Contacts.contactNumber + " " + Contacts.mailAdress + " " + "}")
            listNumber++
        }


    }
}