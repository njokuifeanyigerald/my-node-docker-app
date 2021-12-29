def buildApp(){
    echo ' building the application...'
    // nodejs('node-17'){
        // in linux use 'sh' while in windows use 'bat'
    //     sh 'yarn install '
    // }
    bat 'yarn install'
}

def testApp(){
    echo ' test the application...'
    withGradle(){
        bat './gradlew -v'
    }
}

def deployApp(){
    echo ' deploy the application...'
    echo "deploying version ${params.VERSION}"
}


return this