package com.HUFS19.backend.dto.chatRoom;

import com.HUFS19.backend.repository.user.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatRoomDetail {
    private int id;
    private String userId;
    private String inquirerId;
    private int categoryId;
    private int productId;
}
