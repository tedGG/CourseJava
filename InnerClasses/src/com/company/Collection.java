package com.company;

public class Collection implements Iterator {
    Number[] numbers = {6, 10, 8, 11, 2, 5, 2, 6, 15, 9};

    Task1 task1 = new Task1();
    Task2 task2 = new Task2();
    int index = 0;

    @Override
    public boolean hasNext() {
        if (index < numbers.length) {
            return true;
        }
        return false;
    }
    @Override
    public Number next() {
        Number element = numbers[index];
        index++;
        return element;
    }
    public class Task1 {
        public void method1() {
            while (hasNext()) {
                if (index % 2 != 0) {
                    numbers[index] = 0;
                }
                System.out.print(next() + " ");
            }
        }
    }
    public class Task2 implements Iterator {
        int index = numbers.length - 1;
        @Override
        public boolean hasNext() {
            if (index >= 0) {
                return true;
            }
            return false;
        }
        @Override
        public Number next() {
            Number element = numbers[index];
            index -= 2;
            return element;
        }
        public void method2() {
            System.out.println();
            for (int i = index; i >= 0; i -= 2) {
                System.out.print(next() + " ");
            }
        }
    }

    public static class method5 implements Iterator {
        int index = 0;
        Collection collection = new Collection();
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
            index++;
            return element;
        }
        public void method5() {
            while (hasNext()) {
                if (index % 2 == 0)
                    collection.numbers[index] = 9;
                System.out.print(next() + " ");
            }
        }
    }

}



