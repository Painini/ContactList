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


    /* Reads from file and adds information into the contact list using inputStream and a bufferedReader that reads the textfile by line. */
    fun ReadFromFile(contactHandler: ContactHandler)
    {
        val inputStream = File("contactlist.txt").inputStream()
        val lineList = ArrayList<String>()

        inputStream.bufferedReader().forEachLine { lineList.add(it) }

        for (line in lineList)
        {
            var a: ArrayList<String> = ArrayList<String>(line.split("%"))
            contactHandler.AddContact(a[0], a[1], a[2], a[3])
        }
    }
}