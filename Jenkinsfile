pipeline{
    agent any 
    stages {
        stage('build'){
            steps{
                echo 'building the app'
                

            }
        }
        stage('test'){
            steps{
                echo 'testing the app'
                

            }
        }
        stage('deploy'){
            steps{
                echo 'deploying the app'
                

            }
        }
    }
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