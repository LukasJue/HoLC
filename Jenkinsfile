pipeline {
  agent any
  stages {
    stage('') {
      steps {
        parallel(
          "Print": {
            echo 'Hello World!'
            
          },
          "Shell": {
            sh 'echo "I\'m an Shel Script"'
            
          }
        )
      }
    }
    stage('Build') {
      steps {
        sh 'make'
      }
    }
  }
}