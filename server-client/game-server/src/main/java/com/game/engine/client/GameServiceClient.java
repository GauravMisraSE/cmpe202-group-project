package com.game.engine.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Sushant on 10-11-2016.
 */
public class GameServiceClient extends HttpClient{

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget baseTarget = client.target("http://localhost:8080/myapp");
        WebTarget messagesTarget = baseTarget.path("messages");
        WebTarget singleMessageTarget = messagesTarget.path("{messageId}");

        WebTarget target = singleMessageTarget.resolveTemplate("messageId", 1);
        Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
        Response response = builder.get();
        /*Message message = response.readEntity(Message.class);
        System.out.println(message.getMessage());

        //Other way of doing same thing
        Message message2 = singleMessageTarget
                .resolveTemplateFromEncoded("messageId", 2)
                .request(MediaType.APPLICATION_JSON)
                .get(Message.class);
        System.out.println(message2.getMessage());


        //Get all messages
        String allMessages = messagesTarget
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Message> messages = mapper.readValue(allMessages,
                    TypeFactory.defaultInstance().constructCollectionType(List.class,
                            Message.class));
            for (Message msg :messages) {
                System.out.println(msg.getMessage());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Message newMessage = new Message(0, "Client message", "Susha");

        Entity<Message> json = Entity.json(newMessage);
        Response postResponse = messagesTarget
                .request(MediaType.APPLICATION_JSON)
                .post(json);

        if(postResponse.getStatus() == Response.Status.CREATED.getStatusCode()) {
            Message createdMessage = postResponse.readEntity(Message.class);
            System.out.println(createdMessage.getMessage());
        }*/
    }

}
