node {
    checkout scm
    sh './mvnw -B -DskipTests clean package'
    docker.build("org-springboot/boot-jenkins-app")
}