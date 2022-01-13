class MenuHandler {

    var contactHandler = ContactHandler()

    fun Start(){
        println("yo yo yo madafakas. Start the program by typing [H] into the window!"
                )
    }

    fun MainMenu(){
        println("This is your contact list:")



        for (Contacts in contactHandler.contacts){
            if (Contacts.contactNumber == 0)
                println(Contacts.forename + Contacts.surname)
            else
                println(" " + "{" + Contacts.forename + Contacts.surname + Contacts.contactNumber + " " + "}")

        }



        println("Press [A] to add a contact!")
        println("Press [B] to remove a contact!")
        println("Press [A] to edit a contact!")

    }

}