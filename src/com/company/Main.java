
package com.company;
import com.company.Basic.BasicGroupOne;

public class Main {

    public static void main(String[] args) {
	   BasicGroupOne basicGroup = new BasicGroupOne();
	   BasicGroupOne.HouseFrontDoor frontDoor=basicGroup.new HouseFrontDoor();
        frontDoor.open();

    }
}
