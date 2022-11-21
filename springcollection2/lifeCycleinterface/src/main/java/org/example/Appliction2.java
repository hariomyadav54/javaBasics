package org.example;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
public class Appliction2 implements InitializingBean, DisposableBean {

    private int price;

    public Appliction2() {

    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Appliction2{" +
                "price=" + price +
                '}';
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("appliction set");

    }
    @Override
    public void destroy() throws Exception {
        System.out.println("appliction destroy");

    }
}
