package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "FORUM")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Table(name = "FORUM_TABLE")
public class Forum implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idForum;
	@Column(length = 3000)
	private String forumName;
	@Column(length = 3000)
	private String forumDescription;
	  @Temporal(TemporalType.DATE)
	  @JsonIgnore
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
	@OneToMany(mappedBy = "forum")
	@JsonIgnore
	private Set<Subjects> subject;
	@ManyToMany
	@JsonIgnore
	@JoinTable(name = "forum_user", joinColumns = { @JoinColumn(name = "idforum") }, inverseJoinColumns = {
			@JoinColumn(name = "idUser") })
	Set<User> users;

}
