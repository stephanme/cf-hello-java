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

You may need to set the route in manifest.yml or push with -n.

Access Application
------------------

```
curl https://hello-java.<domain>
```
