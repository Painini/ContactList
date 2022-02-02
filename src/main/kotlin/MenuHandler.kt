class MenuHandler {


    /* The Start function prints text when the program starts up */
    fun Start(){
        println("Start the program by typing [H] into the window!")
    }


    /* The MainMenu function prints out information regarding the current contactList
       and user choices.
     */
    fun MainMenu(contactHandler: ContactHandler){
        println("This is your contact list: (If empty, you have no friends) \n")


        contactHandler.PrintAndCount()
        println()

        println("Type in [A] to add a contact!")

        if (contactHandler.contactList.isNotEmpty())
        {
            println("Type in [B] to remove a contact!")
            println("Type in [C] to edit a contact!")
            println("Type in [D] to alphabetically sort the contact list!")
            println("Type in [F] to close the program!")
        }
    }

}