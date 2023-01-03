package com.litecode.learnspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDataService implements DataService {

    @Override
    public int[] retriveData() {
        return new int[] {11,22,33,44,55};
    }
}
