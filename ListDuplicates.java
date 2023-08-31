package com.bean;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
      List<Integer> list=Arrays.asList(1,2,3,3,3,4,5,4,4,3,1);
      list.stream().filter(element->list.indexOf(element)!=list.lastIndexOf(element)).distinct().forEach(System.out::println);
    }
}


