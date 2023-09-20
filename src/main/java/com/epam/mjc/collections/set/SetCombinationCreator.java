package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        HashSet<String> hashtable = new HashSet<>();

        for (String str: firstSet) {
            if(secondSet.contains(str) && !thirdSet.contains(str)){
                hashtable.add(str);
            }
        }

        for (String str: thirdSet) {
            if(!secondSet.contains(str) && !firstSet.contains(str)){
                hashtable.add(str);
            }
        }


        return hashtable;
    }
}
