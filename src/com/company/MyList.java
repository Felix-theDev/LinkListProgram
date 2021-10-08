package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MyList {
     private static List<Integer> list;

    public MyList() {
        list = new LinkedList<>();
    }
    public boolean addList(int value){
        if(list.contains(value)){
            System.out.println("Value "+ value +" already exist in list");
            return false;
        }
        list.add(value);
        System.out.println("Successfully added "+ value);
        return true;
    }
    public void printList(){
        Collections.sort(list);
        System.out.println("Values of the list are");
        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+ " ");
        }
    }
    public void Arithmetic(){
        int sum = 0;
        for (Integer value: list) {
            sum+= value;
        }
        System.out.println("Sum is "+ sum);
        System.out.println("Average is "+ (double)sum/list.size());
    }
}
