// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   ConnectionfactoryTest.java

package com.test.utilTest;

import com.test.util.Connectionfactory;
//import java.io.PrintStream;
import java.sql.Connection;

public class ConnectionfactoryTest
{

    public ConnectionfactoryTest()
    {
    }

    public static void main(String args[])
        throws Exception
    {
        Connectionfactory cf = Connectionfactory.getInstance();
        Connection conn = cf.makeConnection();
        System.out.println(conn.getAutoCommit());
    }
}
