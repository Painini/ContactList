fun main(args: Array<String>) {
    val menuHandler = MenuHandler()
    val contactHandler = ContactHandler()
    val fileHandler = FileHandler()

    menuHandler.Start()

    fileHandler.ReadFromFile(contactHandler = contactHandler)
    var flag = true

    fileHandler.WriteToFile(contactHandler.contactList)

    /* Denna while-loop ser till att användaren skriver in "H" i konsollen innan programmet startar på riktigt */
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


    /* Denna while-loop tar hand om all input från användare */
    while (flag){

        var input = readln()

        /* If the user inputs A into the console, it will prompt them to enter details for a new contact to be added */
        if (input == "A")
        {
            println("You have chosen to add a new contact! Please type in their details below:")
            println("Forename:")
            var forename = readln()

            println("Surname:")
            var surname = readln()

            println("Phone number:")
            var contactNumber = readln()

            println("Mail Adress:")
            var mailAdress = readln()

            contactHandler.AddContact(forename, surname, contactNumber, mailAdress)
            println("Contact has been added! Press [H] to return to the contact list!")
            fileHandler.WriteToFile(contactHandler.contactList)


            input = readln()
            if (input == "H")
                menuHandler.MainMenu(contactHandler)

        }

        else if (input == "B")
        {
            println("Type in the list number of the person you wish to be removed!")

            var listNumber = readln()
            var listNumberInt = listNumber.toInt()
            contactHandler.RemoveContact(listNumberInt)

            println("Contact has been removed! Press [H] to return to the contact list!")
            fileHandler.WriteToFile(contactHandler.contactList)


            input = readln()
            if (input == "H")
                menuHandler.MainMenu(contactHandler)

        }

        else if (input == "C")
        {
            println("Type in the list number of the person you wish to be edited!")
            var listNumber = readln()
            var listNumberInt = listNumber.toInt()

            println("New Forename:")
            var forename = readln()

            println("New Surname:")
            var surname = readln()

            println("New Phone number:")
            var contactNumber = readln()

            println("Mail Adress:")
            var mailAdress = readln()

            contactHandler.EditContact(listNumberInt, forename, surname, contactNumber, mailAdress)

            println("Contact has been Edited! Press [H] to return to the contact list!")
            fileHandler.WriteToFile(contactHandler.contactList)


            input = readln()
            if (input == "H")
                menuHandler.MainMenu(contactHandler)

        }

        else if (input == "D")
        {
            contactHandler.AlphabeticalSort()

            println("Contact list has been alphabetically sorted! Press [H] to return to the contact list!")
            fileHandler.WriteToFile(contactHandler.contactList)


            input = readln()
            if (input == "H")
                menuHandler.MainMenu(contactHandler)
        }


        /* This input closes the program */
        else if (input == "F")
        {
            println("Have a wonderful day! c:")
            break
        }

        else
        {
            println("Please type in a valid option!")
        }
    }
    //println("Program arguments: ${args.joinToString()}")
}