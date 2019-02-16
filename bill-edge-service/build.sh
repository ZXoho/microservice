#!/usr/bin/env bash
mvn package

docker build -t bill-edge-service:latest .