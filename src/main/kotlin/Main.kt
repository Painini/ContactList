fun main(args: Array<String>) {
    var menuHandler = MenuHandler()
    var contactHandler = ContactHandler()

    menuHandler.Start()

    var flag = true

    while (flag) {

        flag = false
        var input = readln()

        if (input == "H") {
            menuHandler.MainMenu()
            break
        }
        else{
            println("Please type in capital letter [H].")
            flag = true
        }
    }
    flag = true

    while (flag){

        var input = readln()

        if (input == "A")
        {
            println("Forename:")
            var forename = readln()

            println("surname:")
            var surname = readln()

            println("Phonenumber:")
            var contactNumber = readln()
            var contactNumberInt = contactNumber.toInt()


            //VARFÖR FUNKAR DET INTE ATT LÄGGA TILL EN KONTAKT
            contactHandler.AddContact(forename, surname, contactNumberInt)
            println("Contact has been added! Press [H] to return to the contact list!")

            input = readln()
            if (input == "H")
                menuHandler.MainMenu()

        }
    }


    //println("Program arguments: ${args.joinToString()}")
}