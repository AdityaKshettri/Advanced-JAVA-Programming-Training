package com.aditya.project.training.day2.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

public class NioDemo {

    private static final String FILE_IN_PATH = "D:\\Projects\\SpringBoot\\training\\src\\com\\aditya\\project\\training\\day2\\nio\\testing-in.txt";
    private static final String FILE_OUT_PATH = "D:\\Projects\\SpringBoot\\training\\src\\com\\aditya\\project\\training\\day2\\nio\\testing-out.txt";

    public static void main(String[] args) throws IOException {

        FileInputStream input = new FileInputStream(FILE_IN_PATH); // Path of Input text
        ReadableByteChannel source = input.getChannel();

        FileOutputStream output = new FileOutputStream(FILE_OUT_PATH); // Path of Output
        WritableByteChannel destination = output.getChannel();

        copyData(source, destination);

        source.close();
        destination.close();
    }

    private static void copyData(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocateDirect(20 * 1024);
        while (src.read(buffer) != -1) {
            // The buffer is used to drained
            buffer.flip();
            // keep sure that buffer was fully drained
            while (buffer.hasRemaining()) {
                dest.write(buffer);
            }
            buffer.clear(); // Now the buffer is empty, ready for the filling
        }
    }
}

