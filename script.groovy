def buildApp(){
    echo ' building the application...'
    // nodejs('node-17'){
    //     in linux use 'sh' while in windows use 'bat'
    //     sh 'yarn install '
    // }
    // bat 'npm install'
    sh 'npm install '
}

def testApp(){
    echo ' test the application...'
    withGradle(gradle: 'gradle-7.3.3'){
        bat './gradlew -v'
    }
}

def deployApp(){
    echo ' deploy the application...'
    echo "deploying version ${params.VERSION}"
}


return this