package com.wsdll.systemgc;

import org.junit.Test;

/**
 * 垃圾回收
 * System.gc();
 * Object.finalize();
 */
public class SystemGcDemo {

    @Test
    public void method() throws Throwable {
        Person person = new Person("马云", 30);
        System.out.println(person.toString());
        person.finalize();
        System.gc();
    }








    public class Person {
        private String name;
        private int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("我被垃圾回收了" + this.toString());
            super.finalize();
        }
    }
}


