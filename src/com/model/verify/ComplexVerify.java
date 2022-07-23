package com.model.verify;

public interface ComplexVerify {
    boolean verify(String cert, String session);
    boolean connect(String credentials);
}
