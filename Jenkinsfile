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
                bat 'java -cp target/helloworld-1.0.jar com.mickeyc.helloworld.HelloWorld'
            }
        }
    }
}
