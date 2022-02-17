job('NodeJS Docker example') {
   scm{
    git {
        remote {
                url('https://github.com/madhii/ecomm.git')
                credentials('git')
            }
            branch('*/' + 'sonarqube')
        }
   }
    steps {
        dockerBuildAndPublish {
            repositoryName('1514150/hexaware')
            tag('${GIT_REVISION,length=9}')
            registryCredentials('docker')
            forcePull(false)
            forceTag(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}
