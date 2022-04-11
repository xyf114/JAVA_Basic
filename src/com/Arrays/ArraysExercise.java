package com.Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100.0);
        books[1] = new Book("金瓶梅", 90.0);
        books[2] = new Book("青年文摘", 5.0);
        books[3] = new Book("JAVA入门", 300.0);

//        ArraysExercise.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book b1 = (Book) o1;
//                Book b2 = (Book) o2;
//                return b2.price - b1.price;
//            }
//        });

//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                if (o1.price > o2.price)
//                    return 1;
//                else if (o1.price < o2.price)
//                    return -1;
//                else return 0;
//            }
//        });

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.name.length() > o2.name.length())
                    return 1;
                else if (o1.name.length() < o2.name.length())
                    return -1;
                else return 0;
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
        private Double price;

        public Book(String name, Double price) {
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

        public Double getPrice() {
            return price;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }
}
