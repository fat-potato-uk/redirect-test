#### How to run

First of all you will need `docker` and `docker-compose` available. 

Next, you can simply run `docker-compose up` in the base directory of this repo which
will build and run the application along side `nginx`.

To test, run a curl and check the output:

```bash
curl --proxy localhost:9999 http://someurl/hello/test
TEST
``` 

You should see in the compose output:

```bash
redirector_1  | 
redirector_1  |   .   ____          _            __ _ _
redirector_1  |  /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
redirector_1  | ( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
redirector_1  |  \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
redirector_1  |   '  |____| .__|_| |_|_| |_\__, | / / / /
redirector_1  |  =========|_|==============|___/=/_/_/_/
redirector_1  |  :: Spring Boot ::        (v2.1.6.RELEASE)
redirector_1  | 
redirector_1  | 2019-11-21 08:28:28.503  INFO 1 --- [           main] demo.Application                         : Starting Application v1.0-SNAPSHOT on eb9fb428c8b6 with PID 1 (/usr/app/redirect_test-1.0-SNAPSHOT.jar started by root in /)
redirector_1  | 2019-11-21 08:28:28.506  INFO 1 --- [           main] demo.Application                         : No active profile set, falling back to default profiles: default
...
redirector_1  | 2019-11-21 08:28:31.137  INFO 1 --- [nio-8080-exec-1] demo.controllers.RedirectController      : The intended destination: https://someurl/hello/test
nginx_1       | 172.28.0.1 - - [21/Nov/2019:08:28:31 +0000] "GET http://someurl/hello/test HTTP/1.1" 200 4 "-" "curl/7.54.0"
```

That's all!