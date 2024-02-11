package com.HUFS19.backend.repository.chatRoom;

import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class ChatRoomRepositoryImp implements ChatRoomRepository{
    private EntityManager em;

    public ChatRoomRepositoryImp(EntityManager em){
        this.em=em;
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
}
