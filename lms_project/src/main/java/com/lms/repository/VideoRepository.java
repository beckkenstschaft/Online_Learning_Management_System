package com.lms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lms.model.Video;
import java.util.List;

public interface VideoRepository extends JpaRepository<Video, Long> {
    List<Video> findByCourseId(Long courseId);
}
