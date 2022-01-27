import java.io.PrintWriter

class FileHandler {

    fun WriteToFile(Contacts: ArrayList<Contact>)
    {

        val writer = PrintWriter("contactlist.txt")

        for (obj in Contacts)
        {
            writer.append(obj.forename)
            writer.append(obj.surname)
            writer.append(obj.contactNumber)
            writer.append(obj.mailAdress)

        }

        writer.close()
    }
}