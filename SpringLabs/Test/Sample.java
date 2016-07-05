// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sample.java

package com.mncindia;

import java.io.PrintStream;

// Referenced classes of package com.mncindia:
//            Example

public class Sample extends Example
{

    public Sample()
    {
        x = 50;
        y = 70;
        System.out.println("Sample non args");
    }

    public static void main(String args[])
    {
        Sample s = new Sample();
        System.out.println(s.x);
        System.out.println(s.y);
    }

    int x;
    int y;
}
