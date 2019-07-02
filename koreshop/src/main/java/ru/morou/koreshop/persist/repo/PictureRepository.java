package ru.morou.koreshop.persist.repo;

import ru.morou.koreshop.persist.model.Picture;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * PictureRepository
 */
public interface PictureRepository extends JpaRepository<Picture, Long> {

    
}