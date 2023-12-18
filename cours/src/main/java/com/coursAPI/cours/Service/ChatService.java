package com.coursAPI.cours.Service;

import com.coursAPI.cours.Model.Chat;
import com.coursAPI.cours.Repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    @Autowired
    ChatRepository chatRepository;
    public Chat save(Chat chat){
        return this.chatRepository.save(chat);
    }
}
