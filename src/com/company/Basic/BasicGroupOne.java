package com.company.Basic;

public  class BasicGroupOne {
    public static class NumberPlay {
        public static void PrintEvenNumbers(int[] intArray, int max){
            for(int i=0;i<intArray.length;i++){
                int oneInt = intArray[i];
                if(Math.round((double)oneInt/2)==oneInt/2&&oneInt<max)
                    System.out.println(oneInt);
            }
        }
    }


    public class Student {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public void printName(){
            System.out.println(name);
        }
    }

    public class Door {
        public String doorType;

        public Door(){
            this.doorType="Normal Door";
        }

        public void open ()
        {
            System.out.println("Just push to open");
        }
    }


    public class HouseFrontDoor extends Door{
        public HouseFrontDoor(){
            this.doorType="House Front Door";
        }
        public void open(){
            System.out.println("It is a " + doorType +", so firstly unlock it");
            super.open();
        }
    }
}
