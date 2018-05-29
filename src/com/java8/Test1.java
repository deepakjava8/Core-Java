package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
public static void main(String[] args) {
	List<String> list=Arrays.asList("abc","xuz",null,"test",null);
	List<String> collect = list.stream().filter(x->x!=null).collect(Collectors.toList());
	collect.forEach(System.out::println);
}
}
