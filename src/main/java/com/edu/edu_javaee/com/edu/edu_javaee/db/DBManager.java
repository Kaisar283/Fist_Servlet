package com.edu.edu_javaee.com.edu.edu_javaee.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Items> items = new ArrayList<>();

    private static long id = 5l;

    static {
        items.add(new Items(1L,"IPhone 11",  350_000, 35));
        items.add(new Items(2L,"IPhone 12",  400_000, 44));
        items.add(new Items(3L,"IPhone 13",  500_000, 60));
        items.add(new Items(4L,"IPhone 14",  600_000, 100));
        items.add(new Items(5L,"IPhone 14 Pro",  800_000, 30));
    }

    public static void addItem(Items item){
        item.setId(id);
        items.add(item);
        id++;
    }

    public static ArrayList<Items> getItems(){
        return items;
    }
}
