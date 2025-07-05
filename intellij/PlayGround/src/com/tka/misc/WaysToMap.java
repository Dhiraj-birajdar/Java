package com.tka.misc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WaysToMap {
    Map<Integer, String> map;
    List<String> ans;

    public WaysToMap() {
        this.map = new HashMap<>();
        for (int i = 0;i<26;i++)
            map.put(i+1,String.valueOf((char)('A'+i)));
//        map.forEach((k,v)-> System.out.println(k+" : "+v));
    }

    public static void main(String[] args) {
        WaysToMap main = new WaysToMap();
        System.out.println("he".substring(2));
    }

//    public void mapToChar(String num){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0;i<num.length();i++){
//
//        }
//    }
    public void rec(String num){

    }
}
