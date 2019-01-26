#!/usr/bin/env bash
thrift --gen java -out ../src/main/java user_service.thrift

thrift --gen java -out ../src/main/java user_service_role.thrift