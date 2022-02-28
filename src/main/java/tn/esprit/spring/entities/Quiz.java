package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity(name = "QUIZES")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Table(name = "QUIZ_TABLE")
public class Quiz implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idQuiz; 
	@Column(length = 3000)
	private String nameQuiz; 
	@Column(length = 3000)
	private String descriptionQuiz; 
	@Enumerated(EnumType.STRING)
	private TypeQuiz TypeQuiz; 
	private int idDocument;
	@Column(length = 3000)
	private String documentName;
	@Column(length = 3000)
	private String documentType;
	@Column(length = 3000)
	@Lob
	private byte[] dataDocument;
	private int idImage;
	@Column(length = 3000)
	private String imageName;
	@Column(length = 3000)
	private String imageType;
	@Column(length = 3000)
	private String imageURL;
	@Lob
	private byte[] dataImage;
	@Temporal(TemporalType.DATE)
	private Date dateQuiz; 
	@ManyToMany
    Set<User> users;
	
}
