package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.CommentNews;


public interface ICommentNewsService {

	CommentNews addCommentNews (CommentNews commentNews) ;
	CommentNews updateCommentNews(CommentNews commentNews) ;
	boolean deleteCommentNews(long idCommN);
	List<CommentNews> retrieveAllCommentNews();
	CommentNews retrieveCommentNewsById(long idCommN);
}
