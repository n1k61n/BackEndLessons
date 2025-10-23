package org.example;

import com.google.genai.*;
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class GeminiAI {
    private final static String APIKEYS = "AIzaSyBXeOYWWfGXA_kTwgdDUxSRXO2UNVgtF84";



    public String getResponse(String text){
        Client client = Client.builder().apiKey(APIKEYS).build();
        String model = "gemini-2.5-flash";
        GenerateContentResponse response = client.models.generateContent(model, text,null);
        return response.text();
    }


}
