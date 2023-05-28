def call(Map stageParams) {

   #checkout{[
    #$class: 'GitSCM',
     #branches: [[name: stageParams.branch ]],
      #userRemoteConfigs: [[ url: stageParams.url ]]

    checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/mateenshaik/Aws_project2.git']])    
    ]}
}
