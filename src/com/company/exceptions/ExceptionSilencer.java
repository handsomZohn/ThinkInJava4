package com.company.exceptions;

/**
 * Created by zhang on 2018/3/4.
 */
public class ExceptionSilencer {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } finally {
            return;
        }
    }
}
