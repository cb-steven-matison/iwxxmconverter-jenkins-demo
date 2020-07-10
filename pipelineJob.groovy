pipeline {
    agent any
    tools {
        maven 'Maven 3.6.3'
        jdk 'jdk_1.8.0_242'
    }
    stages {
        stage('Build') {
            steps {
                echo 'Build'
            }
        }
        stage('Test'){
            steps {
                echo 'Test'
            }
        }
    }
}