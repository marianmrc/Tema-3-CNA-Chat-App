package proto.log;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: LogService.proto")
public final class LogServiceGrpc {

  private LogServiceGrpc() {}

  public static final String SERVICE_NAME = "LogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.log.LogServiceOuterClass.UserState,
      proto.log.LogServiceOuterClass.UserState> getLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "log",
      requestType = proto.log.LogServiceOuterClass.UserState.class,
      responseType = proto.log.LogServiceOuterClass.UserState.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<proto.log.LogServiceOuterClass.UserState,
      proto.log.LogServiceOuterClass.UserState> getLogMethod() {
    io.grpc.MethodDescriptor<proto.log.LogServiceOuterClass.UserState, proto.log.LogServiceOuterClass.UserState> getLogMethod;
    if ((getLogMethod = LogServiceGrpc.getLogMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getLogMethod = LogServiceGrpc.getLogMethod) == null) {
          LogServiceGrpc.getLogMethod = getLogMethod = 
              io.grpc.MethodDescriptor.<proto.log.LogServiceOuterClass.UserState, proto.log.LogServiceOuterClass.UserState>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "LogService", "log"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.log.LogServiceOuterClass.UserState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.log.LogServiceOuterClass.UserState.getDefaultInstance()))
                  .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("log"))
                  .build();
          }
        }
     }
     return getLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.log.LogServiceOuterClass.UserRequest,
      proto.log.LogServiceOuterClass.LoggedUsers> getGetLoggedUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLoggedUsers",
      requestType = proto.log.LogServiceOuterClass.UserRequest.class,
      responseType = proto.log.LogServiceOuterClass.LoggedUsers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.log.LogServiceOuterClass.UserRequest,
      proto.log.LogServiceOuterClass.LoggedUsers> getGetLoggedUsersMethod() {
    io.grpc.MethodDescriptor<proto.log.LogServiceOuterClass.UserRequest, proto.log.LogServiceOuterClass.LoggedUsers> getGetLoggedUsersMethod;
    if ((getGetLoggedUsersMethod = LogServiceGrpc.getGetLoggedUsersMethod) == null) {
      synchronized (LogServiceGrpc.class) {
        if ((getGetLoggedUsersMethod = LogServiceGrpc.getGetLoggedUsersMethod) == null) {
          LogServiceGrpc.getGetLoggedUsersMethod = getGetLoggedUsersMethod = 
              io.grpc.MethodDescriptor.<proto.log.LogServiceOuterClass.UserRequest, proto.log.LogServiceOuterClass.LoggedUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LogService", "getLoggedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.log.LogServiceOuterClass.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.log.LogServiceOuterClass.LoggedUsers.getDefaultInstance()))
                  .setSchemaDescriptor(new LogServiceMethodDescriptorSupplier("getLoggedUsers"))
                  .build();
          }
        }
     }
     return getGetLoggedUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogServiceStub newStub(io.grpc.Channel channel) {
    return new LogServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LogServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LogServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<proto.log.LogServiceOuterClass.UserState> log(
        io.grpc.stub.StreamObserver<proto.log.LogServiceOuterClass.UserState> responseObserver) {
      return asyncUnimplementedStreamingCall(getLogMethod(), responseObserver);
    }

    /**
     */
    public void getLoggedUsers(proto.log.LogServiceOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<proto.log.LogServiceOuterClass.LoggedUsers> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLoggedUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLogMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                proto.log.LogServiceOuterClass.UserState,
                proto.log.LogServiceOuterClass.UserState>(
                  this, METHODID_LOG)))
          .addMethod(
            getGetLoggedUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.log.LogServiceOuterClass.UserRequest,
                proto.log.LogServiceOuterClass.LoggedUsers>(
                  this, METHODID_GET_LOGGED_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class LogServiceStub extends io.grpc.stub.AbstractStub<LogServiceStub> {
    private LogServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<proto.log.LogServiceOuterClass.UserState> log(
        io.grpc.stub.StreamObserver<proto.log.LogServiceOuterClass.UserState> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getLogMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getLoggedUsers(proto.log.LogServiceOuterClass.UserRequest request,
        io.grpc.stub.StreamObserver<proto.log.LogServiceOuterClass.LoggedUsers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLoggedUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LogServiceBlockingStub extends io.grpc.stub.AbstractStub<LogServiceBlockingStub> {
    private LogServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.log.LogServiceOuterClass.LoggedUsers getLoggedUsers(proto.log.LogServiceOuterClass.UserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetLoggedUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LogServiceFutureStub extends io.grpc.stub.AbstractStub<LogServiceFutureStub> {
    private LogServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LogServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.log.LogServiceOuterClass.LoggedUsers> getLoggedUsers(
        proto.log.LogServiceOuterClass.UserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLoggedUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_LOGGED_USERS = 0;
  private static final int METHODID_LOG = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_LOGGED_USERS:
          serviceImpl.getLoggedUsers((proto.log.LogServiceOuterClass.UserRequest) request,
              (io.grpc.stub.StreamObserver<proto.log.LogServiceOuterClass.LoggedUsers>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOG:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.log(
              (io.grpc.stub.StreamObserver<proto.log.LogServiceOuterClass.UserState>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.log.LogServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogService");
    }
  }

  private static final class LogServiceFileDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier {
    LogServiceFileDescriptorSupplier() {}
  }

  private static final class LogServiceMethodDescriptorSupplier
      extends LogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogServiceFileDescriptorSupplier())
              .addMethod(getLogMethod())
              .addMethod(getGetLoggedUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
