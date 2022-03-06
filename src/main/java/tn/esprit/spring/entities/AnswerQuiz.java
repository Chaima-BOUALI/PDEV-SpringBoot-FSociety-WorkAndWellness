package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "ANSWER_QUIZ")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Table(name = "QUIZ_ANSWER_TABLE")
public class AnswerQuiz implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAnswerQuiz; 
	@Column(length = 3000)
	
	private String nameAnswer; 
	@Column(length = 3000)

	private String AnswerContent;
	private Date dateEvent;
	@JsonIgnore
	private int idDocument;
	@Column(length = 3000)
	@JsonIgnore
	private String documentName;
	@Column(length = 3000)
	@JsonIgnore
	private String documentType;
	@Column(length = 3000)
	@JsonIgnore
	@Lob
	private byte[] dataDocument;
	@JsonIgnore
	private int idImage;
	@Column(length = 3000)
	@JsonIgnore
	private String imageName;
	@Column(length = 3000)
	@JsonIgnore
	private String imageType;
	@Column(length = 3000)
	@JsonIgnore
	private String imageURL;
	@Lob
	@JsonIgnore
	private byte[] dataImage;
    @ManyToOne
	@JsonIgnore
	@JoinColumn(name="idAnswer")
	private QuestionsQuiz questions ;

}
