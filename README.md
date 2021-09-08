# Getting Started

This project talks about publishing messages on Notice boards. Here we have 2 notice boards:
1. Teachers Notice Board : Only teachers can post any messages on it.
2. Students Notice Board : Only students and teachers can post notice on it.

It is not recommented to publish and consume a message from the same topic in an application since it from cyclic dependency so messages are ready to be consumed before they are published. So, we will take help of Kafka CLI in order to produce and consume messages from the application.

### Steps to create a topic using Kafka CLI:

1. To start zookeeper & Kafka server in docker container run following command:
   `docker-compose up`
2. Open a new terminal & switch to Kafka server. Run the below command to do so:
   `docker exec -it kafka bash`
3. To create topic named 'teacher-notice-board'
   ```
     /usr/bin/kafka-topics .bash --create --bootstrap-server localhost:9092 --topic teacher-notice-board --partitions 2
   ```

   Verify the created topic:
   ```
   /usr/bin/kafka-topics .bash --list --bootstrap-server localhost:9092
   ```

### Kafka Producer

#### Publish message using application on `teacher-notice-board` topic & consume message using Kafka CLI

a. Run the application

b. Trigger the API:
   ```
   POST http://localhost:9001/publish-on-teacher-notice-board?message=Good Morning Teachers!
   ```

c. To see the published message, run the Kafka consumer from Kafka CLI:
   ```
    /usr/bin/kafka-console-consumer .bash --bootstrap-server localhost:9092 --topic teacher-notice-board --from-beginning
   ```
You should be able to see the published message.

### Kafka Consumer

#### Publish message on **student-notice-board** topic using Kafka CLI & consume via application

a. Run the application to consume the published message.

b. Run following command on Kafka CLI to publish to the topic:
```
/usr/bin/kafka-console-producer .bash --broker-list localhost:9092 --topic student-notice-board
```

Now publish any message in Kafka ClI (producer console). You should see the message you have passed in application
console.

