package com.microservices.postservice.service;

import com.microservices.postservice.dto.PostDto;

public interface PostService {
    PostDto write(PostDto postDto) throws Exception;

    PostDto readPostById(Long postId);

    Iterable<PostDto> getAllPosts();

    Iterable<PostDto> getAllPostsByStatus(String status);

    Iterable<PostDto> getPostsByUserId(String userId);

    PostDto deletePost(Long postId);

    Iterable<PostDto> getPostsByKeyword(String keyword);

    Iterable<PostDto> getPostsByCategory(String category);

    void rental(Long postId);

    void rollbackPost(Long postId);
}
