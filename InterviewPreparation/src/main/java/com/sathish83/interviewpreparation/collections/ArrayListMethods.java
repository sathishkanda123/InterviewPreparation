package com.sathish83.interviewpreparation.collections;

import org.apache.jasper.tagplugins.jstl.core.If;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class ArrayListMethods{

    public static void main(String[] args) {
        normalOperation();
        doCloneOperation();
        removeIfOperation();
        splitIterator();
        trySplitOperation();
    }

    private static void trySplitOperation() {
        System.out.println("#########Try Split Operation##########");
        List<String> names = new ArrayList<>();
        names.add("Sathish Kanda");
        names.add("Kamarajar sivagami");
        names.add("Abdul kalam");
        names.add("Steve");
        Spliterator<String> splitnames= names.spliterator();
        Spliterator<String> splitnames2= splitnames.trySplit();
        splitnames2.forEachRemaining(System.out::println);
        splitnames.forEachRemaining(value->{
            System.out.println("for each remiang"+value);
        });
    }

    private static void splitIterator() {

        System.out.println("#########Split Iterator##########");
        List<String> names = new ArrayList<>();
        List<String> afterOfOp = new ArrayList<>();
        names.add("Sathish");
        names.add("AbdulKalam");
        names.add("Kamarjar");
        Spliterator<String> splitNames = names.spliterator();
        splitNames.tryAdvance(data-> {
            afterOfOp.add(data);
        });
        splitNames.forEachRemaining(datas->{
            System.out.println("remaing data" +datas);
             afterOfOp.add(datas);
        });
        System.out.println("After op in split");
        afterOfOp.forEach(System.out::println);
    }

    private static void removeIfOperation() {
        System.out.println("#########Remove If Operation##########");
        List<String> myNames = new ArrayList<>();
        //myNames.removeIf(value-> value.equals("Sivashankar"));
        myNames.add("Sathish");
        myNames.add("AbdulKalam");
        myNames.add("Kamarajar");
        myNames.add("Sivashankar");
        myNames.removeIf(value-> value.equals("Sivashankar"));
        myNames.forEach(System.out::println);

    }

    private static void doCloneOperation() {

        System.out.println("#########Cloned operation##########");
        ArrayList clonedList1 = new ArrayList();
        clonedList1.add("Sathish");
        clonedList1.add("AbdulKalam");
        clonedList1.add("Kamarajar");
        List clonedList2 = (List) clonedList1.clone();
        clonedList2.add("steve jobs");
        clonedList1.add("Elon Musk");
        clonedList1.forEach(System.out::println);
        System.out.println("#########Cloned operation2##########");
        clonedList2.forEach(System.out::println);
    }

    private static void normalOperation() {

        ArrayList arrayListMethods = new ArrayList();
        arrayListMethods.add(2);
        arrayListMethods.add(3);
        arrayListMethods.add(8);
        arrayListMethods.add(4);
        arrayListMethods.add("sathish");
        arrayListMethods.add("abdulkalam");
        // throws comcurrent exception breaking
//        If a single thread issues a sequence of method invocations that violates the contract of an object, the object may throw this exception. For example, if a thread modifies a collection directly while it is iterating over the collection with a fail-fast iterator, the iterator will throw this exception.
//        arrayListMethods.forEach(value->{
//            arrayListMethods.remove(2);
//        });
        arrayListMethods.forEach(System.out::println);
    }

}
