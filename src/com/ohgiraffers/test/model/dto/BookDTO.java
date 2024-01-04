package com.ohgiraffers.test.model.dto;

public class BookDTO {

    private int bNo;
    private int category;
    private String title;
    private String author;

    public BookDTO() {

    }

    public BookDTO(int category, String title, String author) {
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    public void setBno(int bNo) {
        this.bNo = bNo;
    }
    public void setCategory(int category) {
        this.category = category;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    public int getBno() {
        return this.bNo;
    }
    public int getCategory() {
        return this.category;
    }
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }


    public String toString() {
        return "도서 번호 = " + this.bNo + ", 도서분류코드 = " + this.category + ", 도서 제목 = " + this.title + ", 도서 저자 = " + this.author;
    }
}
