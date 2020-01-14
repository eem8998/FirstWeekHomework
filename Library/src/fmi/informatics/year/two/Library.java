package fmi.informatics.year.two;

import java.util.ArrayList;

public class Library {
	
	String libraryName;
	ArrayList<Book> books = new ArrayList<Book>();
	
	public void showBooks(){
		for(int i = 0; i < books.size(); i++) {						//Исках да направя извеждането на String без @Override
			System.out.println(books.get(i).bookInfo());			//на toString() метода, за това реших да опитам да направя
		}															//собствен метод за извеждане на String-ове
	}
	
	public void searchBookByAuthor(String author) {
		for(int i = 0; i < books.size(); i++) {
																	//Направих и още един различен метод за String-овете, но
			if(author == books.get(i).getBookAuthor()) {			//не съм сигурен дали не се води лоша практика, просто не
				System.out.println(books.get(i).bookSearched());	//искам да променям метода по подразбиране toString() освен
																	//ако няма начин по който да го променям няколко пъти за
			}/*else {												//който не се сещам и не успях да намеря.
				System.out.println("Author was not found!");		//В последствие се усетих че това не помага освен ако не сложа
			}*/														//Флаг който да отчита ненамерена книга.
		}
	}
	
	public void addBook(String title, String author, String publisher, int year, String isbn) {
		
		Book addingBook = new Book();								//До колкото разбрах от колеги това би трябвало
																	//да е възможно да се направи и с конструктор в класа
		addingBook.setBookTitle(title);								//Book, но не съм сигурен как ще стане, а и заданието
		addingBook.setBookAuthor(author);							//изисква метод. За това просто ще ви попитам по време
		addingBook.setBookPublisher(publisher);						//на часа.
		addingBook.setBookYear(year);
		addingBook.setBookISBN(isbn);
		
		books.add(addingBook);
	}

	public void removeBook(int bookID) {							//Сметнах bookID да следва нормалното отброяване от 1 до n,
		books.remove(bookID-1); 									//но ако решим да използваме отброяването на масивите в java,
	}																//ще махна -1 от books.remove(bookID-1).

	public void removeBookByAuthor(String author) {
		for(int i = 0; i < books.size(); i++) {						//Малко съм се отплеснал и не бях направил точно този метод
																	//но предполагам ако ползвам само този няма да има проблем
			if(author == books.get(i).getBookAuthor()) {			//понеже не съм сигурен дали трябва да се извеждат книгите
				books.remove(i);									//или само да се намерят и изтрият.
				i--;
			}
		}
	}
	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	
	
}
