def call() {
pipeline {
    agent any
    
    stages {
    stage('compile/Build') {
        steps{
            script{
                common.compile()

            }
        
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
