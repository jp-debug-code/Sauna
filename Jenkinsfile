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
           stage('Install Chromium') {
            steps {
                script {
                    // Chromiumのインストール
                    powershell '''
                        $url = 'https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb'
                        $file = 'chrome.deb'
                        Invoke-WebRequest -Uri $url -OutFile $file
                        sudo dpkg -i $file
                        sudo apt-get install -f
                        rm $file
                    '''
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
