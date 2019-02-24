package com.wsdll.iofile01;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class IOFile01 {

    //region 创建文件和文件夹
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
    //endregion

    //region 先创建再删除
    @Test
    public void method2() throws IOException {
        File file1 = new File("c.txt");
        System.out.println("file1.createNewFile():" + file1.createNewFile());
        // 可删除文件和文件夹，并不走回收站
        // 如果删除的文件夹里面有东西，则需要先删除里面的东西，才能删除外面的文件夹
        System.out.println("file1.delete():" + file1.delete());

    }
    //endregion

    //region 测试绝对路径和相对路径
    @Test
    public void method3() throws IOException {
        File file1 = new File("e:\\a.txt");
        System.out.println("创建e:\\a.txt:" + file1.createNewFile());
        System.out.println("获取e:\\a.txt绝对路径:" + file1.getAbsolutePath());
        // 貌似没有相对路径，就打印绝对路径
        System.out.println("获取e:\\a.txt相对路径:" + file1.getPath());

        System.out.println("----------------");

        File file2 = new File("b.txt");
        System.out.println("创建项目根目录b.txt:" + file2.createNewFile());
        System.out.println("获取项目根目录b.txt绝对路径:" + file2.getAbsolutePath());
        System.out.println("获取项目根目录b.txt相对路径:" + file2.getPath());

    }
    //endregion
}
