// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.1
// source: g2hasher.proto

package g2hasher

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// G2DiagnosticClient is the client API for G2Diagnostic service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type G2DiagnosticClient interface {
	ClearLastException(ctx context.Context, in *ClearLastExceptionRequest, opts ...grpc.CallOption) (*ClearLastExceptionResponse, error)
	Destroy(ctx context.Context, in *DestroyRequest, opts ...grpc.CallOption) (*DestroyResponse, error)
	ExportTokenLibrary(ctx context.Context, in *ExportTokenLibraryRequest, opts ...grpc.CallOption) (*ExportTokenLibraryResponse, error)
	GetLastException(ctx context.Context, in *GetLastExceptionRequest, opts ...grpc.CallOption) (*GetLastExceptionResponse, error)
	GetLastExceptionCode(ctx context.Context, in *GetLastExceptionCodeRequest, opts ...grpc.CallOption) (*GetLastExceptionCodeResponse, error)
	Init(ctx context.Context, in *InitRequest, opts ...grpc.CallOption) (*InitResponse, error)
	InitWithConfig(ctx context.Context, in *InitWithConfigRequest, opts ...grpc.CallOption) (*InitWithConfigResponse, error)
	Process(ctx context.Context, in *ProcessRequest, opts ...grpc.CallOption) (*ProcessResponse, error)
}

type g2DiagnosticClient struct {
	cc grpc.ClientConnInterface
}

func NewG2DiagnosticClient(cc grpc.ClientConnInterface) G2DiagnosticClient {
	return &g2DiagnosticClient{cc}
}

func (c *g2DiagnosticClient) ClearLastException(ctx context.Context, in *ClearLastExceptionRequest, opts ...grpc.CallOption) (*ClearLastExceptionResponse, error) {
	out := new(ClearLastExceptionResponse)
	err := c.cc.Invoke(ctx, "/g2hasher.G2Diagnostic/ClearLastException", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *g2DiagnosticClient) Destroy(ctx context.Context, in *DestroyRequest, opts ...grpc.CallOption) (*DestroyResponse, error) {
	out := new(DestroyResponse)
	err := c.cc.Invoke(ctx, "/g2hasher.G2Diagnostic/Destroy", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *g2DiagnosticClient) ExportTokenLibrary(ctx context.Context, in *ExportTokenLibraryRequest, opts ...grpc.CallOption) (*ExportTokenLibraryResponse, error) {
	out := new(ExportTokenLibraryResponse)
	err := c.cc.Invoke(ctx, "/g2hasher.G2Diagnostic/ExportTokenLibrary", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *g2DiagnosticClient) GetLastException(ctx context.Context, in *GetLastExceptionRequest, opts ...grpc.CallOption) (*GetLastExceptionResponse, error) {
	out := new(GetLastExceptionResponse)
	err := c.cc.Invoke(ctx, "/g2hasher.G2Diagnostic/GetLastException", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *g2DiagnosticClient) GetLastExceptionCode(ctx context.Context, in *GetLastExceptionCodeRequest, opts ...grpc.CallOption) (*GetLastExceptionCodeResponse, error) {
	out := new(GetLastExceptionCodeResponse)
	err := c.cc.Invoke(ctx, "/g2hasher.G2Diagnostic/GetLastExceptionCode", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *g2DiagnosticClient) Init(ctx context.Context, in *InitRequest, opts ...grpc.CallOption) (*InitResponse, error) {
	out := new(InitResponse)
	err := c.cc.Invoke(ctx, "/g2hasher.G2Diagnostic/Init", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *g2DiagnosticClient) InitWithConfig(ctx context.Context, in *InitWithConfigRequest, opts ...grpc.CallOption) (*InitWithConfigResponse, error) {
	out := new(InitWithConfigResponse)
	err := c.cc.Invoke(ctx, "/g2hasher.G2Diagnostic/InitWithConfig", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *g2DiagnosticClient) Process(ctx context.Context, in *ProcessRequest, opts ...grpc.CallOption) (*ProcessResponse, error) {
	out := new(ProcessResponse)
	err := c.cc.Invoke(ctx, "/g2hasher.G2Diagnostic/Process", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// G2DiagnosticServer is the server API for G2Diagnostic service.
// All implementations must embed UnimplementedG2DiagnosticServer
// for forward compatibility
type G2DiagnosticServer interface {
	ClearLastException(context.Context, *ClearLastExceptionRequest) (*ClearLastExceptionResponse, error)
	Destroy(context.Context, *DestroyRequest) (*DestroyResponse, error)
	ExportTokenLibrary(context.Context, *ExportTokenLibraryRequest) (*ExportTokenLibraryResponse, error)
	GetLastException(context.Context, *GetLastExceptionRequest) (*GetLastExceptionResponse, error)
	GetLastExceptionCode(context.Context, *GetLastExceptionCodeRequest) (*GetLastExceptionCodeResponse, error)
	Init(context.Context, *InitRequest) (*InitResponse, error)
	InitWithConfig(context.Context, *InitWithConfigRequest) (*InitWithConfigResponse, error)
	Process(context.Context, *ProcessRequest) (*ProcessResponse, error)
	mustEmbedUnimplementedG2DiagnosticServer()
}

// UnimplementedG2DiagnosticServer must be embedded to have forward compatible implementations.
type UnimplementedG2DiagnosticServer struct {
}

func (UnimplementedG2DiagnosticServer) ClearLastException(context.Context, *ClearLastExceptionRequest) (*ClearLastExceptionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ClearLastException not implemented")
}
func (UnimplementedG2DiagnosticServer) Destroy(context.Context, *DestroyRequest) (*DestroyResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Destroy not implemented")
}
func (UnimplementedG2DiagnosticServer) ExportTokenLibrary(context.Context, *ExportTokenLibraryRequest) (*ExportTokenLibraryResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ExportTokenLibrary not implemented")
}
func (UnimplementedG2DiagnosticServer) GetLastException(context.Context, *GetLastExceptionRequest) (*GetLastExceptionResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetLastException not implemented")
}
func (UnimplementedG2DiagnosticServer) GetLastExceptionCode(context.Context, *GetLastExceptionCodeRequest) (*GetLastExceptionCodeResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetLastExceptionCode not implemented")
}
func (UnimplementedG2DiagnosticServer) Init(context.Context, *InitRequest) (*InitResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Init not implemented")
}
func (UnimplementedG2DiagnosticServer) InitWithConfig(context.Context, *InitWithConfigRequest) (*InitWithConfigResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method InitWithConfig not implemented")
}
func (UnimplementedG2DiagnosticServer) Process(context.Context, *ProcessRequest) (*ProcessResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Process not implemented")
}
func (UnimplementedG2DiagnosticServer) mustEmbedUnimplementedG2DiagnosticServer() {}

// UnsafeG2DiagnosticServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to G2DiagnosticServer will
// result in compilation errors.
type UnsafeG2DiagnosticServer interface {
	mustEmbedUnimplementedG2DiagnosticServer()
}

func RegisterG2DiagnosticServer(s grpc.ServiceRegistrar, srv G2DiagnosticServer) {
	s.RegisterService(&G2Diagnostic_ServiceDesc, srv)
}

func _G2Diagnostic_ClearLastException_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ClearLastExceptionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(G2DiagnosticServer).ClearLastException(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/g2hasher.G2Diagnostic/ClearLastException",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(G2DiagnosticServer).ClearLastException(ctx, req.(*ClearLastExceptionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _G2Diagnostic_Destroy_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DestroyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(G2DiagnosticServer).Destroy(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/g2hasher.G2Diagnostic/Destroy",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(G2DiagnosticServer).Destroy(ctx, req.(*DestroyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _G2Diagnostic_ExportTokenLibrary_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ExportTokenLibraryRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(G2DiagnosticServer).ExportTokenLibrary(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/g2hasher.G2Diagnostic/ExportTokenLibrary",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(G2DiagnosticServer).ExportTokenLibrary(ctx, req.(*ExportTokenLibraryRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _G2Diagnostic_GetLastException_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetLastExceptionRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(G2DiagnosticServer).GetLastException(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/g2hasher.G2Diagnostic/GetLastException",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(G2DiagnosticServer).GetLastException(ctx, req.(*GetLastExceptionRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _G2Diagnostic_GetLastExceptionCode_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetLastExceptionCodeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(G2DiagnosticServer).GetLastExceptionCode(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/g2hasher.G2Diagnostic/GetLastExceptionCode",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(G2DiagnosticServer).GetLastExceptionCode(ctx, req.(*GetLastExceptionCodeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _G2Diagnostic_Init_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(InitRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(G2DiagnosticServer).Init(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/g2hasher.G2Diagnostic/Init",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(G2DiagnosticServer).Init(ctx, req.(*InitRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _G2Diagnostic_InitWithConfig_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(InitWithConfigRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(G2DiagnosticServer).InitWithConfig(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/g2hasher.G2Diagnostic/InitWithConfig",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(G2DiagnosticServer).InitWithConfig(ctx, req.(*InitWithConfigRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _G2Diagnostic_Process_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ProcessRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(G2DiagnosticServer).Process(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/g2hasher.G2Diagnostic/Process",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(G2DiagnosticServer).Process(ctx, req.(*ProcessRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// G2Diagnostic_ServiceDesc is the grpc.ServiceDesc for G2Diagnostic service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var G2Diagnostic_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "g2hasher.G2Diagnostic",
	HandlerType: (*G2DiagnosticServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ClearLastException",
			Handler:    _G2Diagnostic_ClearLastException_Handler,
		},
		{
			MethodName: "Destroy",
			Handler:    _G2Diagnostic_Destroy_Handler,
		},
		{
			MethodName: "ExportTokenLibrary",
			Handler:    _G2Diagnostic_ExportTokenLibrary_Handler,
		},
		{
			MethodName: "GetLastException",
			Handler:    _G2Diagnostic_GetLastException_Handler,
		},
		{
			MethodName: "GetLastExceptionCode",
			Handler:    _G2Diagnostic_GetLastExceptionCode_Handler,
		},
		{
			MethodName: "Init",
			Handler:    _G2Diagnostic_Init_Handler,
		},
		{
			MethodName: "InitWithConfig",
			Handler:    _G2Diagnostic_InitWithConfig_Handler,
		},
		{
			MethodName: "Process",
			Handler:    _G2Diagnostic_Process_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "g2hasher.proto",
}
