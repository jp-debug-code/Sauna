pipeline {
    agent any
    tools {
        // Mavenの設定名を指定
        maven 'Maven'
    }

    stages {
        stage('Build') {
            steps {
                // ビルドの実行
                script {
                    // 文字コードをUTF-8に設定してビルド
                    bat 'mvn clean package -Dfile.encoding=UTF-8'
                }
            }
        }

        stage('Test') {
            steps {
                // テストの実行
                script {
                    // 文字コードをUTF-8に設定してテスト
                    bat 'npx playwright test $test_directory'
                }
            }
        }

        stage('Deploy') {
            steps {
                // デプロイの実行
                echo 'Deploying...'
            }
        }
    }

    post {
        success {
            script {
                def githubRepoUrl='https://github.com/jp-debug-code/Sauna.git'
                def slackmessage="Build!:tada:\nGitHub Repository: $githubRepoUrl"
                slackSend(color: 'good', message: slackmessage,, charset: 'SJIS')
            }
        }
        failure {
            // 失敗時の処理（Slack通知）
            slackSend(color: 'danger', message: "Build failed! :fire:")
        }
    }
}
