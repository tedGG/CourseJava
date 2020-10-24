package com.company;


import java.util.*;

public class Map<K,V> {
        Set<MyEntry<K,V>> set;
    public Map() {
        set = new HashSet<>();
    }

    public void add(K key,V value){
        set.add(new MyEntry<K,V>(key,value));
        System.out.println(set);
    }
    public void remove(K key){
        set.removeIf(kvMyEntry -> kvMyEntry.getKey().equals(key));
        System.out.println(set);
    }
    public void removeValue(V value){
        set.removeIf(kvMyEntry -> kvMyEntry.getValue().equals(value));
        System.out.println(set);
    }
   /* public void showKeys(K key,V value){
        MyEntry myEntry = new MyEntry(key,value);
        *//*int get = (int) myEntry.getKey();
        System.out.println(get);*//*
        Iterator<MyEntry<K,V>> iterator = set.iterator();
        while(iterator.hasNext()){
            iterator.next().equals(myEntry.getKey());
        }
        System.out.println(iterator);

    }*/
   public void showKey() {
       Set<K> keySet = new HashSet<K>();
       Iterator<MyEntry<K, V>> iterator = set.iterator();
       while (iterator.hasNext()) {
           keySet.add(
                   iterator.next().getKey());
       }

       System.out.println(keySet);
   }
    public void showValue(){
        List<V> listValue = new LinkedList<>();
        Iterator<MyEntry<K, V>> iterator = set.iterator();
        while (iterator.hasNext()) {
            listValue.add(iterator.next().getValue());
        }

        System.out.println(listValue);
    }
    public void showList(){
        System.out.println(set);
    }



}
