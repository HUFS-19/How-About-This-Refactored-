package com.HUFS19.backend.service;

import com.HUFS19.backend.repository.tag.TagRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class TagService {
    private final TagRepository tagRepository;

    public TagService(TagRepository tagRepository){
        this.tagRepository=tagRepository;
    }

    public List<String> getTags(int productId){
        return tagRepository.findByProductId(productId);
    }
}
