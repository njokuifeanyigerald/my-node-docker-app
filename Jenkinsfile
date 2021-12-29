// CODE_CHANGES = getGitChanges()
pipeline {
    agent any 
    environment {
        NEW_VERSION = '1.0'
        // how to extract creddential frrom jenkins
        // have to install credntial binding plugin
        SERVER_CREDENTIALS = credentials('server-credential')
    }
    // tools {
    //     maven 'Maven'
    //     gradle 'Gradle'

    // }

    // when tryna select a  specific version that is a external conguration
    parameters {
        // string and booleanParam are almost the d same so you have to delete one
        // string(name: 'VERSION', defaultValue: '', description: 'version to deploy on grad')
        choice(name:  'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("build"){
            steps{
                echo 'building the app'
                echo "building version ${NEW_VERSION}"

            }
        }
        stage('test'){
            // the stage will nly excute when it meets the criteria
            when {
                expression {
                    // BRANCH_NAME == 'master' && CODE_CHANGES == true
                    params.executeTests

                }
            }
            steps{
                echo 'testing the app'
                

            }
        }
        stage('deploy'){
            steps{
                // better with double qoute
                echo 'deploying the app'
                withCredentials([
                    // take the usernameand store it into a variable
                    usernamePassword(credentials: 'server-credentials', usernameVariable: USER, passwordVariable: PWD)
                ]) {
                    sh "some script "
                }           
                echo "eploying  version ${params.VERSION}"
            }
        }
    }
    // post{
    //     always{
    //         echo "====++++always++++===="
    //         // it will be always excuted regardless of failure
    //     }
    //     success{
    //         echo "====++++only when successful++++===="
    //     }
    //     failure{
    //         echo "====++++only when failed++++===="
    //     }
    // }
}


// pipeline{
//     agent{
//         label "node"
//     }
//     stages{
//         stage("A"){
//             steps{
//                 echo "========executing A========"
//             }
//             post{
//                 always{
//                     echo "========always========"
//                 }
//                 success{
//                     echo "========A executed successfully========"
//                 }
//                 failure{
//                     echo "========A execution failed========"
//                 }
//             }
//         }
//     }
//     post{
//         always{
//             echo "========always========"
//         }
//         success{
//             echo "========pipeline executed successfully ========"
//         }
//         failure{
//             echo "========pipeline execution failed========"
//         }
//     }
// }