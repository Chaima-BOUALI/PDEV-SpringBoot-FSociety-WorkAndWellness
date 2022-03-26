package tn.esprit.spring.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class CommentNews {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCommN;
	private int likeNumberComment;
	private String descriptionComment;
	@Temporal(TemporalType.DATE)
	private Date DateComment;
	private boolean stateComment;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "news_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private News news;

	public News getUser() {
		return news;
	}

	public void setUser(News user) {
		this.news = user;
	}

	public long getIdCommN() {
		return idCommN;
	}

	public void setIdCommN(long idCommN) {
		this.idCommN = idCommN;
	}

	public int getLikeNumberComment() {
		return likeNumberComment;
	}

	public void setLikeNumberComment(int likeNumberComment) {
		this.likeNumberComment = likeNumberComment;
	}

	public String getDescriptionComment() {
		return descriptionComment;
	}

	public void setDescriptionComment(String descriptionComment) {
		this.descriptionComment = descriptionComment;
	}

	public Date getDateComment() {
		return DateComment;
	}

	public void setDateComment(Date dateComment) {
		DateComment = dateComment;
	}

	public boolean isStateComment() {
		return stateComment;
	}

	public void setStateComment(boolean stateComment) {
		this.stateComment = stateComment;
	}

	public CommentNews() {
		super();
	}

	public CommentNews(long idCommN, int likeNumberComment, String descriptionComment, Date dateComment,
			boolean stateComment, News news) {
		super();
		this.idCommN = idCommN;
		this.likeNumberComment = likeNumberComment;
		this.descriptionComment = descriptionComment;
		DateComment = dateComment;
		this.stateComment = stateComment;
		this.news = news;
	}

	@Override
	public String toString() {
		return "CommentNews [idCommN=" + idCommN + ", likeNumberComment=" + likeNumberComment + ", descriptionComment="
				+ descriptionComment + ", DateComment=" + DateComment + ", stateComment=" + stateComment + ", news="
				+ news + "]";
	}

}
