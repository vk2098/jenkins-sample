pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Run') {
            steps {
                dir('target') {
                    sh 'java -jar jenkinsdemo-0.0.1-SNAPSHOT.jar'
                }
            }
        }
    }
}
