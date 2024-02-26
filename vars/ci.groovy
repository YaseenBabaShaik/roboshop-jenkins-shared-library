def call() {
pipeline {
    agent {
        label 'workstation'
    }

    stages {
    stage('compile/Build') {
        steps{
            echo "compile"
        }
    }
    stage('Unit Tests') {
        steps{
            echo "Unit Tests"
        }
    }
    stage('Sonar Qube') {
        steps{
            echo "Sonar Qube"
        }
    }
    stage('Upload code to Centralized place'){
        steps{
            echo "Upload"
        }
    }

}
}
}
