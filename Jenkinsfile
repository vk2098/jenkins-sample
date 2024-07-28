pipeline {
    agent any



    stages {


        stage('Build') {
            steps {
                sh 'mvn clean install'
                sh 'cd target'
            }
        }

        stage('run') {
                    steps {
                        sh 'java -jar jenkinsdemo-0.0.1-SNAPSHOT.jar'
                    }
                }

        }
    }
