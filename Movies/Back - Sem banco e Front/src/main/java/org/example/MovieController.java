package org.example;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieRepository repository;

    public MovieController(MovieRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Movie> getMovies() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Filme não encontrado"));
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return repository.save(movie);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(
            @PathVariable Long id,
            @RequestBody Movie newMovie
    ) {

        return repository.findById(id)
                .map(movie -> {

                    movie.setName(newMovie.getName());
                    movie.setGenre(newMovie.getGenre());
                    movie.setDirector(newMovie.getDirector());
                    movie.setReleaseYear(newMovie.getReleaseYear());

                    return repository.save(movie);

                }).orElseThrow(() ->
                        new RuntimeException("Filme não encontrado"));
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id) {
        repository.deleteById(id);
    }
}