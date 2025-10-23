package org.example;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public final class GeminiAi {
    private static final String APIKEY = "AIzaSyBXeOYWWfGXA_kTwgdDUxSRXO2UNVgtF84";


    public static String getResponse(String text){
        Client client = Client.builder().apiKey(APIKEY).build();
        String model = "gemini-2.5-flash";
        GenerateContentResponse response = client.models.generateContent( model,text,null);
        return response.text();
    }
}
