node {
  stage("trigger-central") {
    build job: 'provectus.com/hydro-central/master', parameters: [
      [$class: 'StringParameterValue',
      name: 'PROJECT',
      value: 'gateway'
      ],
      [$class: 'StringParameterValue',
      name: 'BRANCH',
      value: env.BRANCH_NAME
      ]
    ]
  }
}
