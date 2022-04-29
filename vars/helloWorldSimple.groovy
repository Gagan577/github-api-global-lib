def call(String name, String dayOfWeek) {
  emailext body: '''<!DOCTYPE html>
<html>
<head>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>

<h2>HTML Table</h2>

<table>
  <tr>
    <th>$BUILD_NUMBER</th>
    <th>$BUILD_NUMBER</th>
    <th>$BUILD_NUMBER</th>
  </tr>
  <tr>
    <td>$PROJECT_NAM</td>
    <td>$PROJECT_NAM</td>
    <td>$PROJECT_NAM</td>
  </tr>
  <tr>
    <td>$PROJECT_NAM Moctezuma</td>
    <td>$PROJECT_NAM Chang</td>
    <td>$PROJECT_NAM</td>
  </tr>
  <tr>
    <td>$PROJECT_NAM</td>
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
