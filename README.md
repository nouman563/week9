# week9
minikube start
minikube status
kubectl get nodes
kubectl get pods
kubectl create deployment mynginx  —image=nginx
kubectl get pods
minikube service mygnix —url (or) minikube dashboard
kubectl delete deployment mygnix
kubectl delete service mygnix
minikube stop
minikube delete



docker pull jasonrivers/nagios:latest
docker run —name nagiosdemo -p 8888:80 jasonrivers/nagios:latest
open browser and enter localhost://8888

docker stop nagiosdemo
docker rm nagiosdemo
