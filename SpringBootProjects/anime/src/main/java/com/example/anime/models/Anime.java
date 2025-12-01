package com.example.anime.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * Represents an Anime or Movie entry from the website listing.
 */
@Entity
@Table(name = "anime_title")
@Data // Generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor // Generates a constructor with no parameters
@AllArgsConstructor // Generates a constructor with all parameters
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "genre")
    private String genre; // e.g., "Adventure", "Action"

    @Column(name = "description", columnDefinition = "TEXT")
    private String description; // Short synopsis (e.g., "After 30 days of travel...")

    @Column(name = "status")
    private String status; // e.g., "Active Movie", "Recently Added"

    @Column(name = "episode_count")
    private Integer episodeCount; // Total number of episodes

    @Column(name = "current_views")
    private Long currentViews; // The "9141" or "19.141 Viewes" metric

    @Column(name = "release_year")
    private Integer releaseYear;
}