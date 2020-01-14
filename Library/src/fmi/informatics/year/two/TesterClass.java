package fmi.informatics.year.two;

public class TesterClass {
	
	public static void test() {
		Library bnb = new Library();
		bnb.libraryName = "National Bulgarian Library";
		System.out.printf("All books in %s:\n\n"
				+ "============================================================================================================================\n"
				,bnb.libraryName);
		bnb.addBook("Harry Potter and the Philosopher's stone", "J. K. Rowling", "Bloomsbury", 1997, "0-7475-3269-9");
		bnb.addBook("It", "Stephen King", "Viking", 1986, "0-670-81302-8");
		bnb.addBook("Christine", "Stephen King", "Viking", 1983, "978-0-670-22026-7");
		bnb.addBook("The Shining", "Stephen King", "Doubleday", 1977, "978-0-385-12167-5");
		bnb.addBook("The Maze Runner", "James Dashner", "Delacorte Press", 2009, "978-0-385-73794-4");
		bnb.addBook("Harry Potter and the Half-Blood Prince", "J. K. Rowling", "Bloomsbury", 2005, "0-7475-8108-8");
		bnb.addBook("Harry Potter and the Deathly Hallows", "J. K. Rowling", "Bloomsbury", 2007, "0-545-01022-5");
		bnb.showBooks();
		System.out.printf("============================================================================================================================"
				+ "\nSearching for a book:\n\n");
		bnb.searchBookByAuthor("James Dashner");
		System.out.printf("============================================================================================================================\n"
				+"All books without Stephen King's:\n\n");
		bnb.removeBookByAuthor("Stephen King");
		bnb.showBooks();
		System.out.println("============================================================================================================================");
	}
}
