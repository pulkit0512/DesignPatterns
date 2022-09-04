package com.decorator.pattern.encode_compress;

public interface DataSource {

    void writeData(String data);
    String readData();
}
