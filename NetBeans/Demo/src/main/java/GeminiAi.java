
import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;


/**
 *
 * @author mamed
 */
public class GeminiAi {
    private final static String APİKEYS = "AIzaSyA2YkzExnvfzDdJQlv59XLR01krIlAIUfk";
    
    public String getResponse(String message){
        Client client = Client.builder().apiKey(APİKEYS).build();
        String model = "gemini-2.5-flash";
        GenerateContentResponse response = client.models.generateContent(model, message, null);
        return response.text();
    }


}
