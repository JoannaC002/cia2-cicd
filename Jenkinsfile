
pipeline {
    agent any

    options {
        timestamps()
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build --platform linux/amd64 -t cia2-cicd-app:${BUILD_NUMBER} .'
            }
        }
    }
}
