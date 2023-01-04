# g2-sdk-proto

## Synopsis

:warning:
This is a work-in-progress.
Feel free to comment on it, but do not use it in production, yet.
:warning:

The repository for Senzing's Protocol Buffer `.proto` files.

## Overview

Currently this repository is undergoing review.

### Contents

1. [Expectations](#expectations)
1. [Generated source code](#generated-source-code)
1. [Development](#development)
1. [Errors](#errors)
1. [References](#references)

## Expectations

- **Background knowledge:** This repository assumes a working knowledge of:
  - [gRPC](https://github.com/Senzing/knowledge-base/blob/main/WHATIS/grpc.md)

## Generated source code

1. [cpp](example_generated_source_code/cpp)
1. [go](go)
1. [java](example_generated_source_code/java)
1. [php](example_generated_source_code/php)
1. [python](example_generated_source_code/python)
1. [ruby](example_generated_source_code/ruby)

## Development

### Clone repository

1. Set these environment variable values:

    ```console
    export GIT_ACCOUNT=senzing
    export GIT_REPOSITORY=g2-sdk-proto
    export GIT_ACCOUNT_DIR=~/${GIT_ACCOUNT}.git
    export GIT_REPOSITORY_DIR="${GIT_ACCOUNT_DIR}/${GIT_REPOSITORY}"

    ```

1. Using the environment variables values just set, follow steps in [clone-repository](https://github.com/Senzing/knowledge-base/blob/main/HOWTO/clone-repository.md) to install the Git repository.

### Language

The following instructions were used to create a
[go module](go) and other
[example generated source code](example_generated_source_code).

#### Identify Senzing subcomponents

1. Enumerate the Senzing components for use in language-specific commands below.
   Example:

    ```console
    export SENZING_COMPONENTS=( \
      "g2config" \
      "g2configmgr" \
      "g2diagnostic" \
      "g2engine" \
      "g2hasher" \
      "g2product" \
      "g2ssadm" \
    )

    ```

#### C++

1. [Clone repository](#clone-repository).
1. Follow the
   [C++ Quick start](https://grpc.io/docs/languages/cpp/quickstart/)
   tutorial to prepare an environment.
1. [Identify Senzing subcomponents](#identify-senzing-subcomponents)
1. Generate message handling code.
   Example:

    ```console
    for SENZING_COMPONENT in ${SENZING_COMPONENTS[@]}; \
    do \
      export SENZING_OUTPUT_DIR=${GIT_REPOSITORY_DIR}/example_generated_source_code/cpp/${SENZING_COMPONENT}
      mkdir -p ${SENZING_OUTPUT_DIR}
      protoc \
        --proto_path=${GIT_REPOSITORY_DIR}/ \
        --cpp_out=${SENZING_OUTPUT_DIR} \
        ${GIT_REPOSITORY_DIR}/${SENZING_COMPONENT}.proto
    done

    ```

1. Generating client and server code.
   Example:

    ```console
    for SENZING_COMPONENT in ${SENZING_COMPONENTS[@]}; \
    do \
      export SENZING_OUTPUT_DIR=${GIT_REPOSITORY_DIR}/example_generated_source_code/cpp/${SENZING_COMPONENT}
      mkdir -p ${SENZING_OUTPUT_DIR}
      protoc \
        --proto_path=${GIT_REPOSITORY_DIR}/ \
        --grpc_out=${SENZING_OUTPUT_DIR} \
        --plugin=protoc-gen-grpc=`which grpc_cpp_plugin` \
        ${GIT_REPOSITORY_DIR}/${SENZING_COMPONENT}.proto
    done

    ```

#### Go

1. [Clone repository](#clone-repository).
1. Follow the
   [Go Quick start](https://grpc.io/docs/languages/go/quickstart/)
   tutorial to prepare an environment.
1. [Identify Senzing subcomponents](#identify-senzing-subcomponents)
1. [Generating client and server code](https://grpc.io/docs/languages/go/basics/#generating-client-and-server-code).
   Example:

    ```console
    for SENZING_COMPONENT in ${SENZING_COMPONENTS[@]}; \
    do \
      export SENZING_OUTPUT_DIR=${GIT_REPOSITORY_DIR}/go/${SENZING_COMPONENT}
      mkdir -p ${SENZING_OUTPUT_DIR}
      protoc \
        --proto_path=${GIT_REPOSITORY_DIR}/ \
        --go_out=${SENZING_OUTPUT_DIR} \
        --go_opt=paths=source_relative \
        --go-grpc_out=${SENZING_OUTPUT_DIR} \
        --go-grpc_opt=paths=source_relative \
        ${GIT_REPOSITORY_DIR}/${SENZING_COMPONENT}.proto
    done

    ```

    1. In `${SENZING_OUTPUT_DIR}`, files *with* `_grpc.` in the filename contain the following:
        - Interface types (or stubs) for clients to call with the methods defined in the services.
        - Interface types for servers to implement, also with the methods defined in the services.
        - In other words, its the "gRPC" code that handles the network traffic, not the message content.
    1. In `${SENZING_OUTPUT_DIR}`, files *without* `_grpc.` in the filename contain the following:
        - protocol buffer code to populate, serialize, and retrieve request and response message types.
        - In other workds, it manages message content, not the network traffic.
1. **References:**
    1. [gRPC Documents for Go](https://grpc.io/docs/languages/go/)
        1. [Go Quick start](https://grpc.io/docs/languages/go/quickstart/)
    1. [Thread safety](https://grpc.io/docs/languages/go/generated-code/)

#### Java

1. [Clone repository](#clone-repository).
1. Follow the
   [Java Quick start](https://grpc.io/docs/languages/java/quickstart/)
   tutorial to prepare an environment.
1. [Identify Senzing subcomponents](#identify-senzing-subcomponents)
1. Generate client and server code.
   Example:

    ```console
    for SENZING_COMPONENT in ${SENZING_COMPONENTS[@]}; \
    do \
      export SENZING_OUTPUT_DIR=${GIT_REPOSITORY_DIR}/example_generated_source_code/java/${SENZING_COMPONENT}
      mkdir -p ${SENZING_OUTPUT_DIR}
      protoc \
        --proto_path=${GIT_REPOSITORY_DIR}/ \
        --java_out=${SENZING_OUTPUT_DIR} \
        ${GIT_REPOSITORY_DIR}/${SENZING_COMPONENT}.proto
    done

    ```

#### PHP

1. [Clone repository](#clone-repository).
1. Follow the
   [PHP Quick start](https://grpc.io/docs/languages/php/quickstart/)
   tutorial to prepare an environment.
1. [Identify Senzing subcomponents](#identify-senzing-subcomponents)
1. Generate client and server code.
   Example:

    ```console
    for SENZING_COMPONENT in ${SENZING_COMPONENTS[@]}; \
    do \
      export SENZING_OUTPUT_DIR=${GIT_REPOSITORY_DIR}/example_generated_source_code/php/${SENZING_COMPONENT}
      mkdir -p ${SENZING_OUTPUT_DIR}
      protoc \
        --proto_path=${GIT_REPOSITORY_DIR}/ \
        --php_out=${SENZING_OUTPUT_DIR} \
        --grpc_out=${SENZING_OUTPUT_DIR} \
        --plugin=protoc-gen-grpc=`which grpc_php_plugin` \
        ${GIT_REPOSITORY_DIR}/${SENZING_COMPONENT}.proto
    done

    ```

#### Python

1. [Clone repository](#clone-repository).
1. Follow the
   [Python Quick start](https://grpc.io/docs/languages/python/quickstart/)
   tutorial to prepare an environment.
1. [Identify Senzing subcomponents](#identify-senzing-subcomponents)
1. Generate client and server code.
   Example:

    ```console
    for SENZING_COMPONENT in ${SENZING_COMPONENTS[@]}; \
    do \
      export SENZING_OUTPUT_DIR=${GIT_REPOSITORY_DIR}/example_generated_source_code/python/${SENZING_COMPONENT}
      mkdir -p ${SENZING_OUTPUT_DIR}
      python3 -m grpc_tools.protoc \
        --proto_path=${GIT_REPOSITORY_DIR} \
        --python_out=${SENZING_OUTPUT_DIR} \
        --grpc_python_out=${SENZING_OUTPUT_DIR} \
        ${GIT_REPOSITORY_DIR}/${SENZING_COMPONENT}.proto
    done

    ```

#### Ruby

1. [Clone repository](#clone-repository).
1. Follow the
   [Ruby Quick start](https://grpc.io/docs/languages/ruby/quickstart/)
   tutorial to prepare an environment.
1. [Identify Senzing subcomponents](#identify-senzing-subcomponents)
1. Generate client and server code.
   Example:

    ```console
    for SENZING_COMPONENT in ${SENZING_COMPONENTS[@]}; \
    do \
      export SENZING_OUTPUT_DIR=${GIT_REPOSITORY_DIR}/example_generated_source_code/ruby/${SENZING_COMPONENT}
      mkdir -p ${SENZING_OUTPUT_DIR}
      grpc_tools_ruby_protoc \
        --proto_path=${GIT_REPOSITORY_DIR} \
        --ruby_out=${SENZING_OUTPUT_DIR} \
        --grpc_out=${SENZING_OUTPUT_DIR} \
        ${GIT_REPOSITORY_DIR}/${SENZING_COMPONENT}.proto
    done

    ```

#### .NET

1. **References:**
    1. [Overview for gRPC on .NET](https://learn.microsoft.com/en-us/aspnet/core/grpc)

## Errors

1. See [docs/errors.md](docs/errors.md).

## References

1. [Protocol Buffers Overview](https://developers.google.com/protocol-buffers/docs/overview)
    1. [Language Guide for proto3](https://developers.google.com/protocol-buffers/docs/proto3)
1. [Protocol buffers](https://developers.google.com/protocol-buffers)
1. [protoc man page](https://manpages.debian.org/testing/protobuf-compiler/protoc.1.en.html)
1. gPRC
    1. [Introduction to gRPC](https://grpc.io/docs/what-is-grpc/introduction/)
