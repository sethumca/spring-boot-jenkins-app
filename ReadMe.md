# Read Me

```sh
docker run -dit --rm \
-v jenkins_home:/var/jenkins_home \
-v $(which docker):/usr/bin/docker \
-v /var/run/docker.sock:/var/run/docker.sock 
-p 8080:8080 -p 50000:50000 \
--name jenkins_master \
jenkins/jenkins:latest-jdk21
```