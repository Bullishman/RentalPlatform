package com.microservices.postservice.dto;

import com.microservices.postservice.entity.CommentEntity;
import com.microservices.postservice.entity.ImageEntity;
import lombok.Builder;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class PostDto {
    private Long id;
    private Long postId;
    private String userId;
    private String postType;
    private String category;
    private Long rentalPrice;
    private String title;
    private String content;
    private String startDate;
    private String endDate;
    private String createdAt;
    private String writer;
    private String status;
    private List<MultipartFile> multipartFiles;
    private List<CommentEntity> comments;
    private List<ImageEntity> images;

    @Builder
    public PostDto(
        Long id,
        Long postId,
        String userId,
        String postType,
        String category,
        Long rentalPrice,
        String title,
        String content,
        String startDate,
        String endDate,
        String createdAt,
        String writer,
        String status,
        List<MultipartFile> multipartFiles,
        List<CommentEntity> comments,
        List<ImageEntity> images
    ) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.postType = postType;
        this.category = category;
        this.rentalPrice = rentalPrice;
        this.title = title;
        this.content = content;
        this.startDate = startDate;
        this.endDate = endDate;
        this.createdAt = createdAt;
        this.writer = writer;
        this.status = status;
        this.multipartFiles = multipartFiles;
        this.images = images;
        this.comments = comments;
    }
}
