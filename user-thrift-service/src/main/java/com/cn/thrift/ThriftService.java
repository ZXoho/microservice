package com.cn.thrift;

import com.cn.service.impl.RoleServiceImpl;
import com.cn.service.impl.UserServiceImpl;
import com.cn.thrift.role.RoleService;
import com.cn.thrift.user.UserService;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TServerSocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * @author zxoho
 * @date 19-1-27 下午4:21
 */

@Configuration
public class ThriftService {

    @Value("${service.port}")
    private int servicePort;

//    @Autowired
//    private UserService.Iface userService;
//    @Autowired
//    private RoleService.Iface roleService;
//
//    @PostConstruct
//    public void startThriftServer() {
//        TProcessor processor = new UserService.Processor<>(userService);
//        TNonblockingServerSocket socket = null;
//        try {
//            socket = new TNonblockingServerSocket(servicePort);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        TNonblockingServer.Args args = new TNonblockingServer.Args(socket);
//        args.processor(processor);
//        args.transportFactory(new TFramedTransport.Factory());
//        args.protocolFactory(new TBinaryProtocol.Factory());
//
//        TServer server = new TNonblockingServer(args);
//        server.serve();
//    }

    @PostConstruct
    public void startThriftServer() {
        try {
            TServerSocket serverSocket = new TServerSocket(servicePort);
            TBinaryProtocol.Factory protocolFactory = new TBinaryProtocol.Factory();
            //创建多个服务processor
            UserService.Processor<UserService.Iface> userProcessor = new UserService.Processor<UserService.Iface>(new UserServiceImpl());
            RoleService.Processor<RoleService.Iface> roleProcessor = new RoleService.Processor<RoleService.Iface>(new RoleServiceImpl());

            //注册服务
            TMultiplexedProcessor processors = new TMultiplexedProcessor();
            processors.registerProcessor("userService", userProcessor);
            processors.registerProcessor("roleService", roleProcessor);

            TThreadPoolServer.Args args = new TThreadPoolServer.Args(serverSocket)
                    .protocolFactory(protocolFactory)
                    .processor(processors)
                    .minWorkerThreads(1000)
                    .maxWorkerThreads(1000);
            TServer tServer = new TThreadPoolServer(args);
            System.out.println("开启thrift服务器，端口：" + servicePort);
            tServer.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
