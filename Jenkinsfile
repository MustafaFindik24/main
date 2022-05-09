pipeline {
    agent any
    tools {
        maven 'maven-3.5.2'
    }
    stages {
        stage("build") {
            steps {
                echo 'building the application...'
                sh "mvn install"
            }
        }
      stage("test") {
            steps {
                echo 'testing the application...'
                sh "mvn test"
            }
        }
      stage("deploy") {
            steps {
                echo 'deploying the application...'
            }
        }
   }
}
