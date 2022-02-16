job('DockerBuildandPublishDSL') {
    description('Build and Publish docker image')
     scm {
        git {
        remote {
                url('https://github.com/madhii/ecomm.git')
                credentials('git')
            }
            branch('*/' + 'sonar')
        }
    }

    steps {
        dockerBuildAndPublish {
            repositoryName('1514150/hexaware')
            registryCredentials('docker')
        }
    }
}
