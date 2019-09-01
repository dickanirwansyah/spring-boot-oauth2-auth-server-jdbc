# contoh spring boot oauth2 auth server
teknologi yang digunakan : <br/>
1. Spring Framework <br/>
2. Spring Framework Cloud OAuth2<br/>
3. H2 database<br/>
4. JDBC<br/>
<br/>


# cara menjalankan
1. run aplikasi `dicka@dicka$ mvn clean spring-boot:run` 
2. kemudian jalankan di port `localhost:9999` , berikut ini cara request tokennya<br/>
   `curl -X POST -vu AxaClientId:admin 'http://localhost:9999/oauth/token?username=agent01&password=admin&grant_type=password'`
   
   *note*
   <table>
    <thead>
      <tr>
        <th>no</th>
        <th>nama</th>
        <th>penjelasannya</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>1.</td>
        <td>AxaClientId</td>
        <td>ini adalah client id</td>
      </tr>
      <tr>
        <td>2.</td>
        <td>admin</td>
        <td>admin adalah client secretnya</td>
      </tr>
      <tr>
        <td>3.</td>
        <td>/oauth/token</td>
        <td>ini adalah pattern url request oauth</td>
      </tr>
      <tr>
        <td>4.</td>
        <td>agent01</td>
        <td>adalah usernamenya</td>
      </tr>
      <tr>
        <td>5.</td>
        <td>admin</td>
        <td>adalah passwordnya</td>
      </tr>
      <tr>
        <td>6.</td>
        <td>password</td>
        <td>grant_type nya</td>
      </tr>
    </tbody>
   </table>
   
 *Jika berhasil maka outputnya akan seperti dibawah ini*

```
* Hostname was NOT found in DNS cache
* Trying 127.0.0.1...
* Connected to localhost (127.0.0.1) port 9999 (#0)
* Server auth using Basic with user 'AxaClientId'
> POST /oauth/token?username=agent01&password=admin&grant_type=password HTTP/1.1
> Authorization: Basic QXhhQ2xpZW50SWQ6YWRtaW4=
> User-Agent: curl/7.35.0
> Host: localhost:9999
> Accept: */*
> 
< HTTP/1.1 200 
< Pragma: no-cache
< Cache-Control: no-store
< X-Content-Type-Options: nosniff
< X-XSS-Protection: 1; mode=block
< X-Frame-Options: DENY
< Content-Type: application/json;charset=UTF-8
< Transfer-Encoding: chunked
< Date: Sun, 01 Sep 2019 09:40:59 GMT
< 
{
  "access_token":"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1NjczNTA4NTksInVzZXJfbmFtZSI6ImFnZW50MDEiLCJhdXRob3JpdGllcyI6WyJST0xFX1NZU1RFTUFETUlOIl0sImp0aSI6IjhjYWY4MGI3LTU5ZWItNGQ1Ny05ZThkLTJiNDAzMjIy
       MmRjOSIsImNsaWVudF9pZCI6IkF4YUNsaWVudElkIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl19
      .moYEbrHNvF9WmBvx6ZJY2wsyP7uYn9dIJa9USHbdwqBhDB2IIJKJvfvZ3LhcDBsJqrbePYh-3qMSzmDNExz0OGg8Urgf
      -LoyetnKb-W0EFZOE1MvSsehx65XDB4JrWqKLDlr_2WMGWv9JaBEH9w4fiI5XnyfFCL-kh5KNl9azBA8ermGczCW0wzPr-FNCmH8bsNcN4aL6QfsqfzI04Vp-jWeZO49zsxxuIEjVFVV2Sl-J7K843LSa5fkb84q-3Gsk67Z1Z7xmSO8p_R9XWvXbpoOrauAqNK5K7k9PXpewPY3B38_JfbtZwGqwnxZT2jdRB18u0jMpACQGKty-T2M0g",
  "token_type":"bearer",
  "refresh_token":"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX25hbWUiOiJhZ2VudDAxIiwic2NvcGUiOlsicmVhZCIsIndyaXRlIl0s
      ImF0aSI6IjhjYWY4MGI3LTU5ZWItNGQ1Ny05ZThkLTJiNDAzMjIyMmRjOSIsImV4cCI6MTU2NzM1MDg1OSwiYXV0aG9yaXRpZXMiOlsiUk9MRV9TWVNURU1BRE1JTiJdLCJqdGkiOiIyZG
      RhMTg5OS1mNGE1LTQ1OTEtOGIzNy05NmNmZjRmYjBiY2EiLCJjbGllbnRfaWQiOiJBeGFDbGllbnRJZCJ9.jESjTl6W0EF4e0QAFZM-Z-V8npblmHHN* Connection #0 to host localhost left intact
      8qkdzJ800JhOX3qjrbvL5ZzqP8yl9oaU2vaCFrNRuSaiWxL6JGzQIe9Fcm5lQA1R11bqarBysmcVyx6Q4Q9e3YahN8OiF0VtuCO_MzFgcwRhX9g7QYCqiPXJfUqTLfihzFdiPmHE7GNsQ10gDulqvgejAJqhfMp-7RWjdJ7h1dDfLhuae53a0V7O-iOjJxB5-aXIuifjOZbLQwjap7eDBSugPulsQdtjhBDKfF4yGEmLUY7-vhvsIshZVvjvDFof3FAYL03obTju3OD3xgMt_GaQv-D_6swpz1Y_j27ksjzz8odFFGZD_w",
"expires_in":19999,
"scope":"read write",
"jti":"8caf80b7-59eb-4d57-9e8d-2b4032222dc9"
}
   
   
   
