package com.cn.thrift;

import com.cn.thrift.user.UserService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zxoho
 * @date 19-1-28 上午11:06
 */
@Component
public class UserServiceProvider {

    @Value("${thrift.ip}")
    private String serverIp;

    @Value("${thrift.port}")
    private int serverPort;

    public UserService.Client getUserService() {
        TSocket socket = new TSocket(serverIp, serverPort, 50000);
        TTransport transport = new TFramedTransport(socket);
        try {
            transport.open();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        TProtocol protocol = new TBinaryProtocol(transport);
        UserService.Client client = new UserService.Client(protocol);

        return client;
    }
}
