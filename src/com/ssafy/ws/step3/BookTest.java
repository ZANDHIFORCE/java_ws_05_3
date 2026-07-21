package com.ssafy.ws.step3;

/**
 * BookManager 클래스를 이용하여 도서 객체 추가,삭제,조회하는 클래스
 */
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManger bookManger = new BookManger();
		bookManger.add(new Book("21424", "Java Pro", "김하나", "jaen.kr", 15000, "Java 기본 문법"));
		bookManger.add(new Book("21425", "Java Pro2", "김하나", "jaen.kr", 25000, "Java 응용"));
		bookManger.add(new Book("35355", "분석설계", "소나무", "jaen.kr", 30000, "SW 모델링"));
		
		System.out.println("*************도서목록*************");
		print(bookManger.getList());
		System.out.println("*************도서조회:21424*************");
		System.out.println(bookManger.searchByIsbn("21424"));
		System.out.println("*************도서삭제:21424*************");
		bookManger.remove("21424");
		System.out.println("*************도서목록*************");
		print(bookManger.getList());
		
	}
	
	public static void print(Book[] books) {
		for(Book b : books) {
			System.out.println(b);
		}
	}

}
