package com.litecode.learnspringframework.examples.c1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySqlDataService implements DataService {

    @Override
    public int[] retriveData() {
        return new int[] {1,2,3,4,5};
    }
}
