# openshift sample commands

```command

oc login 

oc status

oc new-project sample-java

oc new-app registry.access.redhat.com/redhat-openjdk-18/openjdk18-openshift~https://github.com/danilodesousacubas/openshift.git  --context-dir=java-hello --name=java-hello-demo

oc get pods

oc get services

oc expose svc/java-hello-demo

oc get routes

```

```command
oc start-build java-hello-demo -n sample-java

```

# kubernetes way

```command

oc apply -f clients-deployment.yaml 

oc apply -f clients-service.yaml 

```