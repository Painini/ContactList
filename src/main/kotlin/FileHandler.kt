import java.io.PrintWriter
import java.io.File

/* This class handles reading to and from files within the program. */

class FileHandler {


/* The WriteToFile function uses a PrintWriter to write String variables in the program to lines within the text file.
 */
    fun WriteToFile(Contacts: ArrayList<Contact>)
    {

        val writer = PrintWriter("contactlist.txt")

        for (obj in Contacts)
        {
            writer.append(obj.forename + "%")
            writer.append(obj.surname + "%")
            writer.append(obj.contactNumber + "%")
            writer.append(obj.mailAdress)
            writer.append("\n")

        }

        writer.close()
    }


    /* WORK IN PROGRESS */
    fun ReadFromFile(contactHandler: ContactHandler)
    {
        val inputStream = File("contactlist.txt").inputStream()
        val lineList = ArrayList<String>()

        inputStream.bufferedReader().forEachLine { lineList.add(it) }


    }
}