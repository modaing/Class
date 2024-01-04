package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);
    BookManager bm = new BookManager();
    BookDTO bookDTO = new BookDTO();

    public BookMenu() {}

    public void menu() {
        System.out.println("================================");
        System.out.println("==원하시는 메뉴의 숫자를 입력하세요==");
        System.out.println("1. 도서 추가 ===================");
        System.out.println("2. 도서 삭제 ===================");
        System.out.println("3. 도서 검색 ===================");
        System.out.println("4. 도서 목록 보기 ===============");
        System.out.println("9. 프로그램 종료 ================");
        System.out.println("================================");

        switch () {
            case 1 : bm.addBook(); break;
            case 2 : bm.deleteBook(); break;
            case 3 : bm.serachBook(); break;
            case 4 : bm.displayAll(); break;
            case 9 : sc.close();
            default: System.out.println("잘못 입력하셨습니다."); break;

        }
    }

    public BookDTO inputBook() {
//        bookDTO.setCategory(sc.nextInt());
//        bookDTO.setTitle(sc.nextLine());
//        bookDTO.setAuthor(sc.nextLine());
//        return ;
        System.out.print("검색할 도서의 번호를 입력하세요 : ");
        int bookNumber = sc.nextInt();
        System.out.print("검색할 도서의 카테고리를 입력하세요 : ");
        String bookCategory = sc.nextLine();
        System.out.print("검색할 도서의 작가를 입력하세요 : ");
        String bookAuthor = sc.nextLine();
        return bookNumber + bookCategory + bookAuthor;
    }

    public String inputBookTitle() {
        System.out.print("검색할 도서의 제목을 입력하세요 : ");
        String bookName = sc.nextLine();
        if(bookName(equals(bm.sortedBookList()))) {
            System.out.println("검색하신 도서가 있습니다.");
        } else {
            System.out.println("검색하신 도서가 없습니다.");
        }
        return bookName;
    }


}
