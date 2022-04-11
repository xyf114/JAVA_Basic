package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅", 90);
        books[2] = new Book("青年文摘", 5);
        books[3] = new Book("JAVA", 300);

        ArraysExercise.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                return b2.price - b1.price;
            }
        });

        System.out.println(Arrays.toString(books));

    }

    public static void sort(Book [] books, Comparator comparator){
        Book tmp = null;
        for (int i = 0 ; i < books.length - 1; i++){
            for (int j = 0; j< books.length - i - 1; j++){
                if (comparator.compare(books[j], books[j+1]) > 0){
                    tmp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = tmp;
                }
            }
        }
    }

    public static class Book {
        private String name;
        private Integer price;

        public Book(String name, Integer price) {
            this.name = name;
            this.price = price;
        }


        @Override
        public String toString() {
            return "book{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        public String getName() {
            return name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }
}
