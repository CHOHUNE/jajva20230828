package ch08interface.lecture;

import java.io.Serializable;

public class C05typeConversion {
    public static final int BYTES = 0;
    public static final int MAX_VALUE=10;

    int i;
    Serializable o=i;
    Comparable<Integer>s=i;

}
