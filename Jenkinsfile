pipeline {
    agent any
    tools {
        maven "Maven"
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/mickeycohen/JavaHelloWorld.git'
            }
        }
        stage('Clean and Package') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Run') {
            steps {
                bat 'java -jar helloworld-1.0.jar'
            }
        }
    }
    post {
        success {
            archiveArtifacts 'target/helloworld-1.0.jar'
        }
    }
}
