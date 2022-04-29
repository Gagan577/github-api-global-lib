def call(String name, String dayOfWeek) {
  emailext body: '$BUILD_NUMBER', subject: '$BUILD_STATUS', to: '97c80a7e7e-d118f8@inbox.mailtrap.io'
}
