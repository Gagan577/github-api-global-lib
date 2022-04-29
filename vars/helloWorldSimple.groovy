def call(String name, String dayOfWeek) {
  emailext body: '''



<table>
  <tr>
    <th>$name</th>
    <th>$name</th>
    <th>$name</th>
  </tr>
  <tr>
    <td>$dayOfWeek</td>
    <td>$dayOfWeek</td>
    <td>$PROJECT_NAME</td>
  </tr>
  <tr>
    <td>$PROJECT_NAME Moctezuma</td>
    <td>$PROJECT_NAM Chang</td>
    <td>$PROJECT_NAM</td>
  </tr>
  <tr>
    <td>$PROJECT_NAME</td>
    <td>Roland Mendel</td>
    <td>Austria</td>
  </tr>
  <tr>
    <td>Island Trading</td>
    <td>Helen Bennett</td>
    <td>UK</td>
  </tr>
  <tr>
    <td>Laughing Bacchus Winecellars</td>
    <td>Yoshi Tannamuri</td>
    <td>Canada</td>
  </tr>
  <tr>
    <td>Magazzini Alimentari Riuniti</td>
    <td>Giovanni Rovelli</td>
    <td>Italy</td>
  </tr>
</table>

</body>
</html>

''', subject: '$PROJECT_NAME', to: '97c80a7e7e-d118f8@inbox.mailtrap.io'
}
