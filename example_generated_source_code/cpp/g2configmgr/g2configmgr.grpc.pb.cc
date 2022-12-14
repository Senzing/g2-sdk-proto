// Generated by the gRPC C++ plugin.
// If you make any local change, they will be lost.
// source: g2configmgr.proto

#include "g2configmgr.pb.h"
#include "g2configmgr.grpc.pb.h"

#include <functional>
#include <grpcpp/impl/codegen/async_stream.h>
#include <grpcpp/impl/codegen/async_unary_call.h>
#include <grpcpp/impl/codegen/channel_interface.h>
#include <grpcpp/impl/codegen/client_unary_call.h>
#include <grpcpp/impl/codegen/client_callback.h>
#include <grpcpp/impl/codegen/message_allocator.h>
#include <grpcpp/impl/codegen/method_handler.h>
#include <grpcpp/impl/codegen/rpc_service_method.h>
#include <grpcpp/impl/codegen/server_callback.h>
#include <grpcpp/impl/codegen/server_callback_handlers.h>
#include <grpcpp/impl/codegen/server_context.h>
#include <grpcpp/impl/codegen/service_type.h>
#include <grpcpp/impl/codegen/sync_stream.h>
namespace g2configmgr {

static const char* G2ConfigMgr_method_names[] = {
  "/g2configmgr.G2ConfigMgr/AddConfig",
  "/g2configmgr.G2ConfigMgr/Destroy",
  "/g2configmgr.G2ConfigMgr/GetConfig",
  "/g2configmgr.G2ConfigMgr/GetConfigList",
  "/g2configmgr.G2ConfigMgr/GetDefaultConfigID",
  "/g2configmgr.G2ConfigMgr/Init",
  "/g2configmgr.G2ConfigMgr/ReplaceDefaultConfigID",
  "/g2configmgr.G2ConfigMgr/SetDefaultConfigID",
};

std::unique_ptr< G2ConfigMgr::Stub> G2ConfigMgr::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  (void)options;
  std::unique_ptr< G2ConfigMgr::Stub> stub(new G2ConfigMgr::Stub(channel, options));
  return stub;
}

G2ConfigMgr::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options)
  : channel_(channel), rpcmethod_AddConfig_(G2ConfigMgr_method_names[0], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_Destroy_(G2ConfigMgr_method_names[1], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetConfig_(G2ConfigMgr_method_names[2], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetConfigList_(G2ConfigMgr_method_names[3], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_GetDefaultConfigID_(G2ConfigMgr_method_names[4], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_Init_(G2ConfigMgr_method_names[5], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_ReplaceDefaultConfigID_(G2ConfigMgr_method_names[6], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  , rpcmethod_SetDefaultConfigID_(G2ConfigMgr_method_names[7], options.suffix_for_stats(),::grpc::internal::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status G2ConfigMgr::Stub::AddConfig(::grpc::ClientContext* context, const ::g2configmgr::AddConfigRequest& request, ::g2configmgr::AddConfigResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2configmgr::AddConfigRequest, ::g2configmgr::AddConfigResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_AddConfig_, context, request, response);
}

void G2ConfigMgr::Stub::async::AddConfig(::grpc::ClientContext* context, const ::g2configmgr::AddConfigRequest* request, ::g2configmgr::AddConfigResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2configmgr::AddConfigRequest, ::g2configmgr::AddConfigResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AddConfig_, context, request, response, std::move(f));
}

void G2ConfigMgr::Stub::async::AddConfig(::grpc::ClientContext* context, const ::g2configmgr::AddConfigRequest* request, ::g2configmgr::AddConfigResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_AddConfig_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::AddConfigResponse>* G2ConfigMgr::Stub::PrepareAsyncAddConfigRaw(::grpc::ClientContext* context, const ::g2configmgr::AddConfigRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2configmgr::AddConfigResponse, ::g2configmgr::AddConfigRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_AddConfig_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::AddConfigResponse>* G2ConfigMgr::Stub::AsyncAddConfigRaw(::grpc::ClientContext* context, const ::g2configmgr::AddConfigRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncAddConfigRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2ConfigMgr::Stub::Destroy(::grpc::ClientContext* context, const ::g2configmgr::DestroyRequest& request, ::g2configmgr::DestroyResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2configmgr::DestroyRequest, ::g2configmgr::DestroyResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_Destroy_, context, request, response);
}

void G2ConfigMgr::Stub::async::Destroy(::grpc::ClientContext* context, const ::g2configmgr::DestroyRequest* request, ::g2configmgr::DestroyResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2configmgr::DestroyRequest, ::g2configmgr::DestroyResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Destroy_, context, request, response, std::move(f));
}

void G2ConfigMgr::Stub::async::Destroy(::grpc::ClientContext* context, const ::g2configmgr::DestroyRequest* request, ::g2configmgr::DestroyResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Destroy_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::DestroyResponse>* G2ConfigMgr::Stub::PrepareAsyncDestroyRaw(::grpc::ClientContext* context, const ::g2configmgr::DestroyRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2configmgr::DestroyResponse, ::g2configmgr::DestroyRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_Destroy_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::DestroyResponse>* G2ConfigMgr::Stub::AsyncDestroyRaw(::grpc::ClientContext* context, const ::g2configmgr::DestroyRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncDestroyRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2ConfigMgr::Stub::GetConfig(::grpc::ClientContext* context, const ::g2configmgr::GetConfigRequest& request, ::g2configmgr::GetConfigResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2configmgr::GetConfigRequest, ::g2configmgr::GetConfigResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetConfig_, context, request, response);
}

void G2ConfigMgr::Stub::async::GetConfig(::grpc::ClientContext* context, const ::g2configmgr::GetConfigRequest* request, ::g2configmgr::GetConfigResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2configmgr::GetConfigRequest, ::g2configmgr::GetConfigResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetConfig_, context, request, response, std::move(f));
}

void G2ConfigMgr::Stub::async::GetConfig(::grpc::ClientContext* context, const ::g2configmgr::GetConfigRequest* request, ::g2configmgr::GetConfigResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetConfig_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::GetConfigResponse>* G2ConfigMgr::Stub::PrepareAsyncGetConfigRaw(::grpc::ClientContext* context, const ::g2configmgr::GetConfigRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2configmgr::GetConfigResponse, ::g2configmgr::GetConfigRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetConfig_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::GetConfigResponse>* G2ConfigMgr::Stub::AsyncGetConfigRaw(::grpc::ClientContext* context, const ::g2configmgr::GetConfigRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetConfigRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2ConfigMgr::Stub::GetConfigList(::grpc::ClientContext* context, const ::g2configmgr::GetConfigListRequest& request, ::g2configmgr::GetConfigListResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2configmgr::GetConfigListRequest, ::g2configmgr::GetConfigListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetConfigList_, context, request, response);
}

void G2ConfigMgr::Stub::async::GetConfigList(::grpc::ClientContext* context, const ::g2configmgr::GetConfigListRequest* request, ::g2configmgr::GetConfigListResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2configmgr::GetConfigListRequest, ::g2configmgr::GetConfigListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetConfigList_, context, request, response, std::move(f));
}

void G2ConfigMgr::Stub::async::GetConfigList(::grpc::ClientContext* context, const ::g2configmgr::GetConfigListRequest* request, ::g2configmgr::GetConfigListResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetConfigList_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::GetConfigListResponse>* G2ConfigMgr::Stub::PrepareAsyncGetConfigListRaw(::grpc::ClientContext* context, const ::g2configmgr::GetConfigListRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2configmgr::GetConfigListResponse, ::g2configmgr::GetConfigListRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetConfigList_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::GetConfigListResponse>* G2ConfigMgr::Stub::AsyncGetConfigListRaw(::grpc::ClientContext* context, const ::g2configmgr::GetConfigListRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetConfigListRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2ConfigMgr::Stub::GetDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::GetDefaultConfigIDRequest& request, ::g2configmgr::GetDefaultConfigIDResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2configmgr::GetDefaultConfigIDRequest, ::g2configmgr::GetDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_GetDefaultConfigID_, context, request, response);
}

void G2ConfigMgr::Stub::async::GetDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::GetDefaultConfigIDRequest* request, ::g2configmgr::GetDefaultConfigIDResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2configmgr::GetDefaultConfigIDRequest, ::g2configmgr::GetDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetDefaultConfigID_, context, request, response, std::move(f));
}

void G2ConfigMgr::Stub::async::GetDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::GetDefaultConfigIDRequest* request, ::g2configmgr::GetDefaultConfigIDResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_GetDefaultConfigID_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::GetDefaultConfigIDResponse>* G2ConfigMgr::Stub::PrepareAsyncGetDefaultConfigIDRaw(::grpc::ClientContext* context, const ::g2configmgr::GetDefaultConfigIDRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2configmgr::GetDefaultConfigIDResponse, ::g2configmgr::GetDefaultConfigIDRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_GetDefaultConfigID_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::GetDefaultConfigIDResponse>* G2ConfigMgr::Stub::AsyncGetDefaultConfigIDRaw(::grpc::ClientContext* context, const ::g2configmgr::GetDefaultConfigIDRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncGetDefaultConfigIDRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2ConfigMgr::Stub::Init(::grpc::ClientContext* context, const ::g2configmgr::InitRequest& request, ::g2configmgr::InitResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2configmgr::InitRequest, ::g2configmgr::InitResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_Init_, context, request, response);
}

void G2ConfigMgr::Stub::async::Init(::grpc::ClientContext* context, const ::g2configmgr::InitRequest* request, ::g2configmgr::InitResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2configmgr::InitRequest, ::g2configmgr::InitResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Init_, context, request, response, std::move(f));
}

void G2ConfigMgr::Stub::async::Init(::grpc::ClientContext* context, const ::g2configmgr::InitRequest* request, ::g2configmgr::InitResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_Init_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::InitResponse>* G2ConfigMgr::Stub::PrepareAsyncInitRaw(::grpc::ClientContext* context, const ::g2configmgr::InitRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2configmgr::InitResponse, ::g2configmgr::InitRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_Init_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::InitResponse>* G2ConfigMgr::Stub::AsyncInitRaw(::grpc::ClientContext* context, const ::g2configmgr::InitRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncInitRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2ConfigMgr::Stub::ReplaceDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::ReplaceDefaultConfigIDRequest& request, ::g2configmgr::ReplaceDefaultConfigIDResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2configmgr::ReplaceDefaultConfigIDRequest, ::g2configmgr::ReplaceDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_ReplaceDefaultConfigID_, context, request, response);
}

void G2ConfigMgr::Stub::async::ReplaceDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::ReplaceDefaultConfigIDRequest* request, ::g2configmgr::ReplaceDefaultConfigIDResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2configmgr::ReplaceDefaultConfigIDRequest, ::g2configmgr::ReplaceDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ReplaceDefaultConfigID_, context, request, response, std::move(f));
}

void G2ConfigMgr::Stub::async::ReplaceDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::ReplaceDefaultConfigIDRequest* request, ::g2configmgr::ReplaceDefaultConfigIDResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_ReplaceDefaultConfigID_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::ReplaceDefaultConfigIDResponse>* G2ConfigMgr::Stub::PrepareAsyncReplaceDefaultConfigIDRaw(::grpc::ClientContext* context, const ::g2configmgr::ReplaceDefaultConfigIDRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2configmgr::ReplaceDefaultConfigIDResponse, ::g2configmgr::ReplaceDefaultConfigIDRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_ReplaceDefaultConfigID_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::ReplaceDefaultConfigIDResponse>* G2ConfigMgr::Stub::AsyncReplaceDefaultConfigIDRaw(::grpc::ClientContext* context, const ::g2configmgr::ReplaceDefaultConfigIDRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncReplaceDefaultConfigIDRaw(context, request, cq);
  result->StartCall();
  return result;
}

::grpc::Status G2ConfigMgr::Stub::SetDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::SetDefaultConfigIDRequest& request, ::g2configmgr::SetDefaultConfigIDResponse* response) {
  return ::grpc::internal::BlockingUnaryCall< ::g2configmgr::SetDefaultConfigIDRequest, ::g2configmgr::SetDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), rpcmethod_SetDefaultConfigID_, context, request, response);
}

void G2ConfigMgr::Stub::async::SetDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::SetDefaultConfigIDRequest* request, ::g2configmgr::SetDefaultConfigIDResponse* response, std::function<void(::grpc::Status)> f) {
  ::grpc::internal::CallbackUnaryCall< ::g2configmgr::SetDefaultConfigIDRequest, ::g2configmgr::SetDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_SetDefaultConfigID_, context, request, response, std::move(f));
}

void G2ConfigMgr::Stub::async::SetDefaultConfigID(::grpc::ClientContext* context, const ::g2configmgr::SetDefaultConfigIDRequest* request, ::g2configmgr::SetDefaultConfigIDResponse* response, ::grpc::ClientUnaryReactor* reactor) {
  ::grpc::internal::ClientCallbackUnaryFactory::Create< ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(stub_->channel_.get(), stub_->rpcmethod_SetDefaultConfigID_, context, request, response, reactor);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::SetDefaultConfigIDResponse>* G2ConfigMgr::Stub::PrepareAsyncSetDefaultConfigIDRaw(::grpc::ClientContext* context, const ::g2configmgr::SetDefaultConfigIDRequest& request, ::grpc::CompletionQueue* cq) {
  return ::grpc::internal::ClientAsyncResponseReaderHelper::Create< ::g2configmgr::SetDefaultConfigIDResponse, ::g2configmgr::SetDefaultConfigIDRequest, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(channel_.get(), cq, rpcmethod_SetDefaultConfigID_, context, request);
}

::grpc::ClientAsyncResponseReader< ::g2configmgr::SetDefaultConfigIDResponse>* G2ConfigMgr::Stub::AsyncSetDefaultConfigIDRaw(::grpc::ClientContext* context, const ::g2configmgr::SetDefaultConfigIDRequest& request, ::grpc::CompletionQueue* cq) {
  auto* result =
    this->PrepareAsyncSetDefaultConfigIDRaw(context, request, cq);
  result->StartCall();
  return result;
}

G2ConfigMgr::Service::Service() {
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2ConfigMgr_method_names[0],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2ConfigMgr::Service, ::g2configmgr::AddConfigRequest, ::g2configmgr::AddConfigResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2ConfigMgr::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2configmgr::AddConfigRequest* req,
             ::g2configmgr::AddConfigResponse* resp) {
               return service->AddConfig(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2ConfigMgr_method_names[1],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2ConfigMgr::Service, ::g2configmgr::DestroyRequest, ::g2configmgr::DestroyResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2ConfigMgr::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2configmgr::DestroyRequest* req,
             ::g2configmgr::DestroyResponse* resp) {
               return service->Destroy(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2ConfigMgr_method_names[2],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2ConfigMgr::Service, ::g2configmgr::GetConfigRequest, ::g2configmgr::GetConfigResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2ConfigMgr::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2configmgr::GetConfigRequest* req,
             ::g2configmgr::GetConfigResponse* resp) {
               return service->GetConfig(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2ConfigMgr_method_names[3],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2ConfigMgr::Service, ::g2configmgr::GetConfigListRequest, ::g2configmgr::GetConfigListResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2ConfigMgr::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2configmgr::GetConfigListRequest* req,
             ::g2configmgr::GetConfigListResponse* resp) {
               return service->GetConfigList(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2ConfigMgr_method_names[4],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2ConfigMgr::Service, ::g2configmgr::GetDefaultConfigIDRequest, ::g2configmgr::GetDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2ConfigMgr::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2configmgr::GetDefaultConfigIDRequest* req,
             ::g2configmgr::GetDefaultConfigIDResponse* resp) {
               return service->GetDefaultConfigID(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2ConfigMgr_method_names[5],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2ConfigMgr::Service, ::g2configmgr::InitRequest, ::g2configmgr::InitResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2ConfigMgr::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2configmgr::InitRequest* req,
             ::g2configmgr::InitResponse* resp) {
               return service->Init(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2ConfigMgr_method_names[6],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2ConfigMgr::Service, ::g2configmgr::ReplaceDefaultConfigIDRequest, ::g2configmgr::ReplaceDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2ConfigMgr::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2configmgr::ReplaceDefaultConfigIDRequest* req,
             ::g2configmgr::ReplaceDefaultConfigIDResponse* resp) {
               return service->ReplaceDefaultConfigID(ctx, req, resp);
             }, this)));
  AddMethod(new ::grpc::internal::RpcServiceMethod(
      G2ConfigMgr_method_names[7],
      ::grpc::internal::RpcMethod::NORMAL_RPC,
      new ::grpc::internal::RpcMethodHandler< G2ConfigMgr::Service, ::g2configmgr::SetDefaultConfigIDRequest, ::g2configmgr::SetDefaultConfigIDResponse, ::grpc::protobuf::MessageLite, ::grpc::protobuf::MessageLite>(
          [](G2ConfigMgr::Service* service,
             ::grpc::ServerContext* ctx,
             const ::g2configmgr::SetDefaultConfigIDRequest* req,
             ::g2configmgr::SetDefaultConfigIDResponse* resp) {
               return service->SetDefaultConfigID(ctx, req, resp);
             }, this)));
}

G2ConfigMgr::Service::~Service() {
}

::grpc::Status G2ConfigMgr::Service::AddConfig(::grpc::ServerContext* context, const ::g2configmgr::AddConfigRequest* request, ::g2configmgr::AddConfigResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2ConfigMgr::Service::Destroy(::grpc::ServerContext* context, const ::g2configmgr::DestroyRequest* request, ::g2configmgr::DestroyResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2ConfigMgr::Service::GetConfig(::grpc::ServerContext* context, const ::g2configmgr::GetConfigRequest* request, ::g2configmgr::GetConfigResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2ConfigMgr::Service::GetConfigList(::grpc::ServerContext* context, const ::g2configmgr::GetConfigListRequest* request, ::g2configmgr::GetConfigListResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2ConfigMgr::Service::GetDefaultConfigID(::grpc::ServerContext* context, const ::g2configmgr::GetDefaultConfigIDRequest* request, ::g2configmgr::GetDefaultConfigIDResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2ConfigMgr::Service::Init(::grpc::ServerContext* context, const ::g2configmgr::InitRequest* request, ::g2configmgr::InitResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2ConfigMgr::Service::ReplaceDefaultConfigID(::grpc::ServerContext* context, const ::g2configmgr::ReplaceDefaultConfigIDRequest* request, ::g2configmgr::ReplaceDefaultConfigIDResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

::grpc::Status G2ConfigMgr::Service::SetDefaultConfigID(::grpc::ServerContext* context, const ::g2configmgr::SetDefaultConfigIDRequest* request, ::g2configmgr::SetDefaultConfigIDResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}


}  // namespace g2configmgr

