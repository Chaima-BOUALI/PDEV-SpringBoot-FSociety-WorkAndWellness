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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "EVENTS")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Table(name = "EVENT_TABLE")
public class Events implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvent;
	@Column(length = 1000)
	private String nameEvent;
	@Column(length = 1000)
	private String EventDescription;
	@Column(length = 1000)
	private int EventAttendent;
	@Column(length = 1000)
	private int MaxEventAttendent;
	@Temporal(TemporalType.DATE)
	private Date dateEvent;
	
	private int idImage;
	@Column(length = 1000)
	@JsonIgnore
	private String imageName;
	@Column(length = 1000)
	@JsonIgnore
	private String imageType;
	@Column(length = 1000)
	@JsonIgnore
	private String imageURL;
	@Lob
	@JsonIgnore
	private byte[] dataImage;
	@ManyToMany
	@JsonIgnore
	Set<Reservation> reservations;
	@ManyToMany
	@JsonIgnore
	Set<Subscription> subscriptions;
	@ManyToMany
	@JsonIgnore
	Set<Subscription> partnerships;
	@ManyToMany
	@JsonIgnore
	Set<User> users;

}
