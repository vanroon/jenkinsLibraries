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
    pipeline {
      agent any
      stages {
        stage ('Odd stage') {
          steps {
            echo "Num is odd!"
          }
        }
      }
    }
  }
}
