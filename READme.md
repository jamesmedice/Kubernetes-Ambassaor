1 - first you need to install Ambassador 
    follow : https://www.getambassador.io/docs/latest/tutorials/getting-started/

2 -to deploy the app you must RUN : skaffold run 

3- for removing all components deòployed :

kubectl delete -n default deployment ambassador

kubectl delete -n default deployment bootstorage-svc

kubectl delete -n default deployment shop-svc

kubectl delete -n default service ambassador

kubectl delete -n default service bootstorage-svc

kubectl delete -n default service shop-svc

kubectl delete -n default service ambassador-admin

kubectl delete -n default service redis

kubectl delete -n default configmap scout.config.ambassador

kubectl delete -n default persistentvolumeclaim redis-volume-redis-0

kubectl delete -n default cronjob cronjob

kubectl delete -n default secret bootstorage-env

kubectl delete -n default secret ambassador-token

kubectl delete -n default statefulset redis
