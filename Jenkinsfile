pipeline {
    agent any
    tools{
        maven 'maven-3.5.2'
    }
    triggers {
        githubPush()
      }
    stages {
        stage("build") {
            steps {
                echo 'building the application...'
                sh "mvn install"
                checkout([$class: 'GitSCM',
                   branches: [[name: '*/main']],
                   doGenerateSubmoduleConfigurations: false,
                   extensions: [[$class: 'CleanCheckout']],
                   submoduleCfg: [],
                   userRemoteConfigs: [[url: 'https://github.com/MustafaFindik24/main.git']]])
                 sh "ls -ltr"

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
