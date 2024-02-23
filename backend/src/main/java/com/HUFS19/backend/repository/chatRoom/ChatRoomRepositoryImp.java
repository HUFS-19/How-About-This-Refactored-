package com.HUFS19.backend.repository.chatRoom;

import com.HUFS19.backend.dto.chatRoom.ChatRoomDetail;
import com.HUFS19.backend.dto.product.ProductImgDto;
import com.HUFS19.backend.repository.productImg.QProductImg;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.Projection;

import java.util.List;
import java.util.Optional;

//findChatRoomByUserId() DTO 컬럼만 추출하면 userId, inquirerId null로 뜨는 문제

public class ChatRoomRepositoryImp implements ChatRoomRepository{
    private final EntityManager em;
    private final JPAQueryFactory query;
    private QChatRoom chatRoom = QChatRoom.chatRoom;


    public ChatRoomRepositoryImp(EntityManager em){
        this.em=em;
        query = new JPAQueryFactory(em);
    }

    @Override
    public int save(ChatRoom chatRoom) {
        em.persist(chatRoom);
        return chatRoom.getId();
    }

    @Override
    public Optional<ChatRoom> findById(int id) {
        return Optional.ofNullable(em.find(ChatRoom.class, id));
    }

    @Override
    public Optional<ChatRoom> findByProductId(int productId) {
        List<ChatRoom> result= em.createQuery("select c from ChatRoom c where c.product.id = :productId", ChatRoom.class)
                .setParameter("productId", productId)
                .getResultList();
        return result.stream().findAny();
    }

    @Override
    public List<ChatRoom> findByUserId(String userId) {
        return query.selectFrom(chatRoom).where((chatRoom.user.id.eq(userId))
                        .or(chatRoom.inquirer.id.eq(userId)))
                .fetch();
//
//        List<ChatRoomDetail>chatRoomDtos=query
//                .select(Projections.bean(
//                        ChatRoomDetail.class,
//                        chatRoom.id,
//                        chatRoom.user.id,
//                        chatRoom.inquirer.id,
//                        chatRoom.category.categoryId,
//                        chatRoom.product.id))
//                .from(chatRoom)
//                .where((chatRoom.user.id.eq(userId))
//                        .or(chatRoom.inquirer.id.eq(userId)))
//                .fetch();
//        return chatRoomDtos;
    }

    @Override
    public Optional<ChatRoomDetail> findByProductInquirer(int productId, String inquirerId) {
        return Optional.ofNullable(
                query.select(Projections.bean(ChatRoomDetail.class,
                chatRoom.id,
                chatRoom.user.id,
                chatRoom.inquirer.id,
                chatRoom.category.categoryId,
                chatRoom.product.id
                )).from(chatRoom).where((chatRoom.product.id.eq(productId)).and(chatRoom.inquirer.id.eq(inquirerId))).fetchOne()
                    );
    }
}
