package com.model;

import com.model.verify.ComplexVerify;
import com.model.verify.SimpleVerify;

public class Verify {
    public static void main(String[] args) {

        SimpleVerify simpleVerify = new SimpleVerify() {
            @Override
            public boolean verify(String cert, String session) {
                return true;
            }
        };
        // lambda equivalent
        SimpleVerify simpleVerify1 = (String cert, String session) -> true;

        // notice because this is a complex structure no intelliJ IDE intellisense for lambda equivalent
        ComplexVerify complexVerify = new ComplexVerify() {
            @Override
            public boolean verify(String cert, String session) {
                return true;
            }

            @Override
            public boolean connect(String credentials) {
                return false;
            }
        };
    }
}
