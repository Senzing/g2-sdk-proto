// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v3.21.6
// source: g2product.proto

package g2product

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type DestroyRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *DestroyRequest) Reset() {
	*x = DestroyRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DestroyRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DestroyRequest) ProtoMessage() {}

func (x *DestroyRequest) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DestroyRequest.ProtoReflect.Descriptor instead.
func (*DestroyRequest) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{0}
}

type DestroyResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *DestroyResponse) Reset() {
	*x = DestroyResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DestroyResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DestroyResponse) ProtoMessage() {}

func (x *DestroyResponse) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DestroyResponse.ProtoReflect.Descriptor instead.
func (*DestroyResponse) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{1}
}

type InitRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ModuleName     string `protobuf:"bytes,1,opt,name=moduleName,proto3" json:"moduleName,omitempty"`
	IniParams      string `protobuf:"bytes,2,opt,name=iniParams,proto3" json:"iniParams,omitempty"`
	VerboseLogging int32  `protobuf:"varint,3,opt,name=verboseLogging,proto3" json:"verboseLogging,omitempty"`
}

func (x *InitRequest) Reset() {
	*x = InitRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InitRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InitRequest) ProtoMessage() {}

func (x *InitRequest) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InitRequest.ProtoReflect.Descriptor instead.
func (*InitRequest) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{2}
}

func (x *InitRequest) GetModuleName() string {
	if x != nil {
		return x.ModuleName
	}
	return ""
}

func (x *InitRequest) GetIniParams() string {
	if x != nil {
		return x.IniParams
	}
	return ""
}

func (x *InitRequest) GetVerboseLogging() int32 {
	if x != nil {
		return x.VerboseLogging
	}
	return 0
}

type InitResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *InitResponse) Reset() {
	*x = InitResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *InitResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*InitResponse) ProtoMessage() {}

func (x *InitResponse) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use InitResponse.ProtoReflect.Descriptor instead.
func (*InitResponse) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{3}
}

type LicenseRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *LicenseRequest) Reset() {
	*x = LicenseRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LicenseRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LicenseRequest) ProtoMessage() {}

func (x *LicenseRequest) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LicenseRequest.ProtoReflect.Descriptor instead.
func (*LicenseRequest) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{4}
}

type LicenseResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result string `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
}

func (x *LicenseResponse) Reset() {
	*x = LicenseResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LicenseResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LicenseResponse) ProtoMessage() {}

func (x *LicenseResponse) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LicenseResponse.ProtoReflect.Descriptor instead.
func (*LicenseResponse) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{5}
}

func (x *LicenseResponse) GetResult() string {
	if x != nil {
		return x.Result
	}
	return ""
}

type ValidateLicenseFileRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	LicenseFilePath string `protobuf:"bytes,1,opt,name=licenseFilePath,proto3" json:"licenseFilePath,omitempty"`
}

func (x *ValidateLicenseFileRequest) Reset() {
	*x = ValidateLicenseFileRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ValidateLicenseFileRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ValidateLicenseFileRequest) ProtoMessage() {}

func (x *ValidateLicenseFileRequest) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ValidateLicenseFileRequest.ProtoReflect.Descriptor instead.
func (*ValidateLicenseFileRequest) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{6}
}

func (x *ValidateLicenseFileRequest) GetLicenseFilePath() string {
	if x != nil {
		return x.LicenseFilePath
	}
	return ""
}

type ValidateLicenseFileResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result string `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
}

func (x *ValidateLicenseFileResponse) Reset() {
	*x = ValidateLicenseFileResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ValidateLicenseFileResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ValidateLicenseFileResponse) ProtoMessage() {}

func (x *ValidateLicenseFileResponse) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ValidateLicenseFileResponse.ProtoReflect.Descriptor instead.
func (*ValidateLicenseFileResponse) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{7}
}

func (x *ValidateLicenseFileResponse) GetResult() string {
	if x != nil {
		return x.Result
	}
	return ""
}

type ValidateLicenseStringBase64Request struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	LicenseString string `protobuf:"bytes,1,opt,name=licenseString,proto3" json:"licenseString,omitempty"`
}

func (x *ValidateLicenseStringBase64Request) Reset() {
	*x = ValidateLicenseStringBase64Request{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ValidateLicenseStringBase64Request) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ValidateLicenseStringBase64Request) ProtoMessage() {}

func (x *ValidateLicenseStringBase64Request) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ValidateLicenseStringBase64Request.ProtoReflect.Descriptor instead.
func (*ValidateLicenseStringBase64Request) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{8}
}

func (x *ValidateLicenseStringBase64Request) GetLicenseString() string {
	if x != nil {
		return x.LicenseString
	}
	return ""
}

type ValidateLicenseStringBase64Response struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result string `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
}

func (x *ValidateLicenseStringBase64Response) Reset() {
	*x = ValidateLicenseStringBase64Response{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ValidateLicenseStringBase64Response) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ValidateLicenseStringBase64Response) ProtoMessage() {}

func (x *ValidateLicenseStringBase64Response) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ValidateLicenseStringBase64Response.ProtoReflect.Descriptor instead.
func (*ValidateLicenseStringBase64Response) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{9}
}

func (x *ValidateLicenseStringBase64Response) GetResult() string {
	if x != nil {
		return x.Result
	}
	return ""
}

type VersionRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *VersionRequest) Reset() {
	*x = VersionRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[10]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VersionRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VersionRequest) ProtoMessage() {}

func (x *VersionRequest) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[10]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VersionRequest.ProtoReflect.Descriptor instead.
func (*VersionRequest) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{10}
}

type VersionResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Result string `protobuf:"bytes,1,opt,name=result,proto3" json:"result,omitempty"`
}

func (x *VersionResponse) Reset() {
	*x = VersionResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_g2product_proto_msgTypes[11]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *VersionResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*VersionResponse) ProtoMessage() {}

func (x *VersionResponse) ProtoReflect() protoreflect.Message {
	mi := &file_g2product_proto_msgTypes[11]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use VersionResponse.ProtoReflect.Descriptor instead.
func (*VersionResponse) Descriptor() ([]byte, []int) {
	return file_g2product_proto_rawDescGZIP(), []int{11}
}

func (x *VersionResponse) GetResult() string {
	if x != nil {
		return x.Result
	}
	return ""
}

var File_g2product_proto protoreflect.FileDescriptor

var file_g2product_proto_rawDesc = []byte{
	0x0a, 0x0f, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x09, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x22, 0x10, 0x0a, 0x0e,
	0x44, 0x65, 0x73, 0x74, 0x72, 0x6f, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x22, 0x11,
	0x0a, 0x0f, 0x44, 0x65, 0x73, 0x74, 0x72, 0x6f, 0x79, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x73, 0x0a, 0x0b, 0x49, 0x6e, 0x69, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x12, 0x1e, 0x0a, 0x0a, 0x6d, 0x6f, 0x64, 0x75, 0x6c, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x6d, 0x6f, 0x64, 0x75, 0x6c, 0x65, 0x4e, 0x61, 0x6d, 0x65,
	0x12, 0x1c, 0x0a, 0x09, 0x69, 0x6e, 0x69, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x09, 0x69, 0x6e, 0x69, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x12, 0x26,
	0x0a, 0x0e, 0x76, 0x65, 0x72, 0x62, 0x6f, 0x73, 0x65, 0x4c, 0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0e, 0x76, 0x65, 0x72, 0x62, 0x6f, 0x73, 0x65, 0x4c,
	0x6f, 0x67, 0x67, 0x69, 0x6e, 0x67, 0x22, 0x0e, 0x0a, 0x0c, 0x49, 0x6e, 0x69, 0x74, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x10, 0x0a, 0x0e, 0x4c, 0x69, 0x63, 0x65, 0x6e, 0x73,
	0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x22, 0x29, 0x0a, 0x0f, 0x4c, 0x69, 0x63, 0x65,
	0x6e, 0x73, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x72,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x72, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x22, 0x46, 0x0a, 0x1a, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c,
	0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x46, 0x69, 0x6c, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x28, 0x0a, 0x0f, 0x6c, 0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x46, 0x69, 0x6c, 0x65,
	0x50, 0x61, 0x74, 0x68, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x6c, 0x69, 0x63, 0x65,
	0x6e, 0x73, 0x65, 0x46, 0x69, 0x6c, 0x65, 0x50, 0x61, 0x74, 0x68, 0x22, 0x35, 0x0a, 0x1b, 0x56,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c, 0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x46, 0x69,
	0x6c, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x72, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x72, 0x65, 0x73, 0x75,
	0x6c, 0x74, 0x22, 0x4a, 0x0a, 0x22, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c, 0x69,
	0x63, 0x65, 0x6e, 0x73, 0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x42, 0x61, 0x73, 0x65, 0x36,
	0x34, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x24, 0x0a, 0x0d, 0x6c, 0x69, 0x63, 0x65,
	0x6e, 0x73, 0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0d, 0x6c, 0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x22, 0x3d,
	0x0a, 0x23, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c, 0x69, 0x63, 0x65, 0x6e, 0x73,
	0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x42, 0x61, 0x73, 0x65, 0x36, 0x34, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x22, 0x10, 0x0a,
	0x0e, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x22,
	0x29, 0x0a, 0x0f, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x32, 0xfa, 0x03, 0x0a, 0x09, 0x47,
	0x32, 0x50, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x12, 0x42, 0x0a, 0x07, 0x44, 0x65, 0x73, 0x74,
	0x72, 0x6f, 0x79, 0x12, 0x19, 0x2e, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e,
	0x44, 0x65, 0x73, 0x74, 0x72, 0x6f, 0x79, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1a,
	0x2e, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x74, 0x72,
	0x6f, 0x79, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x39, 0x0a, 0x04,
	0x49, 0x6e, 0x69, 0x74, 0x12, 0x16, 0x2e, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74,
	0x2e, 0x49, 0x6e, 0x69, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x17, 0x2e, 0x67,
	0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x49, 0x6e, 0x69, 0x74, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x42, 0x0a, 0x07, 0x4c, 0x69, 0x63, 0x65, 0x6e,
	0x73, 0x65, 0x12, 0x19, 0x2e, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x4c,
	0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1a, 0x2e,
	0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x4c, 0x69, 0x63, 0x65, 0x6e, 0x73,
	0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x12, 0x66, 0x0a, 0x13, 0x56,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c, 0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x46, 0x69,
	0x6c, 0x65, 0x12, 0x25, 0x2e, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x56,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c, 0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x46, 0x69,
	0x6c, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x26, 0x2e, 0x67, 0x32, 0x70, 0x72,
	0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c, 0x69,
	0x63, 0x65, 0x6e, 0x73, 0x65, 0x46, 0x69, 0x6c, 0x65, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x00, 0x12, 0x7e, 0x0a, 0x1b, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c,
	0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x53, 0x74, 0x72, 0x69, 0x6e, 0x67, 0x42, 0x61, 0x73, 0x65,
	0x36, 0x34, 0x12, 0x2d, 0x2e, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x56,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c, 0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x53, 0x74,
	0x72, 0x69, 0x6e, 0x67, 0x42, 0x61, 0x73, 0x65, 0x36, 0x34, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x1a, 0x2e, 0x2e, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x56, 0x61,
	0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x4c, 0x69, 0x63, 0x65, 0x6e, 0x73, 0x65, 0x53, 0x74, 0x72,
	0x69, 0x6e, 0x67, 0x42, 0x61, 0x73, 0x65, 0x36, 0x34, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x22, 0x00, 0x12, 0x42, 0x0a, 0x07, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x19,
	0x2e, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x56, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x1a, 0x2e, 0x67, 0x32, 0x70, 0x72,
	0x6f, 0x64, 0x75, 0x63, 0x74, 0x2e, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x00, 0x42, 0x65, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x73,
	0x65, 0x6e, 0x7a, 0x69, 0x6e, 0x67, 0x2e, 0x67, 0x32, 0x2e, 0x65, 0x6e, 0x67, 0x69, 0x6e, 0x65,
	0x2e, 0x67, 0x72, 0x70, 0x63, 0x2e, 0x47, 0x32, 0x50, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x42,
	0x0e, 0x47, 0x32, 0x50, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50,
	0x01, 0x5a, 0x2b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x65,
	0x6e, 0x7a, 0x69, 0x6e, 0x67, 0x2f, 0x67, 0x32, 0x2d, 0x73, 0x64, 0x6b, 0x2d, 0x67, 0x6f, 0x2d,
	0x67, 0x72, 0x70, 0x63, 0x2f, 0x67, 0x32, 0x70, 0x72, 0x6f, 0x64, 0x75, 0x63, 0x74, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_g2product_proto_rawDescOnce sync.Once
	file_g2product_proto_rawDescData = file_g2product_proto_rawDesc
)

func file_g2product_proto_rawDescGZIP() []byte {
	file_g2product_proto_rawDescOnce.Do(func() {
		file_g2product_proto_rawDescData = protoimpl.X.CompressGZIP(file_g2product_proto_rawDescData)
	})
	return file_g2product_proto_rawDescData
}

var file_g2product_proto_msgTypes = make([]protoimpl.MessageInfo, 12)
var file_g2product_proto_goTypes = []interface{}{
	(*DestroyRequest)(nil),                      // 0: g2product.DestroyRequest
	(*DestroyResponse)(nil),                     // 1: g2product.DestroyResponse
	(*InitRequest)(nil),                         // 2: g2product.InitRequest
	(*InitResponse)(nil),                        // 3: g2product.InitResponse
	(*LicenseRequest)(nil),                      // 4: g2product.LicenseRequest
	(*LicenseResponse)(nil),                     // 5: g2product.LicenseResponse
	(*ValidateLicenseFileRequest)(nil),          // 6: g2product.ValidateLicenseFileRequest
	(*ValidateLicenseFileResponse)(nil),         // 7: g2product.ValidateLicenseFileResponse
	(*ValidateLicenseStringBase64Request)(nil),  // 8: g2product.ValidateLicenseStringBase64Request
	(*ValidateLicenseStringBase64Response)(nil), // 9: g2product.ValidateLicenseStringBase64Response
	(*VersionRequest)(nil),                      // 10: g2product.VersionRequest
	(*VersionResponse)(nil),                     // 11: g2product.VersionResponse
}
var file_g2product_proto_depIdxs = []int32{
	0,  // 0: g2product.G2Product.Destroy:input_type -> g2product.DestroyRequest
	2,  // 1: g2product.G2Product.Init:input_type -> g2product.InitRequest
	4,  // 2: g2product.G2Product.License:input_type -> g2product.LicenseRequest
	6,  // 3: g2product.G2Product.ValidateLicenseFile:input_type -> g2product.ValidateLicenseFileRequest
	8,  // 4: g2product.G2Product.ValidateLicenseStringBase64:input_type -> g2product.ValidateLicenseStringBase64Request
	10, // 5: g2product.G2Product.Version:input_type -> g2product.VersionRequest
	1,  // 6: g2product.G2Product.Destroy:output_type -> g2product.DestroyResponse
	3,  // 7: g2product.G2Product.Init:output_type -> g2product.InitResponse
	5,  // 8: g2product.G2Product.License:output_type -> g2product.LicenseResponse
	7,  // 9: g2product.G2Product.ValidateLicenseFile:output_type -> g2product.ValidateLicenseFileResponse
	9,  // 10: g2product.G2Product.ValidateLicenseStringBase64:output_type -> g2product.ValidateLicenseStringBase64Response
	11, // 11: g2product.G2Product.Version:output_type -> g2product.VersionResponse
	6,  // [6:12] is the sub-list for method output_type
	0,  // [0:6] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_g2product_proto_init() }
func file_g2product_proto_init() {
	if File_g2product_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_g2product_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DestroyRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DestroyResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InitRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*InitResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LicenseRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LicenseResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ValidateLicenseFileRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ValidateLicenseFileResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ValidateLicenseStringBase64Request); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ValidateLicenseStringBase64Response); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[10].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VersionRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_g2product_proto_msgTypes[11].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*VersionResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_g2product_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   12,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_g2product_proto_goTypes,
		DependencyIndexes: file_g2product_proto_depIdxs,
		MessageInfos:      file_g2product_proto_msgTypes,
	}.Build()
	File_g2product_proto = out.File
	file_g2product_proto_rawDesc = nil
	file_g2product_proto_goTypes = nil
	file_g2product_proto_depIdxs = nil
}
