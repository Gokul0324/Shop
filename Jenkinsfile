pipeline{
    agent any
        tools{
            jdk 'JDK 21'
            maven 'Maven 3'
        }
        stages{
            stage('Build Maven'){
                steps{
checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Gokul0324/Shop.git']])                    bat 'mvn clean install'
                }
            }
           
        }
}