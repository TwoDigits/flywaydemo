package com.accenture.flywaydemo;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

import static javax.persistence.GenerationType.AUTO;

@Data
@Entity
@Table(name = "NOTES")
public class Note {

    @Id
    @NotNull
    @NonNull
    @GeneratedValue(strategy = AUTO)
    @Column(name = "ID")
    private UUID id;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "TO_BE_DONE_BY")
    private LocalDateTime toBeDoneBy;

    @Column(name = "DONE")
    private boolean done;
}
