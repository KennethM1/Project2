pipeline{
    agent any

    stages{
//        stage('Load environment variables') {
//            steps {
//                echo '>>>>>>>>>>>>> Loading environment variables...'
//                sh 'source $JENKINS_HOME/env.variables'
//            }
//        }
        stage('Build'){
            steps{
                echo '>>>>>>>>>>>>> Building...'
//                 echo '------ DEBUG'
//                 sh 'echo WORKSPACE: $WORKSPACE'
//                 echo '------------'
                echo "Running ${env.BUILD_ID} ${env.BUILD_DISPLAY_NAME} on ${env.NODE_NAME} and JOB ${env.JOB_NAME}"
                sh 'chmod u+x $WORKSPACE/gradlew'
                sh '$WORKSPACE/gradlew build'
            }
        }
        stage('Test'){
            steps {
                echo '>>>>>>>>>>>>> Testing...'
                jacoco()
//                script {
//                 try {
//                        //sh 'chmod +x gradlew'
//                        sh './gradlew test jacocoTestReport'
//                    } finally {
//                        junit '**/build/test-results/test/*.xml' 
//                        //make the junit test results available in any case (success & failure)
//                    }
//                }
            }
        }
        stage('Deploy'){
            steps {
                echo '>>>>>>>>>>>>> Deploying...'
                sh '$WORKSPACE/gradlew runJar'
            }
        }
    }
}
