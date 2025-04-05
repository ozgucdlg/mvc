package com.ozguc.mvc.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name="clubs")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Club {
    @jakarta.persistence.Id
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
