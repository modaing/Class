package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;
import com.ohgiraffers.test.view.BookMenu;

import java.util.Scanner;

public class BookManager {

    BookMenu bookMenu = new BookMenu();
    BookDTO bookDTO[] = new BookDTO[10];

    Scanner sc = new Scanner(System.in);


    public BookManager() {
    }

    public void addBook(BookDTO book) {
        for (int i = 1; i < bookDTO.length; i++) {
            sc.nextInt(i);
        }
        System.out.println(" 더 이상 추가할 수 없습니다. ");

    }


    public void deleteBook(int index) {
        if(bookDTO[] == index) {

        }

    }

    public int serachBook(String bTitle) {
        bookMenu.inputBookTitle();
        return;
    }

    public void printBook(int index) {
        System.out.println();
    }

    public void displayAll() {
        bookDTO.getBno();
        bookDTO.getCategory();
        bookDTO.getTitle();
        bookDTO.getAuthor();

    }

    public BookDTO sortedBookList(int select) {
        return;
    }

    public void printBookList(BookDTO br) {
        for(bookDTO : ) {
            displayAll();
        }
    }
}
