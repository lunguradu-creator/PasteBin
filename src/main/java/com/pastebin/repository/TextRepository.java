package com.pastebin.repository;

import com.pastebin.model.TextFragment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<TextFragment, Long> {
}