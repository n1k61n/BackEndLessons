package com.example.anime.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "anime_episode")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Episode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Use a ManyToOne relationship to link the episode back to its anime title
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "anime_id", nullable = false)
    private Anime anime;

    @Column(name = "episode_number", nullable = false)
    private Integer episodeNumber; // e.g., 1, 2, 3... 18

    @Column(name = "title")
    private String title; // Episode-specific title (e.g., "The Price of Ambition")

    @Column(name = "video_url", columnDefinition = "TEXT")
    private String videoUrl; // The link to the video file or stream

    @Column(name = "runtime_minutes")
    private Integer runtimeMinutes; // e.g., 23
}