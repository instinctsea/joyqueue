package com.jd.journalq.client.samples.spring;

import io.openmessaging.message.Message;
import io.openmessaging.producer.TransactionStateCheckListener;

/**
 * TransactionStateCheckListener1
 * author: gaohaoxiang
 * email: gaohaoxiang@jd.com
 * date: 2019/3/8
 */
public class SimpleTransactionStateCheckListener implements TransactionStateCheckListener {

    @Override
    public void check(Message message, TransactionalContext context) {
        System.out.println(String.format("check, message: %s", message));
        context.commit();
    }
}