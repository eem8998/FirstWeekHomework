package fmi.informatics.year.two;

import java.util.ArrayList;

public class Library {
	
	String libraryName;
	ArrayList<Book> books = new ArrayList<Book>();
	
	public void showBooks(){
		for(int i = 0; i < books.size(); i++) {						//����� �� ������� ����������� �� String ��� @Override
			System.out.println(books.get(i).bookInfo());			//�� toString() ������, �� ���� ����� �� ������ �� �������
		}															//�������� ����� �� ��������� �� String-���
	}
	
	public void searchBookByAuthor(String author) {
		for(int i = 0; i < books.size(); i++) {
																	//�������� � ��� ���� �������� ����� �� String-�����, ��
			if(author == books.get(i).getBookAuthor()) {			//�� ��� ������� ���� �� �� ���� ���� ��������, ������ ��
				System.out.println(books.get(i).bookSearched());	//����� �� �������� ������ �� ������������ toString() �����
																	//��� ���� ����� �� ����� �� �� �������� ������� ���� ��
			}/*else {												//����� �� �� ����� � �� ����� �� ������.
				System.out.println("Author was not found!");		//� ����������� �� ������ �� ���� �� ������ ����� ��� �� �����
			}*/														//���� ����� �� ������ ���������� �����.
		}
	}
	
	public void addBook(String title, String author, String publisher, int year, String isbn) {
		
		Book addingBook = new Book();								//�� ������� ������� �� ������ ���� �� ��������
																	//�� � �������� �� �� ������� � � ����������� � �����
		addingBook.setBookTitle(title);								//Book, �� �� ��� ������� ��� �� �����, � � ���������
		addingBook.setBookAuthor(author);							//������� �����. �� ���� ������ �� �� ������� �� �����
		addingBook.setBookPublisher(publisher);						//�� ����.
		addingBook.setBookYear(year);
		addingBook.setBookISBN(isbn);
		
		books.add(addingBook);
	}

	public void removeBook(int bookID) {							//������� bookID �� ������ ���������� ���������� �� 1 �� n,
		books.remove(bookID-1); 									//�� ��� ����� �� ���������� ������������ �� �������� � java,
	}																//�� ����� -1 �� books.remove(bookID-1).

	public void removeBookByAuthor(String author) {
		for(int i = 0; i < books.size(); i++) {						//����� ��� �� ��������� � �� ��� �������� ����� ���� �����
																	//�� ����������� ��� ������� ���� ���� ���� �� ��� �������
			if(author == books.get(i).getBookAuthor()) {			//������ �� ��� ������� ���� ������ �� �� �������� �������
				books.remove(i);									//��� ���� �� �� ������� � �������.
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
