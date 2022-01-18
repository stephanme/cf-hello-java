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

You may need to set the route in manifest.yml or push with -n.

Access Application
------------------

```
curl https://hello-java.<domain>
```

Run Task
--------
```
cf run-task hello-java --name my-task
cf run-task hello-java --name my-task --command '.java-buildpack/open_jdk_jre/bin/java -cp ./WEB-INF/classes org.example.Task arg1 arg2'
cf tasks hello-java

cf logs hello-java --recent
```
