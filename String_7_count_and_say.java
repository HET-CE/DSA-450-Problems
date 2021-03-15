package com.company;

import java.util.LinkedList;
import java.util.List;

public class String_7_count_and_say {
    public static String countAndSay(int n) {
        LinkedList<Integer> prevSeq = new LinkedList<>();
        prevSeq.add(1);
        // Using -1 as the delimiter
        prevSeq.add(-1);

        List<Integer> finalSeq = nextSequence(n, prevSeq);
        StringBuffer seqStr = new StringBuffer();
        for (Integer digit : finalSeq) {
            seqStr.append(String.valueOf(digit));
        }
        return seqStr.toString();
    }

    public static LinkedList<Integer> nextSequence(int n, LinkedList<Integer> prevSeq) {
        if (n <= 1) {
            // remove the delimiter before return
            prevSeq.pollLast();
            return prevSeq;
        }

        LinkedList<Integer> nextSeq = new LinkedList<>();
        Integer prevDigit = null;
        Integer digitCnt = 0;
        for (Integer digit : prevSeq) {
            if (prevDigit == null) {
                prevDigit = digit;
                digitCnt += 1;
            } else if (digit == prevDigit) {
                // in the middle of the sub-sequence
                digitCnt += 1;
            } else {
                // end of a sub-sequence
                nextSeq.add(digitCnt);
                nextSeq.add(prevDigit);
                // reset for the next sub-sequence
                prevDigit = digit;
                digitCnt = 1;
            }
        }

        // add the delimiter for the next recursion
        nextSeq.add(-1);
        return nextSequence(n - 1, nextSeq);
    }

    public static void main(String[] args) {
        int n = 4;
        String str = countAndSay(n);
        System.out.println(str);

    }
}
