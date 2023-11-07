package com.example.firstproject.service;

import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.entity.Article;
import com.example.firstproject.entity.Comment;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class CommentService {
    private final CommentRepository commentRepository;

    private final ArticleRepository articleRepository;



    @Transactional(readOnly = true)
    public List<CommentDto> comments(Long articleId) {
        // 조회 댓글 목록
        List<Comment> comments = commentRepository.findByArticleId(articleId);
        // 변환: Entity -> DTO
        // 방법1
        List<CommentDto> dtos = new ArrayList<CommentDto>();
        for (int i = 0; i < comments.size(); i++) {
            Comment c = comments.get(i);
            // CommentDto dto = CommentDto.createCommentDto(c);
            CommentDto dto = new CommentDto(c.getId(), c.getArticle().getId(), c.getNickname(), c.getBody());
            dtos.add(dto);
        }
        // 방법2
//        List<CommentDto> dtos = comments.stream()
//                .map(CommentDto::createCommentDto)    // :: => 클래스이름::정적메서드이름
//                .collect(Collectors.toList());

        // 방법3 -> 화살표 함수 + return
//        return commentRepository.findByArticleId(articleId)
//                .stream()
//                .map(comment -> CommentDto.createCommentDto(comment))
//                .collect(Collectors.toList());

        // 반환
        return dtos;
    }

    public CommentDto create(Long articleId, CommentDto dto) {
        // 게시글 조회 및 예외 발생
        Article article = articleRepository.findById(articleId).orElseThrow(() -> new IllegalIdentifierException("딧글 생성 실패!"));
        // 댓글 Entity 생성
        Comment comment = Comment.createComment(dto, article);

        // 댓글 Entity를 DB에 저장
        Comment created = commentRepository.save(comment);
        // Dto로 변경하여 반환
        return CommentDto.createCommentDto(created);

    }


    public CommentDto update(Long id, CommentDto dto) {
        Comment target = commentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("댓글 수정 실패!"));
        // 댓글 수정
        target.patch(dto);

        // DB로 갱신
        Comment updated = commentRepository.save(target);

        // 댓글 Entity를 DTO로 변환 및 반환
        return CommentDto.createCommentDto(updated);
    }


    public CommentDto delete(Long id) {
        // 댓글 조회 및 예외 발생
        Comment target = commentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("댓글 삭제 실패! 대상이 없습니다."));

        // 댓글 삭제
        commentRepository.delete(target);

        // 삭제된 댓글을 Dto로 변환
        return CommentDto.createCommentDto(target);
    }
}
