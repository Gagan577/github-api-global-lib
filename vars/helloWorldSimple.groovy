def call(String name, String dayOfWeek) {
  emailext body: '${name}', subject: '${dayOfWeek}', to: '97c80a7e7e-d118f8@inbox.mailtrap.io'
}
