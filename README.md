# cf-hello-java

Dependencies
------------

You need maven and a jdk installed.


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

You may need to adapt the route in manifest.yml.

Access Application
------------------

```
curl https://hello-java.<domain>
```cf