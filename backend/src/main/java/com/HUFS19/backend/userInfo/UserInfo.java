package com.HUFS19.backend.userInfo;

import com.HUFS19.backend.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserInfo {
    @Id
    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;
    private String userIcon;
    private String introduce;
    private String nickname;

}
