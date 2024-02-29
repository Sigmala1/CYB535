pipeline {
    agent any

    stages {
        stage ("use dir") {
            steps {
                dir("CYB535JUnitTest")
                {
                    bat "mvn test"
                    //echo "hello Im in Java"
                }

                
            }
        }
    }
}
