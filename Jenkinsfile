node {
    checkout scm
    sh './mvnw -B -DskipTests clean package'
    sh 'curl -fsSL https://get.docker.com | sh'
    docker.build("org-springboot/boot-jenkins-app")
}