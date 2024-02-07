package com.HUFS19.backend;

import com.HUFS19.backend.category.Category;
import com.HUFS19.backend.category.CategoryRepository;
import com.HUFS19.backend.category.CategoryRepositoryImp;
import com.HUFS19.backend.chatRoom.ChatRoomRepository;
import com.HUFS19.backend.chatRoom.ChatRoomRepositoryImp;
import com.HUFS19.backend.comment.CommentRepository;
import com.HUFS19.backend.comment.CommentRepositoryImp;
import com.HUFS19.backend.message.MessageRepository;
import com.HUFS19.backend.message.MessageRepositoryImp;
import com.HUFS19.backend.product.ProductRepositoryImp;
import com.HUFS19.backend.product.ProductRepository;
import com.HUFS19.backend.product.ProductService;
import com.HUFS19.backend.productImg.ProductImgRepository;
import com.HUFS19.backend.productImg.ProductImgRepositoryImp;
import com.HUFS19.backend.snsType.SnsTypeRepository;
import com.HUFS19.backend.snsType.SnsTypeRepositoryImp;
import com.HUFS19.backend.tag.TagRepository;
import com.HUFS19.backend.tag.TagRepositoryImp;
import com.HUFS19.backend.user.UserRepository;
import com.HUFS19.backend.user.UserRepositoryImp;
import com.HUFS19.backend.userInfo.UserInfoRepository;
import com.HUFS19.backend.userInfo.UserInfoRepositoryImp;
import com.HUFS19.backend.userLike.UserLikeRepository;
import com.HUFS19.backend.userLike.UserLikeRepositoryImp;
import com.HUFS19.backend.userSns.UserSnsRepository;
import com.HUFS19.backend.userSns.UserSnsRepositoryImp;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em){
        this.em=em;
    }

    @Bean
    public ProductService service(){
        return new ProductService(productRepository());
    }

   //Repository
    @Bean
    public CategoryRepository categoryRepository(){return new CategoryRepositoryImp(em);
    }
    @Bean
    public ChatRoomRepository chatRoomRepository(){return new ChatRoomRepositoryImp(em);
    }
    @Bean
    public CommentRepository commentRepository(){return new CommentRepositoryImp(em);
    }
    @Bean
    public MessageRepository messageRepository(){return  new MessageRepositoryImp(em);
    }
    @Bean
    public ProductRepository productRepository(){return  new ProductRepositoryImp(em);
    }
    @Bean
    public ProductImgRepository productImgRepository(){return new ProductImgRepositoryImp(em);
    }
    @Bean
    public SnsTypeRepository snsTypeRepository(){return new SnsTypeRepositoryImp(em);
    }
    @Bean
    public TagRepository tagRepository(){return new TagRepositoryImp(em);
    }
    @Bean
    public UserRepository userRepository(){return new UserRepositoryImp(em);
    }
    @Bean
    public UserInfoRepository userInfoRepository(){return new UserInfoRepositoryImp(em);
    }
    @Bean
    public UserLikeRepository userLikeRepository(){return new UserLikeRepositoryImp(em);
    }
    @Bean
    public UserSnsRepository userSnsRepository(){return new UserSnsRepositoryImp(em);
    }

}
