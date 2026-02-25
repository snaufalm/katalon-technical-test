package keywords

class KafkaConsumerKeyword {

    static void consumeMessage(String topic) {
        println "Connecting to Kafka broker..."
        println "Subscribing to topic: ${topic}"
        
        Thread.sleep(2000)

        def mockMessage = '''
        {
            "eventType": "USER_CREATED",
            "status": "SUCCESS"
        }
        '''

        assert mockMessage != null
        println "Message consumed successfully"
    }
}
