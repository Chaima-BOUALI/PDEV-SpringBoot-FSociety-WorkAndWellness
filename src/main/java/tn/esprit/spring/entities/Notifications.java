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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity(name = "NOTIFICATIONS")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Table(name = "NOTIFICATIONS_TABLE")
public class Notifications implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNotifications; 
	@Column(length = 3000)
	private String NotificationObject; 
	@Column(length = 3000)
	private String NotificationContent; 
	@Temporal(TemporalType.DATE)
	private Date dateNotification; 
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
}
