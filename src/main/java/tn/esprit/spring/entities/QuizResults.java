package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "QUIZE_RESULTS")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Table(name = "QUIZ_RESULT_TABLE")
public class QuizResults implements Serializable {/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idQuizresults; 
	@Column(length = 3000)
	private String nameResults; 
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
	@ManyToMany
    Set<User> users;
}
