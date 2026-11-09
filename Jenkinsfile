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

      stage('Push to Artifact Registry') {
    steps {
        withEnv(['CLOUDSDK_CONFIG=/var/jenkins_home/.config/gcloud']) {
            sh '''
                gcloud auth print-access-token | docker login -u oauth2accesstoken --password-stdin https://asia-south1-docker.pkg.dev

                docker tag cia2-cicd-app:${BUILD_NUMBER} asia-south1-docker.pkg.dev/cia2-cicd-joan/cia2-docker-repo/cia2-cicd-app:${BUILD_NUMBER}

                docker push asia-south1-docker.pkg.dev/cia2-cicd-joan/cia2-docker-repo/cia2-cicd-app:${BUILD_NUMBER}
            '''
        }
    }
}
    }
}