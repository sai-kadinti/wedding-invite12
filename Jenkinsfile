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
                sh 'scp /var/lib/jenkins/workspace/wedd/target/wedding-invitation-1.0-SNAPSHOT.war ubuntu@172.31.87.13:/var/lib/tomcat10/webapps/test.war'
            }
        }
    }
}
