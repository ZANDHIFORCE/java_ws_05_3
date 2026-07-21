package com.ssafy.ws.step3;
import java.util.Arrays;

/**
 * 도서리스트를 배열로 유지하며 관리하는 클래스
 */
public class BookManger {
	
	private static final int MAX_SIZE=100;
	private int size;
	private Book[] books;
	
	public BookManger() {
		books=new Book[MAX_SIZE];
	}
	
	public Book searchByIsbn(String isbn) {
		Book b = null;
		for(int i=0;i<size;i++) {
			if(books[i].getIsbn().equals(isbn))
				return books[i];
		}
		return b;
	}
	
	public void add(Book book) {
		if(size>=MAX_SIZE)
			return;
		
		Book b = searchByIsbn( book.getIsbn() );
		if(b==null)
			books[size++]=book;
	}
	
	public void remove(String isbn) {
		for(int i= size-1;i>=0;i--) {
			if(books[i].getIsbn().equals(isbn)) {
				books[i] = books[--size];
				books[size] = null;
			}
				
							
		}
	}
	
	public Book[] getList() {
		return Arrays.copyOf(books, size);
	}
	
	
	
}