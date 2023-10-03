package com.aleksei.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut(value = "execution(* abc*(..))")
    public void allAddMethods() {}
}
