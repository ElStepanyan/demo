pipeline {
    agent { label 'master' }

 stages{
    stage ('Build') {
        steps{
    git url: 'https://github.com/ElStepanyan/demo.git'
     sh 'mvn -B -DskipTests clean package'}
        
    }
 }
}
