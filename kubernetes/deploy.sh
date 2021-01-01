#!/bin/bash

kubectl apply -f purchase-deployment.yaml
kubectl apply -f clients-deployments.yaml

#kubectl apply -f products-deployments.yaml

