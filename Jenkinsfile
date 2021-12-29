// CODE_CHANGES = getGitChanges()

// making it a global variable

def gv


pipeline {
    agent any 
    
    // when tryna select a  specific version that is a external conguration
    parameters {
        // string and booleanParam are almost the d same so you have to delete one
        // string(name: 'VERSION', defaultValue: '', description: 'version to deploy on grad')
        choice(name:  'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage ("init"){
            steps{
                script {
                    gv  = load "script.groovy"
                }
            }
        }
        stage("build"){
            steps{
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test"){
            // the stage will nly excute when it meets the criteria
            when {
                expression {
                    params.executeTests

                }
            }
            script{
                gv.testApp()
                
            }
        }
        stage("deploy"){
            script{
                gv.deployApp()
            }
        }
    }
    
}