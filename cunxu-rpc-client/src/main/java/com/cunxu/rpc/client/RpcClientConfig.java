package com.cunxu.rpc.client;

import com.cunxu.rpc.Peer;
import com.cunxu.rpc.codec.Decoder;
import com.cunxu.rpc.codec.Encoder;
import com.cunxu.rpc.codec.JSONDecoder;
import com.cunxu.rpc.codec.JSONEncoder;
import com.cunxu.rpc.transport.HTTPTransportClient;
import com.cunxu.rpc.transport.TransportClient;
import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class RpcClientConfig {
    private Class<? extends TransportClient> transportClass = HTTPTransportClient.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private Class<? extends TransportSelector> selectorClass = RandomTransportSelector.class;
    private int connectCount = 1;
    private List<Peer> servers = Arrays.asList(new Peer("127.0.0.1", 3000));
}
