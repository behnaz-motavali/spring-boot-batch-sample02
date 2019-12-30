package com.behsazan.batch.step;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by motavali on 12/30/2019.
 */
public class Processor implements ItemProcessor<String, String> {

    @Override
    public String process(String data) throws Exception {
        return data.toUpperCase();
    }

}