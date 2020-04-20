package com.lpgu.model.consumer;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.LinkedList;

/**
 * Created by lpgu on 2020-04-20.
 */
@Slf4j(topic = "consumer")
public class Test {
    public static void main(String[] args) {
        MessageQueue queue = new MessageQueue(2);
        for (int i=0;i<3;i++){
            int id =i;
            new Thread(()->{
                queue.put(new Message(id,"值->"+id));
            },"生产者").start();
        }
        new Thread(()-> {
            while (true){
                try {
                    Thread.sleep(1000);
                    queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
        },"消费者").start();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

/**
 * rocket是进程间通讯
 * 队列是线程间通讯
 */
@Slf4j(topic = "messageQueue")
class MessageQueue {
    private LinkedList<Message> list = new LinkedList<>();
    private int capacity;

    public MessageQueue(int capacity) {
        this.capacity = capacity;
    }

    public Message take() {
        synchronized (list) {
            while (list.isEmpty()) {
                try {
                    log.debug("队列为空，消费者将等待");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Message message = list.removeFirst();
            log.debug("已经消费一消息{}",message);
            list.notifyAll();
            return message;
        }
    }

    public void put(Message message) {
        synchronized (list) {
            while (list.size() == capacity) {
                try {
                    log.debug("队列已满，生产者将等待");
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.addLast(message);
            log.debug("已经生产一消息{}",message);
            list.notifyAll();
        }
    }

}

final class Message {
    private int id;
    private Object value;

    public Message(int id, Object value) {
        this.id = id;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
