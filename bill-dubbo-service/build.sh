#!/usr/bin/env bash
mvn package

docker build -t bill-dubbo-service:latest .