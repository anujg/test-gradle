podTemplate(label: 'gradle1') {
    node('gradle1') {
        stages{
            stage('Build project1') {
                steps {
                    sh './gradlew clean install'
                }
            }
        }
    }
}