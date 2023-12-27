pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Gradleを使用してプロジェクトをビルド
                script {
                    def buildDir = 'build' // ビルド結果のディレクトリ
                    sh "./gradlew build -PbuildDir=${buildDir}"
                }
            }
        }}
