package com.cunxu.rpc.transport;

import com.cunxu.rpc.Peer;

import java.io.InputStream;

public interface TransportClient {
    void connect(Peer peer);

    InputStream write(InputStream data);

    void close();
}
