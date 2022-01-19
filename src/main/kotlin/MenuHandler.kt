class MenuHandler {

    var contactHandler = ContactHandler()

    fun Start(){
        println("yo yo yo madafakas. Start the program by typing [H] into the window!")
    }

    fun MainMenu(){
        println("This is your contact list:")

      contactHandler.Print()

        println("Type in [A] to add a contact!")
        println("Type in [B] to remove a contact!")
        println("Type in [C] to edit a contact!")

    }

}