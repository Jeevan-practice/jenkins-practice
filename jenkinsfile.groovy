pipeline
{
    agent none
    stages
    {
        stage('Back end')
        {
            agent {
                docker {image 'maven:latest'}
            }
            steps
            {
                sh 'mvn --version'
            }
        }
        stage('Front End')
        {
            agent{
                docker{ image 'node:latest'}

            }
            steps
            {
                sh 'node -v'
            }
        }
    }
}
