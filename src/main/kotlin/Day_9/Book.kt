package Day_9
//Let’s create a basic book class, with a title, author, and year. Of course, you could get each of the properties separately.
//Create a method that returns both the title and the author as a Pair.
//Create a method that returns the title, author and year as a Triple. Use the documentation to find out how to use Triple.
//Create a book instance.
//Print out the information about the book in a sentence, such as: “Here is your book X written by Y in Z.”

class Book(val title:String, val author: String, val year: String) {
    fun getTitleAndAuthor(): Pair<String, String>{
        return Pair(title, author)
    }
    fun getTitleAndAuthorAndYear(): Triple<String, String, String>{
        return Triple(title, author, year)
    }
}