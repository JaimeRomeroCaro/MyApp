pipeline {
  agent any
  tools {
    maven 'Maven 3.8.2'
  }
  options {
    skipDefaultCheckout()
  }
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn test'
      }
    }
  }
}
