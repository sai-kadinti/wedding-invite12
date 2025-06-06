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
    }
}
