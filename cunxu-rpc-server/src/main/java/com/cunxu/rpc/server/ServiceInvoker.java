package com.cunxu.rpc.server;

import com.cunxu.rpc.Request;
import com.cunxu.rpc.common.utils.ReflectionUtils;

/**
 *调用具体服务
 */
public class ServiceInvoker {
    public Object invoke(ServiceInstance service, Request request) {
        return ReflectionUtils.invoke(
                service.getObject(),
                service.getMethod(),
                request.getParameters()
        );
    }
}
