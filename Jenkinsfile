pipeline {
    agent { label 'master' }
    
  environment {
        // This can be nexus3 or nexus2
        NEXUS_VERSION = "nexus3"
        // This can be http or https
        NEXUS_PROTOCOL = "http"
        // Where your Nexus is running
        NEXUS_URL = "10.1.5.21:8081"
        // Repository where we will upload the artifact
        NEXUS_REPOSITORY = "maven-releases"
        // Jenkins credential id to authenticate to Nexus OSS
        NEXUS_CREDENTIAL_ID = "jenkins-user"   
  }

 stages{
    stage ('Build') {
        steps{

     sh 'mvn -B -DskipTests clean package'}
        
    }
 }
}
