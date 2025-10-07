pipeline{
    agent any
    tools{
        maven 'MAVEN-HOME'
    }
    stages{
        stage('git repo & clean') {
            steps {
                //bat "rmdir  /s /q mavenjava"
                bat "https://github.com/nouman563/week9.git"
                bat "mvn clean -f mavenjava"
            }
        }
        stage('install') {
            steps {
                bat "mvn install -f mavenjava" week9
            }
        }
        stage('test') {
            steps {
                bat "mvn test -f mavenjava"
            }
        }
        stage('package') {
            steps {
                bat "mvn package -f mavenjava"
            }
        }
    }
}
