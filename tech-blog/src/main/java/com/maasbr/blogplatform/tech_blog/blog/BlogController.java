package com.maasbr.blogplatform.tech_blog.blog;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("auth/blogs")
@RequiredArgsConstructor
public class BlogController {

    private final BlogRepository blogRepository;
    private final BlogService blogService;

    @PostMapping
    public Blog create(@RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    //GET query: /blogs?page=1&size=10
    @GetMapping
    public Page<Blog> getAllBlogs(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "2") int size
    ) {
        return blogService.getAllBlogs(page, size);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        blogRepository.deleteById(id);
    }
}
