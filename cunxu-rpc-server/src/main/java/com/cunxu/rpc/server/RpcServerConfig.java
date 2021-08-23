package com.cunxu.rpc.server;

import com.cunxu.rpc.codec.Decoder;
import com.cunxu.rpc.codec.Encoder;
import com.cunxu.rpc.codec.JSONDecoder;
import com.cunxu.rpc.codec.JSONEncoder;
import com.cunxu.rpc.transport.HTTPTransportServer;
import com.cunxu.rpc.transport.TransportServer;
import lombok.Data;

/**
 * server配置
 */
@Data
public class RpcServerConfig {
    private Class<? extends TransportServer> transportClass = HTTPTransportServer.class;
    private Class<? extends Encoder> encoderClass = JSONEncoder.class;
    private Class<? extends Decoder> decoderClass = JSONDecoder.class;
    private int port = 3000;
}
