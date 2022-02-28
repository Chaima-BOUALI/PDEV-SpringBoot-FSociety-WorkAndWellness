package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.scheduling.annotation.EnableScheduling;

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
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idDocument;
	@Column(length = 3000)
	private String documentName;
	@Column(length = 3000)
	private String documentType;
	@Column(length = 3000)
	@Lob
	private byte[] dataDocument;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idImage;
	@Column(length = 3000)
	private String imageName;
	@Column(length = 3000)
	private String imageType;
	@Column(length = 3000)
	private String imageURL;
	@Lob
	private byte[] dataImage;

    @OneToOne(mappedBy = "answers")
    private QuestionsQuiz questions ;

}
