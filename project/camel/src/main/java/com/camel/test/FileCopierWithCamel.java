package com.camel.test;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;


/**
 * @author zhangcm
 * @date 2022年07月25日 16:00
 */
public class FileCopierWithCamel {

    public static void main(String[] args) throws Exception {

        CamelContext camelContext = new DefaultCamelContext();

        camelContext.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("file:data/inbox?noop=true")
                        .to("file:data/outbox");  // (1) 将文件从inbox路由到outbox
            }
        });
        camelContext.start();
        Thread.sleep(10000);

    }

    /**
     * Camel的样板
     * 构建一个CamelContext、添加路由、启动Context，然后终止CamelContext
     * */
}
