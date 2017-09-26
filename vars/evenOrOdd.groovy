def call(int buildNumber){
  if (buildNumber % 2 == 0){
    pipeline {
      agent any
      stages {
        stage ('Even stage'){
          steps {
            echo "num is even!"
          }
        }
      }
    }
  } else {
    node {
      stage ('Odd stage') {
        echo "SCRIPT Num is odd!"
      }
    }
  }
}
