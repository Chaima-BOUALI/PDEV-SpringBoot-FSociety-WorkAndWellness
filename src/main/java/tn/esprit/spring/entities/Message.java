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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity(name = "MESSAGES")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Table(name = "MESSAGES_TABLE")
public class Message implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMessage;
	private int idSender; 
	private int idReciever; 
	@Enumerated(EnumType.STRING)
	private MessageType MessageType; 
	@Column(length = 3000)
	private String sender;
	@Column(length = 3000)
	private String content; 
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
	@ManyToMany
	@JsonIgnore
    Set<User> users;
}
