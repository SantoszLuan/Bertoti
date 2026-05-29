package org.example.ui;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Movie;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class MovieService {

    private static final String API_URL =
            "http://localhost:8080/movies";

    // Objeto responsável por converter JSON em objeto Java e objeto Java em JSON
    private final ObjectMapper mapper =
            new ObjectMapper();

    //Busca os filmes
    public List<Movie> getMovies() {

        try {

            HttpURLConnection conn =
                    (HttpURLConnection)
                            new URL(API_URL).openConnection();

            conn.setRequestMethod("GET");

            //Resposta da API
            InputStream response =
                    conn.getInputStream();

            // Converte o JSON recebido em array de filmes
            Movie[] movies =
                    mapper.readValue(response, Movie[].class);

            return Arrays.asList(movies);

        } catch (Exception e) {

            // Mostra erro
            e.printStackTrace();

            // Retorna lista vazia em caso de erro
            return List.of();
        }
    }

    //Adiciona
    public void addMovie(Movie movie) {
        sendWithBody("POST", API_URL, movie);
    }

    //Atualiza
    public void updateMovie(Long id, Movie movie) {
        sendWithBody("PUT", API_URL + "/" + id, movie);
    }

    //Deleta
    public void deleteMovie(Long id) {

        try {

            HttpURLConnection conn =
                    (HttpURLConnection)
                            new URL(API_URL + "/" + id)
                                    .openConnection();

            conn.setRequestMethod("DELETE");

            conn.getInputStream();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendWithBody(
            String method,
            String urlStr,
            Movie movie
    ) {

        try {

            // Abre conexão com a URL do filme específico
            HttpURLConnection conn =
                    (HttpURLConnection)
                            new URL(urlStr)
                                    .openConnection();

            conn.setRequestMethod(method);

            conn.setRequestProperty(
                    "Content-Type",
                    "application/json"
            );

            conn.setDoOutput(true);

            String json =
                    mapper.writeValueAsString(movie);

            OutputStream os =
                    conn.getOutputStream();

            os.write(json.getBytes());

            os.flush();

            conn.getInputStream();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}