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
                sh 'maven --version'
            }
        }
        stage('Frond End')
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