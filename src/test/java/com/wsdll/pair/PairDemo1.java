package com.wsdll.pair;

import javafx.util.Pair;
import org.junit.Test;

/**
 * @description:
 * @author: WH
 * @create: 2018-11-12 17:44
 **/
public class PairDemo1 {

    @Test
    public void demo () {
        Pair<String, String> pair = new Pair<>("1", "2");
        System.out.println(pair);
        System.out.println(pair.toString());
    }
}
