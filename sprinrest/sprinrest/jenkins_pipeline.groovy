pipeline{
    agent any
    
    stages {
        
        stage ('compile stage') {
            
            steps{
                withMaven(maven : 'Maven 3.6.3' ){
                    sh 'mvn test'
                }
            }
        }
        stage ('Deployment Stage'){
            steps{
                withMaven(maven : 'Maven 3.6.3'){
                    sh 'mvn test'
                }
            }
        }
    }
    
}