pipeline
{
    agent any
    stages
    {
        stage ('Download')
        {
            steps
            {
                git 'https://github.com/sai-kadinti/wedding-invite12.git'
            }
        }
        stage ('Build')
        {
            steps
            {
                sh 'mvn clean package'
            }
        }
        stage ('Deploy')
        {
            steps
            {
                deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: '1c5bbabc-311e-4c9c-a834-441d8cc64ebe', path: '', url: 'http://172.31.87.13:8888/')], contextPath: 'wedding', war: '**/*.war'
            }
        }
    }
}
