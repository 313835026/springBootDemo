package com.wsdll.map;

import org.junit.Test;

import java.util.*;

/**
 * HashMap集合
 */
public class HashMapDemo {

    //region Map集合基本功能
    @Test
    public void method1() {
        Map<String, String> map = new HashMap<String, String>();

        // V put(K key, V value)，如果键不存在，则返回值为(键值对的值)null。如果键存在，则返回原来键对应的值，然后将值替换成新put进去的值
        System.out.println("put:" + map.put("文章", "马伊琍"));
        System.out.println("put:" + map.put("文章", "姚笛"));
        System.out.println("map:" + map);

        map.put("邓超", "孙俪");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "昆凌");
        map.put("刘恺威", "杨幂");
        System.out.println("map:" + map);

        // V remove(Object key)，黄晓明这个键存在，remove后返回对应的值，吴秀波这个键不存在，返回null
        System.out.println("remove:" + map.remove("黄晓明"));
        System.out.println("remove:" + map.remove("吴秀波"));

        // void clear()，清空Map集合，无需演示
        System.out.println("map:" + map);

        // boolean containsKey(Object key)，K是否存在
        System.out.println("containsKey:" + map.containsKey("周杰伦"));
        System.out.println("containsKey:" + map.containsKey("周杰"));

        // boolean containsValue(Object value)，V是否存在
        System.out.println("containsValue:" + map.containsValue("昆凌"));
        System.out.println("containsValue:" + map.containsValue("周杰伦"));
        System.out.println("map:" + map);

        // boolean isEmpty()，判断Map集合是否为空
        System.out.println("isEmpty:" + map.isEmpty());

        // int size()，Map集合长度
        System.out.println("size:" + map.size());
    }
    //endregion

    //region Map集合获取
    @Test
    public void method2() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("邓超", "孙俪");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "昆凌");
        map.put("刘恺威", "杨幂");

        // V get(Object key)
        System.out.println("get:" + map.get("周杰伦"));
        System.out.println("get:" + map.get("周杰"));
        System.out.println("-----------------------------");

        // Set<K> keySet()，获取所有的键K
        Set<? extends String> set = map.keySet();
        Iterator<?> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------------");

        // Collection<V> values()，获取所有的值V
        Collection<? extends String> col = map.values();
        for(String value : col) {
            System.out.println(value);
        }
        System.out.println("-----------------------------");
    }
    //endregion

    //region Map集合的遍历
    @Test
    public void method3() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("杨康", "穆念慈");
        map.put("陈玄风", "梅超风");

        // 方式1
        System.out.println("方式1");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("-----------------------------");

        // 方式2 Set<Map.Entry<K,V>> entrySet() 键值对对象集合，里面是一个一个的键值对对象，Map.Entry<K,V>是一个键值对对象
        System.out.println("方式2:Set<Map.Entry<K,V>> entrySet()");
        Set<Map.Entry<String, String>> setMe = map.entrySet();
        for(Map.Entry<String, String> me : setMe) {
            System.out.println(me.getKey() + ":" + me.getValue());
        }

    }
    //endregion

}
