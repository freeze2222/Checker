package com.company;
import java.util.*;

public class Main {
    public static Random random=new Random();
    static int N=10000;
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        System.out.print("ArrayList:       ");
        check(arrayList);
        LinkedList<Integer> LinkedList=new LinkedList<>();
        System.out.print("LinkedList:      ");
        check(LinkedList);
        Stack stack=new Stack();
        System.out.print("Stack:           ");
        check(stack);
        TreeSet treeSet=new TreeSet();
        System.out.print("TreeSet:         ");
        checkTree(treeSet);
        HashSet hashSet=new HashSet();
        System.out.print("HashSet:         ");
        checkTree(hashSet);
        LinkedHashSet linkedhashSet=new LinkedHashSet();
        System.out.print("LinkedHashSet:   ");
        checkTree(linkedhashSet);
    }
    static public void check(List arr){
        //add
        long start=System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arr.add(random.nextInt());
        }
        long end=System.currentTimeMillis();
        System.out.print("[add]"+(end-start)+"  ");
        //contains
        start=System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arr.contains(i);
        }
        end=System.currentTimeMillis();
        System.out.print("[contains]"+(end-start)+"  ");
        //get
        start=System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arr.get(i);
        }
        end=System.currentTimeMillis();
        System.out.print("[get]"+(end-start)+"  ");
        //remove(i)
        start=System.currentTimeMillis();
        for (int i = 1; i < N; i++) {
            arr.remove(random.nextInt(arr.size()));
        }
        end=System.currentTimeMillis();
        System.out.println("[remove]"+(end-start)+"  ");
    }








    static public void checkTree(Set arr){
        //add
        long start=System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arr.add(random.nextInt());
        }
        long end=System.currentTimeMillis();
        System.out.print("[add]"+(end-start)+"  ");
        //contains
        start=System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arr.contains(i);
        }
        end=System.currentTimeMillis();
        System.out.print("[contains]"+(end-start)+"  ");
        //remove(i)
        start=System.currentTimeMillis();
        for (int i = 1; i < N; i++) {
            arr.remove(random.nextInt(arr.size()));
        }
        end=System.currentTimeMillis();
        System.out.println("[remove]"+(end-start)+"  ");

    }
}