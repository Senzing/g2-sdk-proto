# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: g2configmgr.proto for package 'g2configmgr'

require 'grpc'
require 'g2configmgr_pb'

module G2configmgr
  module G2ConfigMgr
    class Service

      include ::GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'g2configmgr.G2ConfigMgr'

      rpc :AddConfig, ::G2configmgr::AddConfigRequest, ::G2configmgr::AddConfigResponse
      rpc :Destroy, ::G2configmgr::DestroyRequest, ::G2configmgr::DestroyResponse
      rpc :GetConfig, ::G2configmgr::GetConfigRequest, ::G2configmgr::GetConfigResponse
      rpc :GetConfigList, ::G2configmgr::GetConfigListRequest, ::G2configmgr::GetConfigListResponse
      rpc :GetDefaultConfigID, ::G2configmgr::GetDefaultConfigIDRequest, ::G2configmgr::GetDefaultConfigIDResponse
      rpc :Init, ::G2configmgr::InitRequest, ::G2configmgr::InitResponse
      rpc :ReplaceDefaultConfigID, ::G2configmgr::ReplaceDefaultConfigIDRequest, ::G2configmgr::ReplaceDefaultConfigIDResponse
      rpc :SetDefaultConfigID, ::G2configmgr::SetDefaultConfigIDRequest, ::G2configmgr::SetDefaultConfigIDResponse
    end

    Stub = Service.rpc_stub_class
  end
end
