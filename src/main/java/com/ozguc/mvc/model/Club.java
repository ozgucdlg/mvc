package com.ozguc.mvc.models;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
@Table(name="clubs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Club {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="title")
    private String title;

    @Column(name="photo_url")
    private String photoUrl;

    @Column(name="content")
    private String content;


    @Column(name="createdOn")
    @CreationTimestamp
    private LocalDateTime createdOn;

    @Column(name="updatedOn")
    @CreationTimestamp
    private LocalDateTime updateOn;





}
