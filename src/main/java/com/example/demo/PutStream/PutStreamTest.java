package com.example.demo.PutStream;

import java.io.*;

/**
 * 输入输出流
 *
 * @author ROG
 * @create 2017-10-17-17:13
 */
public class PutStreamTest {

    public static void main(String[] args) throws IOException{
        outPutStream();
    }

    public static  void outPutStream() throws IOException{
        OutputStream outputStream = new FileOutputStream("D:\\test.txt");

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String str = "你好吗？ \r\n 天气好吗？";
        bufferedWriter.write(str);

        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
