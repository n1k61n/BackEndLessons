package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class UserBot extends TelegramLongPollingBot {
    @Override
    public void onUpdateReceived(Update update) {
        if(update.hasMessage()) {
            String message = update.getMessage().getText();
            Long chatId = update.getMessage().getChatId();

            GeminiAI geminiAI = new GeminiAI();
            String text = "";
            if (message.startsWith("/question"))
                text = geminiAI.getResponse(message.substring(9) + ". Qisa formatda cavabi ver.");
            else if (message.startsWith("/translate"))
                text = geminiAI.getResponse(message.substring(10) + ". Tərcümə et.");


            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(String.valueOf(chatId));
            sendMessage.setText(text);

//            SendPhoto sendPhoto = new SendPhoto();
//            sendPhoto.setChatId(chatId);
//            InputFile inputFile = new InputFile();
//            inputFile.setMedia("https://cdn.pixabay.com/photo/2024/05/26/10/15/bird-8788491_1280.jpg");
//            sendPhoto.setPhoto(inputFile);


            try {
                execute(sendMessage);
            }
            catch (TelegramApiException e) {
                throw new RuntimeException(e);
            }

        }
    }

    @Override
    public String getBotUsername() {
        return "test_some_telegram_bot";
    }


    @Override
    public String getBotToken(){
        return "8172041598:AAG0Stjd1W4z_Wg7xX9haSATTrESP0kX2o0";
    }
}