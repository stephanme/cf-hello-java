# cf-hello-java

Dependencies
------------

You need maven and a jdk 17 installed.


Build
-----

```
mvn package
```

Deploy to Cloud Foundry
-----------------------

```
cf push
```

The app gets a random route assigned.

Access Application
------------------

```
ROUTE=$(cf curl "/v3/apps/$(cf app hello-java --guid)/routes" | jq -r .resources[0].url)
curl https://$ROUTE
```

Run Task
--------
```
cf run-task hello-java --name my-task
cf run-task hello-java --name my-task --command '.java-buildpack/open_jdk_jre/bin/java -cp ./WEB-INF/classes org.example.Task arg1 arg2'
cf tasks hello-java

cf logs hello-java --recent
```
