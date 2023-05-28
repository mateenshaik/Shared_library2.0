def call(Map stageparams){

    checkout{[
        $class: 'GitSCM',
        branches: [{name: stagePrams.branch }],
        userRemoteConfigs: [{url: stageparams.url}]
    ]



    }
}
