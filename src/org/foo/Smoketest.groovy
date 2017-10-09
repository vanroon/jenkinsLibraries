pacakge org.foo;

def Smoke(dockerImage){
  //step1
  sh "echo print this docker image ${dockerImage}"
  //step2
  echo 'Print step 2'
}
