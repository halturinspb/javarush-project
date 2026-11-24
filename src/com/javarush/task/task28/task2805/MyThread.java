package com.javarush.task.task28.task2805;

import java.util.concurrent.atomic.AtomicInteger;

public class MyThread extends Thread {
    private static final AtomicInteger priority = new AtomicInteger(1);

    public MyThread() {
        super();
        correctPriority();
    }

    public MyThread(Runnable task) {
        super(task);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable task) {
        super(group, task);
        correctPriority();
    }

    public MyThread(String name) {
        super(name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        correctPriority();
    }

    public MyThread(Runnable task, String name) {
        super(task, name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable task, String name) {
        super(group, task, name);
        correctPriority();
    }

    public MyThread(ThreadGroup group, Runnable task, String name, long stackSize) {
        super(group, task, name, stackSize);
        correctPriority();
    }

//    public MyThread(ThreadGroup group, Runnable task, String name, long stackSize, boolean inheritInheritableThreadLocals) {
//        super(group, task, name, stackSize, inheritInheritableThreadLocals);
//        correctPriority();
//    }

    private synchronized void correctPriority() {
        int newPriority = priority.getAndIncrement();
        newPriority = getThreadGroup() != null && newPriority > getThreadGroup().getMaxPriority() ?
                getThreadGroup().getMaxPriority() : newPriority;
        setPriority(newPriority);
        if (priority.intValue() > MAX_PRIORITY) {
            priority.set(1);
        }
    }
}