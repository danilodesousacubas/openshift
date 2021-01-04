#!/bin/bash

kubectl apply -f mysql-deployment.yaml
kubectl apply -f purchase-deployment.yaml
kubectl apply -f clients-deployment.yaml
kubectl apply -f product-deployment.yaml



