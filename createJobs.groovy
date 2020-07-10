pipelineJob('iwxxmconverter-api') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/cb-steven-matison/iwxxmconverter'
                    }
                    branch 'netbeans'
                }
            }
        }
    }
}