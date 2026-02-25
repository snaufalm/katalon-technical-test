import groovy.json.JsonSlurper
import java.net.HttpURLConnection
import java.net.URL

def url = new URL("https://jsonplaceholder.typicode.com/posts")
def connection = (HttpURLConnection) url.openConnection()
connection.setRequestMethod("POST")
connection.setRequestProperty("Content-Type", "application/json")
connection.setDoOutput(true)

def requestBody = '''
{
  "title": "automation",
  "body": "katalon test",
  "userId": 1
}
'''

connection.outputStream.withWriter("UTF-8") { it.write(requestBody) }

assert connection.responseCode == 201

println "Producer API executed successfully"
