package com.company;

public class Main {
    static Collection collection = new Collection();

    public static void main(String[] args) {
        collection.task1.method1();
        collection.task2.method2();
        var iterator1 = new Iterator() {
            int index = collection.numbers.length - 1;
            @Override
            public boolean hasNext() {
                if (index >= 0) {
                    return true;
                }
                return false;
            }
            @Override
            public Number next() {
                Number element = collection.numbers[index];
                index -= 3;
                return element;
            }

            void method3() {
                System.out.println();
                for (int i = index; i >= 0; i -= 3) {
                    System.out.print(next() + " ");
                }
            }
        };

        System.out.print("method 3: ");
        iterator1.method3();

        var iterator2 = new Iterator() {

            int index = 0;

            @Override
            public boolean hasNext() {
                if (index < collection.numbers.length) {
                    return true;
                }
                return false;
            }
            @Override
            public Number next() {
                Number element = collection.numbers[index];
                index+=5;
                return element;
            }
            public void method4(){
                while (hasNext()) {
                    System.out.print(next() + " ");
                }
            }
        };

        System.out.println("\n method 4: ");
        iterator2.method4();
        System.out.println("\nmethod 5:  ");
        Collection.method5 m5 = new Collection.method5();
        m5.method5();
    }
}