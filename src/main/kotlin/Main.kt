fun main(args: Array<String>) {
    var menuHandler = MenuHandler()
    var contactHandler = ContactHandler()

    menuHandler.Start()

    var flag = true

    while (flag) {

        flag = false
        var input = readln()

        if (input == "H") {
            menuHandler.MainMenu(contactHandler)
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

            println("Phone number:")
            var contactNumber = readln()

            println("Mail Adress:")
            var mailAdress = readln()

            contactHandler.AddContact(forename, surname, contactNumber, mailAdress)
            println("Contact has been added! Press [H] to return to the contact list!")

            input = readln()
            if (input == "H")
                menuHandler.MainMenu(contactHandler)

        }

        if (input == "B")
        {
            println("Type in the list number of the person you wish to be removed!")

            var listNumber = readln()
            var listNumberInt = listNumber.toInt()
            contactHandler.RemoveContact(listNumberInt)

            println("Contact has been removed! Press [H] to return to the contact list!")

            input = readln()
            if (input == "H")
                menuHandler.MainMenu(contactHandler)

        }
        if (input == "C")
        {
            println("Type in the list number of the person you wish to be edited!")
            var listNumber = readln()
            var listNumberInt = listNumber.toInt()

            println("New Forename:")
            var forename = readln()

            println("New surname:")
            var surname = readln()

            println("New Phone number:")
            var contactNumber = readln()

            println("Mail Adress:")
            var mailAdress = readln()

            contactHandler.EditContact(listNumberInt, forename, surname, contactNumber, mailAdress)

            println("Contact has been Edited! Press [H] to return to the contact list!")

            input = readln()
            if (input == "H")
                menuHandler.MainMenu(contactHandler)

        }

        if (input == "D")
        {
            contactHandler.AlphabeticalSort()

            println("Contact list has been alphabetically sorted! Press [H] to return to the contact list!")

            input = readln()
            if (input == "H")
                menuHandler.MainMenu(contactHandler)
        }
    }
    //println("Program arguments: ${args.joinToString()}")
}