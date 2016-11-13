package com.game.engine.util;


import java.util.*;

/**
 * Created by Sushant on 11-11-2016.
 */
public final class MapUtil {

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map, boolean descending) {
        List<Map.Entry<K, V>> list =
                new LinkedList<>(map.entrySet());
        Comparator<Map.Entry<K, V>> valueComparator;
        if(descending) {
            valueComparator = new Comparator<Map.Entry<K, V>>() {
                public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                    return (o2.getValue()).compareTo(o1.getValue());
                }
            };
        }
        else {
            valueComparator = new Comparator<Map.Entry<K, V>>() {
                public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2) {
                    return (o1.getValue()).compareTo(o2.getValue());
                }
            };
        }

        Collections.sort(list, valueComparator);

        Map<K, V> sorted = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            sorted.put(entry.getKey(), entry.getValue());
        }
        return sorted;
    }

}