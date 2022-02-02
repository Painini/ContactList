import kotlin.collections.ArrayList

/* This class handles contacts. More info below.

 */
class ContactHandler () {

    var contactList = ArrayList<Contact>()

    /* The AddContact function adds contacts to the existing contactList List.

     */

    fun AddContact(forename: String, surname: String, contactNumber: String, mailAdress: String) {
        contactList.add(Contact(forename, surname, contactNumber, mailAdress))
    }


    /* The RemoveContact function uses the listNumber variable to remove contacts from the contactList List */
    fun RemoveContact(listNumber: Int){
        contactList.removeAt(listNumber - 1)
    }

    /* The EditContact function replaces all existing Contact variables with new ones taken from parameters. */
    fun EditContact(listNumber:Int, forename: String, surname: String, contactNumber: String, mailAdress: String){
        contactList[listNumber - 1].forename = forename
        contactList[listNumber - 1].surname = surname
        contactList[listNumber - 1].contactNumber = contactNumber
        contactList[listNumber - 1].mailAdress = mailAdress
    }

    /* The AlphabeticalSort function sorts the contactList alphabetically using the contact's surname */
    fun AlphabeticalSort()
    {
        contactList = ArrayList<Contact>(contactList.sortedWith(compareBy({it.surname})))
    }


    /* The PrintAndCount function prints out all the contacts currently in the contactList. ít also handles the listNumber variable. */
    fun PrintAndCount()
    {
        var listNumber = 1
        for (Contacts in contactList)
        {
            println("----------")
            println("List Number: " + listNumber + "  ")
            println("Name: "+Contacts.forename + " " + Contacts.surname + " | " + "Contact Information: " + Contacts.contactNumber + " " + Contacts.mailAdress)
            listNumber++
        }


    }
}