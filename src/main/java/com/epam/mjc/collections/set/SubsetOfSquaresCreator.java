package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i:sourceList) {
            int powInt = (int) Math.pow(i,2);
            if((powInt>=lowerBound) && (powInt<=upperBound)){
                treeSet.add(powInt);
            }
        }
        return treeSet;
    }
}
