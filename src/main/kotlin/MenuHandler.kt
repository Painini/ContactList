class MenuHandler {



    fun Start(){
        println("Start the program by typing [H] into the window!")
    }

    fun MainMenu(contactHandler: ContactHandler){
        println("This is your contact list: (If empty, you have no friends)")


        contactHandler.Print()

        println("Type in [A] to add a contact!")

        if (contactHandler.contactList.isNotEmpty())
        {
            println("Type in [B] to remove a contact!")
            println("Type in [C] to edit a contact!")
            println("Type in [D] to alphabetically sort the contact list!")
        }


    }

}