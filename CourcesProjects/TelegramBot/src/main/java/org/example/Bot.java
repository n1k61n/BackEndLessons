package org.example;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.User;




public class Bot extends TelegramLongPollingBot {
    @Override
    public String getBotUsername() {
        return "TwnarBot";
    }

    @Override
    public String getBotToken() {
        return "8112718233:AAHMp5p7BsX7FxNJ6jpqrGOgBBKHcsMNkes";
    }

    @Override
    public void onUpdateReceived(Update update) {
        String msg = update.getMessage().getText();
        String user = update.getMessage().getFrom().getFirstName();
        System.out.println(msg + " wrote "+ user);
    }
}
