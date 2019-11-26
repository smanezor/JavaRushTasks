package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandmother = new Human("Luba", false, 66);
        Human grandmother2 = new Human("Nina", false, 58);
        Human grandfather = new Human("Vasya", true, 59);
        Human grandfather2 = new Human("Zheka", true, 65);

        Human mother = new Human("Tanya", false, 38, grandfather, grandmother);
        Human father = new Human("Danil", true, 42, grandfather2, grandmother2);

        Human child = new Human("Daniil", true, 17, mother, father);
        Human child2 = new Human("Katya", true, 19, mother, father);
        Human child3 = new Human("Kirill", true, 11, mother, father);

        System.out.println(grandfather.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother.toString());
        System.out.println(grandmother2.toString());

        System.out.println(mother.toString());
        System.out.println(father.toString());

        System.out.println(child.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());



    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}