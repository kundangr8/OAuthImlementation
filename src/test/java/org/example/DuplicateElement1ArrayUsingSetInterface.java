package org.example;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement1ArrayUsingSetInterface {


    public static void main(String[] args){

        int[] arr = {1,2,3,3};

        Set<Integer> uniqueElement = new HashSet<>();

        for(int elements :arr ){

            if(!uniqueElement.add(elements)){
            System.out.println(elements+ " ");

        }


    }
}}
