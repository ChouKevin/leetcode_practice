package com.leetcode.util;

import java.util.ArrayList;

public class Node {
    // for link list
    public int val;
    public Node next;
    public Node random;
    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    // for graph
    public ArrayList<Node> neighbors;
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
