import groovy.json.JsonSlurper
import java.net.HttpURLConnection
import java.net.URL

def url = new URL("https://jsonplaceholder.typicode.com/posts/1")
def connection = (HttpURLConnection) url.openConnection()
connection.setRequestMethod("GET")

assert connection.responseCode == 200

def response = connection.inputStream.text
def json = new JsonSlurper().parseText(response)

assert json.id == 1

println "Consumer API validation successful"
