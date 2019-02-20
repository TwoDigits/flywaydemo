package com.accenture.flywaydemo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

import static javax.persistence.GenerationType.AUTO;
import static lombok.AccessLevel.PRIVATE;

@Entity
@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
@Table(name = "NOTES")
public class Note {

    private static final long serialVersionUID = 1L;

    @Id
    @NotNull
    @NonNull
    @GeneratedValue(strategy = AUTO)
    @Column(name = "ID")
    private UUID id;

    @Column(name = "TEXT")
    private String text;

    @Column(name = "ASSIGNEE")
    private String assignee;

    @Column(name = "TO_BE_DONE_BY")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    private LocalDateTime toBeDoneBy;

    @Column(name = "DONE")
    private boolean done;
}
