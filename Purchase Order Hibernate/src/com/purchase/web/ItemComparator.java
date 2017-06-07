package com.purchase.web;

import java.util.Comparator;

/**
 * Created by ChandraPrakash on 10-05-2017.
 */
public class ItemComparator implements Comparator<Po> {
    @Override
    public int compare(Po o1, Po o2) {

        return o1.getIncoterms().compareToIgnoreCase(o2.getIncoterms());

    }
}