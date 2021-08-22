package com.cunxu.rpc.codec;

/**
 * 序列化
 */
public interface Encoder {
    byte[] encode(Object obj);
}
