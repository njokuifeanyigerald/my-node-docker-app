def buildApp(){
    echo ' building the application...'
    nodejs('node-17'){
        sh 'yarn install '
    }
}

def testApp(){
    echo ' test the application...'
    // withGradle(){
    //     sh './gradlew -v'
    // }
}

def deployApp(){
    echo ' deploy the application...'
    echo "deploying version ${params.VERSION}"
}


return this