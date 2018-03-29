package com.quark.entity;

/**
 * Created by 311198 on 2017/3/16.
 */
public class Dervied extends Base {


        private String name = "dervied";

        public Dervied() {
            tellName();
            printName();
        }

        public void tellName() {
            System.out.println("com.quark.entity.Dervied tell name: " + name);
        }

        public void printName() {
            System.out.println("com.quark.entity.Dervied print name: " + name);
        }

        public static void main(String[] args){

            new Dervied();
    }
}
