package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EnableScheduling
@Table(name = "USER_TABLE")
@Entity(name = "USER")
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", allocationSize = 1)
    private int idUser; 
    @NaturalId
    @Column(name = "EMAIL", unique = true)
  //  @NotBlank(message = "User email cannot be null")
    private String email;

    @Column(name = "USERNAME", unique = true)
  //  @NullOrNotBlank(message = "Username can not be blank")
    private String username;

    @Column(name = "PASSWORD")
   // @NotNull(message = "Password cannot be null")
    private String password;

    @Column(name = "FIRST_NAME")
   // @NullOrNotBlank(message = "First name can not be blank")
    private String firstName;
    
    @Column(name = "ADDRESSE")
  //  @NullOrNotBlank(message = "adresse can not be blank")
    private String adresse;

    @Column(name = "LAST_NAME")
  //  @NullOrNotBlank(message = "Last name can not be blank")
    private String lastName;
    
    @Column(name = "phone_Number")
  //  @NullOrNotBlank(message = "Last name can not be blank")
    private String phoneNumber;
    
    @Column(name = "postal_Code")
   // @NullOrNotBlank(message = "Last name can not be blank")
    private String postalCode;

    @Column(name = "IS_ACTIVE", nullable = false)
    private Boolean active;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    @JoinTable(name = "USER_AUTHORITY", joinColumns = {
            @JoinColumn(name = "USER_ID", referencedColumnName = "USER_ID")}, inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")})
    private Set<Role> roles = new HashSet<>();

    @Column(name = "IS_EMAIL_VERIFIED", nullable = false)
    
    private Boolean isEmailVerified;
    @OneToMany(targetEntity=Reclamation.class, mappedBy="user")
    @JsonIgnore
	private List<Reclamation> reclamations = new ArrayList<>();
    public int getUserId() {
		return idUser;
	}

}
    