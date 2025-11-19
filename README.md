Mikroserwisy: Jesli robiac na klastrze
To samo to ze mam serwis i skalowanie aplikacji zastępuje discovery server (eureka) poniewaz serwis ma informacje na temat wszystkich podów.
 
Zeby zrobic cos ala gateway (przy strzale do aplikacji a, do aplikacji b wystarczy strzealc na 1 endpoint - oczywiscie te apliakcje moga miec po np. 10 podow) wystarczy zrobic ingress + load balancer dla ingress. Ale mozna oczywiscie tez uzywac gateway ze spring cloud jesli to java.
 

 

Oprócz tego mozna odwolywac sie bez posrednio do service jak tutaj wskazuja adres zookeepera. Zookeper ma pod + service z nazwa zookeper-server-pod i mozna sie odwolac bezposrednio w ten sposob wskazujac jeszcze port. Jesli cos jest spoza projektu to mozna zawsze ext-service zrobic (external service do serwisów innego projektu openshift)
```
apiVersion: v1
kind: Pod
metadata:
  name: kafka-server-pod
  labels:
    app: kafka-server
spec:
  restartPolicy: OnFailure
  containers:
    - name: kafka-server
      image: wurstmeister/kafka
      ports:
        - containerPort: 9092
          name: kafka
      env:
        - name: KAFKA_ADVERTISED_HOST_NAME
          value: "kafka-server-pod"
        - name: KAFKA_ZOOKEEPER_CONNECT
          value: "zookeeper-server-pod:2181"
      resources:
        requests:
          memory: "256Mi"
          cpu: "100m"
        limits:
          memory: "512Mi"
          cpu: "500m"
```

