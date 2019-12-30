package com.behsazan.batch.step;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by motavali on 12/30/2019.
 */
public class Writer implements ItemWriter<String> {

    @Override
    public void write(List<? extends String> messages) throws Exception {
        for (String msg : messages) {
            System.out.println("Writing the data " + msg);
        }
    }

}
