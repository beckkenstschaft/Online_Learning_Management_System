package com.lms.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.lms.model.Video;
import com.lms.repository.VideoRepository;

@Controller
@RequestMapping("/videos")
public class VideoController {
    @Autowired
    private VideoRepository videoRepository;

    @GetMapping("/{courseId}")
    public String listVideos(@PathVariable Long courseId, Model model) {
        model.addAttribute("videos", videoRepository.findByCourseId(courseId));
        return "videos";
    }

    @PostMapping("/upload")
    public String uploadVideo(@ModelAttribute Video video) {
        videoRepository.save(video);
        return "redirect:/videos/" + video.getCourseId();
    }
}
