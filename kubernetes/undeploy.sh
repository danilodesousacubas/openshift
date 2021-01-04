#!/bin/bash

kubectl delete deployments/mysql
kubectl delete services/mysql

kubectl delete deployments/purchase
kubectl delete services/purchase

kubectl delete deployments/clients
kubectl delete services/clients

kubectl delete deployments/product
kubectl delete services/product
