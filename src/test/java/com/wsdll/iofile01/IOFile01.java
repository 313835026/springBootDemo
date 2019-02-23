package com.wsdll.iofile01;

import java.io.File;
import java.io.IOException;

public class IOFile01 {

    public static void main(String[] args) throws IOException {
        // File.mkdir()
        // 当不存在构造方法里的目录，则创建并返回true
        // 当存在这个目录则不创建，并返回false
        // 当创建多级目录，但这个目录中间级别不存在则无法创建，并返回false
        File file1 = new File("e:\\io");
        System.out.println("file1.mkdir():" + file1.mkdir());

        // File的另一个构造方法
        // 并且File.mkdirs可以创建多级目录
        File file2 = new File(file1,"file2\\aa\\bb\\cc");
        System.out.println("file2.mkdir:" + file2.mkdirs());

        // 这只是创建目录
        File file3 = new File(file1, "a.txt");
        System.out.println("file3.mkdirs():" + file3.mkdirs());

        // 这个可以创建文件，但试验发现，不能创建和文件夹重名的文件
        File file4 = new File(file1,"b.txt");
        System.out.println("file4.createNewFile():" + file4.createNewFile());
    }
}
