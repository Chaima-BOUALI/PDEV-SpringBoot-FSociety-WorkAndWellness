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
@Entity(name = "RECLAMATIONS")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling

public class Reclamation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReclamation; 
	@Temporal(TemporalType.DATE)
	private Date dateReclamation; 
	@Column(length = 1000)
	private String ObjectReclamation; 

	private int idImage;
	@Column(length = 1000)
	private String imageName;
	@Column(length = 1000)
	private String imageType;
	@Column(length = 1000)
	private String imageURL;
	@Lob
	private byte[] dataImage;
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="id")
	private User user ;
	


}
