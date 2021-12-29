def buildApp(){
    echo ' building the application...'
    nodejs('Nodejs-17.3.0'){
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