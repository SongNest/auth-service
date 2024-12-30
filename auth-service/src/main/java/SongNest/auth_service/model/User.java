package SongNest.auth_service.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user")
public class User  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer UserID;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String Email;

    @Column(name = "password")
    private String Password;

    @Column(name="subscription_plan")
    private String SubscriptionPlan;



}