package tn.esprit.spring.entities.tokens;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.spring.entities.User;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Entity(name = "PASSWORD_RESET_TOKEN")
@Table(name = "PASSWORD_RESET_TOKEN_TABLE")
public class PasswordResetToken implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id
	    @Column(name = "TOKEN_ID")
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pwd_reset_token_seq")
	    @SequenceGenerator(name = "pwd_reset_token_seq", allocationSize = 1)
	    private int id;

	    @NaturalId
	    @Column(name = "TOKEN_NAME", nullable = false, unique = true)
	    private String token;

	    @Column(name = "EXPIRY_DT", nullable = false)
	    private Instant expiryDate;

	    @OneToOne(targetEntity = User.class, fetch = FetchType.EAGER)
	    @JsonIgnore
	    @JoinColumn(nullable = false, name = "USER_ID")
	    private User user;
}
